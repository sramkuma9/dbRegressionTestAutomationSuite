package bni.regression.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "json:target/DBTestAutomationReport.json", "pretty", "html:target/DBAutomationHTMLReport" },
        features = {"src/test/resources/features"},
        glue = {"db.endToEndTests.steps.endToEndIntegrationSteps"})
public class EndToEndIntergationRunner{
}

