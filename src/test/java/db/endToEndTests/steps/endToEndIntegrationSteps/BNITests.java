package db.endToEndTests.steps.endToEndIntegrationSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import db.endToEndTests.bniCommonLibraries.Login;
import db.endToEndTests.bniCommonLibraries.SignOut;
import db.endToEndTests.utils.CaptureScreenShot;
import db.endToEndTests.utils.LaunchBrowser;
import db.endToEndTests.utils.PDFReader;
import db.endToEndTests.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;

public class BNITests {

    public static WebDriver driver;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private PDFReader pdfReader = new PDFReader();

    @Before
    public void setup() throws Exception {
        System.out.println("Cucumber test execution has started...");
        driver=launchBrowser.getDriver();
        launchBrowser.invokeBrowser();
        login.loginToBni();
    }

    @After
    public void tearDown() throws Exception{
        signOut.signOutBni();
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
    public void I_click_Login_button() throws IOException {
        System.out.println("Login button is clicked");
    }

    @Then("Then a message Your username or password is incorrect is displayed")
    public void a_message_Your_username_or_password_is_incorrect_is_displayed() throws IOException{
        System.out.println("Login button is clicked");
    }
}