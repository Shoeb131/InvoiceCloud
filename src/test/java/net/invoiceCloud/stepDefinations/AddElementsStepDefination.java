package net.invoiceCloud.stepDefinations;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.invoiceCloud.hooks.ApplicationHooks;
import net.invoiceCloud.pages.RandomElements;
import net.invoiceCloud.utilities.DriverFactory;
import net.invoiceCloud.utilities.ElementUtil;

public class AddElementsStepDefination {

	RandomElements randomElements = new RandomElements(DriverFactory.getDriver());

	@Given("I navigate to the system")
	public void i_navigate_to_the_system() {
		DriverFactory.getDriver().get(ElementUtil.eu.getData("url"));
		ApplicationHooks.scenario.log(" - The Application launched successfully.");
	}

	@Given("I add random numer of Elements to the page")
	public void i_elements_to_the_page() {
		randomElements.AddNumberOfElements();
	}

	@Then("I validate Element count matches with the added elements")
	public void i_validate_element_count_matches_with_the_added_elements() {

		assertTrue(randomElements.matchNumberOfElementsOfThePage(), "Added element count matches as expected ");
	}

}
