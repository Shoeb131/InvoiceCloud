package net.invoiceCloud.pages;

import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.invoiceCloud.utilities.GenericUtil;

public class RandomElements {

	@FindBy(css = "button[onclick='addElement()']")
	private WebElement addElementButton;
	@FindBy(css = "button[onclick='deleteElement()']")
	private List<WebElement> addedDeleteButtonList;

	private Logger log = LogManager.getLogger(this.getClass().getName());
	private WebDriver driver;
	int randNumber;

	public RandomElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void AddNumberOfElements() {
		log.info("Adding random number element");
		randNumber = getARandomInteger();
		for (int i = 0; i < randNumber; i++) {
			GenericUtil.gu.clickOnAWebElement(driver, addElementButton, 1);
		}

	}

	public boolean matchNumberOfElementsOfThePage() {
		log.info("Verifying the element count");
		return addedDeleteButtonList.size() == randNumber;
	}

	private int getARandomInteger() {
		Random random = new Random();
		return random.nextInt(20) + 1;
	}

}
