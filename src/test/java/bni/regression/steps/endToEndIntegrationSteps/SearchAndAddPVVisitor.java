package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.*;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import bni.regression.pageFactory.AddAVisitor;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.assertEquals;

public class SearchAndAddPVVisitor {

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
        bniConnect.navigateMenu("Operations,Chapter");
    }

    @And("I navigate to Operations -> Region -> Add a visitor")
    public void I_navigate_to_Operations_Region_Add_visitor() throws Exception {
        System.out.println("Navigating to add a visitor page");
        bniConnect = new BNIConnect(driver);
        bniConnect.selectItemFromManageVisitor("Add a Visitor");
        addAVisitor = new AddAVisitor(driver);
        String pageTitle = addAVisitor.getPageTitle();
        assertEquals("not able to navigate to Add A visitor page", addAVisitor.getPageTitle(), "Add a Visitor" );
    }


    @And("I enter a valid \"([^\"]*)\"")
    public void I_enter_a_valid_emailId(String emailId) throws Exception{
        System.out.println("I am on the Add a visitor page");
        addAVisitor.enterEmail(emailId);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("click search and click Add button")
    public void click_search_and_click_Add_button() throws Exception {
        addAVisitor.clickSearchButton();
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.clickAddButton();
        TimeUnit.SECONDS.sleep(2);
    }

    @And("I_am_on_the_add_a_new_visitor_page_and_is_displayed")
    public void I_am_on_the_add_a_new_visitor_page_and_is_displayed() throws Exception {
        addAVisitor = new AddAVisitor(driver);
        String pageTitle = addAVisitor.getPageTitle();
        assertEquals("not able to navigate to Add A visitor page", addAVisitor.getPageTitle(), "Add a Visitor" );
    }

    @And("I select a \"([^\"]*)\" and \"([^\"]*)\"")
    public void I_select_a_chapter_and_proffession(String chapter, String proffession) throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectChapter(chapter);
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectProfession(proffession);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select \"([^\"]*)\"  in speciality")
    public void select_speciality_in_speciality(String speciality) throws Exception {
        addAVisitor.selectSpeciality(speciality);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select \"([^\"]*)\" in person")
    public void person_in_person(String person) throws Exception {
        addAVisitor.selectInvitedBy(person);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("enter a \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" in dateField")
    public void enter_a_validDay_and_validMonth_and_validYear_in_dateField(String day, String month, String year) throws Exception {
        addAVisitor.clickVisitDateField();
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectVisitYear(year);
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectVisitMonth(month);
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectDateFromDatePicker(day);
        TimeUnit.SECONDS.sleep(2);
        }
    @And("select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"  in resp fields")
    public void select_title_firstName_lastName_companyName(String title, String firstName, String lastName, String companyName) throws Exception {
        addAVisitor.selectVisitorTitle(title);
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.enterVisitorFirstName(firstName);
        TimeUnit.SECONDS.sleep(1);
        addAVisitor.enterVisitorLastName(lastName);
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.enterCompanyName(companyName);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select the \"([^\"]*)\" in country field")
    public void select_the_country_in_country_field(String country) throws Exception {
        addAVisitor.selectVisitorCountry(country);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select the \"([^\"]*)\" in phone field")
    public void select_the_phone_in_phone_field(String phone) throws Exception {
        addAVisitor.enterVisitorPhoneNumber(phone);
        TimeUnit.SECONDS.sleep(2);
    }

    @And("click save button")
    public void click_save_button() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickSaveButton();
        TimeUnit.SECONDS.sleep(3);
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