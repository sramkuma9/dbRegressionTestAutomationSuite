package bni.regression.runners;

import bni.regression.libraries.common.LaunchBrowser;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "json:src/test/executionReports/cucumber/DBTestAutomationReport.json", "pretty", "html:src/test/executionReports/cucumber/DBAutomationHTMLReport" },
        features = {"src/test/resources/features"},
        glue = {"bni.regression.steps.endToEndIntegrationSteps"})
public class PriorityCases {

}

