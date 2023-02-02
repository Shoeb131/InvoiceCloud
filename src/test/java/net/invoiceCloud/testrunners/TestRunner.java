package net.invoiceCloud.testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/net/invoiceCloud/features", glue = {
		"net.invoiceCloud.stepDefinations", "net/invoiceCloud/hooks" },
		tags="@Functional",
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class TestRunner extends AbstractTestNGCucumberTests {

}

