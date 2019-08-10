package db.endToEndTests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:build/cucumber-report.json"},
        features = {"src/test/resources/features"},
        glue = {"db.endToEndtests.steps.endToEndIntegrationSteps"})
public class EndToEndIntergationRunner {
}

