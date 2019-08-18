package bni.regression.runners;

import bni.regression.libraries.common.CurrentDateTime;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "json:src/test/executionReports/cucumber/DBTestAutomationReport.json", "pretty", "html:src/test/executionReports/cucumber/DBAutomationHTMLReport" },
        features = {"src/test/resources/features"},
        glue = {"bni.regression.steps.endToEndIntegrationSteps"})
public class PriorityCases {
}

