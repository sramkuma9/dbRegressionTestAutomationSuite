package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.*;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import bni.regression.pageFactory.AddAVisitor;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddVisitorForExistingIndividual {

    public static WebDriver driver;
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private BNIConnect bniConnect;
    private AddAVisitor addAVisitor;
    private CaptureScreenShot captureScreenShot;

    @Before
    public void setup() throws Exception {
//        System.out.println("Cucumber test execution has started...");
//        driver=launchBrowser.getDriver();
//        launchBrowser.invokeBrowser();
//        login.loginToBni();
        //fixedDateTime =  currentDateTime.dateTime();
    }

    @After
    public void tearDown() throws Exception{
        //signOut.signOutBni();
    }

    // Scenario: Navigate to Add a Visitor page
    @Given("I am on the BNI home page")
    public void I_am_on_the_BNI_home_page() throws Exception {
        System.out.println("Cucumber test execution has started...");
        driver = launchBrowser.getDriver();
        launchBrowser.invokeBrowser();
        login.loginToBni();
        System.out.println("I am on the BNI home page");
        TimeUnit.SECONDS.sleep(2);
        driver = launchBrowser.getDriver();
        bniConnect = new BNIConnect(driver);
        captureScreenShot = new CaptureScreenShot(driver);
        bniConnect.navigateMenu("Operations,Region");
        TimeUnit.SECONDS.sleep(2);
    }

    @When("I enter a valid existing email id and click search and Add button and I enter the below details and click the save button")
    public void When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button(DataTable addPVVisitor) throws Exception{
        for (Map<String, String> data : addPVVisitor.asMaps(String.class, String.class)) {
            System.out.println("Navigating to add a visitor page");
            bniConnect = new BNIConnect(driver);
            bniConnect.selectItemFromManageVisitor("Add a Visitor");
            System.out.println("I am on the Add a visitor page");
            addAVisitor = new AddAVisitor(driver);
            TimeUnit.SECONDS.sleep(3);
            addAVisitor.enterEmail(data.get("emailId"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickSearchButton();
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickAddButton();
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectChapter(data.get("chapter"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectProfession(data.get("profession"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectSpeciality(data.get("speciality"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectInvitedBy(data.get("person"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickVisitDateField();
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectVisitYear(data.get("visitYear"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectVisitMonth(data.get("visitMonth"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectDateFromDatePicker(data.get("visitDay"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectVisitorTitle(data.get("title"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.enterVisitorFirstName(data.get("firstName"));
            TimeUnit.SECONDS.sleep(1);
            addAVisitor.enterVisitorLastName(data.get("lastName"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.enterCompanyName(data.get("companyName"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.selectVisitorCountry(data.get("country"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.enterVisitorPhoneNumber(data.get("phone"));
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickSaveButton();
            TimeUnit.SECONDS.sleep(12);
        }
    }

    @Then("visitor details saved sucessfully")
    public void visitor_details_saved_sucessfully() throws Exception{
        System.out.println("Visitor details added sucessfully.");
    }

    @And("I sucessfully sign out from BNI")
    public void I_sucessfully_sign_out_from_BNI() throws Exception{
        TimeUnit.SECONDS.sleep(2);
        signOut.signOutBni();
    }
}