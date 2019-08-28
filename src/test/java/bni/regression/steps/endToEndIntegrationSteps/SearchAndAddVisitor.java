package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.LaunchBrowser;
import bni.regression.libraries.common.ReadPDFReader;
import bni.regression.libraries.common.ReadPropertyFile;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class SearchAndAddVisitor {

    public static WebDriver driver;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private ReadPDFReader readPdfReader = new ReadPDFReader();
    private BNIConnect bniConnect;

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

    // Scenario: Navigate to Add a Visitor page

    @Given("I am on the BNI home page")
    public void I_am_on_the_BNI_home_page() throws Exception {
        System.out.println("I am on the BNI home page");
        TimeUnit.SECONDS.sleep(2);
        driver = launchBrowser.getDriver();
        bniConnect = new BNIConnect(driver);
        bniConnect.navigateMenu("Operations,Region");
    }

    @When("I navigate to Operations -> Region -> Add a visitor")
    public void I_navigate_to_Operations_Region_Add_visitor() throws Exception {
        System.out.println("Navigating to add a visitor page");
        bniConnect = new BNIConnect(driver);
        bniConnect.selectItemFromManageVisitor("Add a Visitor");
    }

    @Then("a pop up window 'Add a Visitor' appears")
    public void a_pop_up_window_Add_a_Visitor_appears() throws IOException{
        System.out.println("Login button is clicked");
    }
}