package db.endToEndTests.steps.endToEndIntegrationSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import db.endToEndTests.utils.BaseClass;
import db.endToEndTests.utils.ReadPropertyFile;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static db.endToEndTests.utils.BaseClass.driver;

public class BNITests extends BaseClass {

    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    @Before
    public void setup() {
        System.out.println("Cucumber test execution has started...");
    }

    @After
    public void tearDown() {
    }

    @Given("I am on the BNI login page")
    public void I_am_on_the_BNI_login_page() throws IOException {
        System.out.println("Login page is displayed");
    }

    @When("I enter an incorrect username and password")
    public void I_enter_an_incorrect_username_and_password() throws IOException {
        System.out.println("Incorrect credentials entered");
    }

    @And("I click Login button")
    public  void I_click_Login_button() throws IOException {
        System.out.println("Login button is clicked");
    }

}
