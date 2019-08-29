package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.CurrentDateTime;
import bni.regression.libraries.common.LaunchBrowser;
import bni.regression.libraries.common.ReadPDFReader;
import bni.regression.libraries.common.ReadWritePropertyFile;
import bni.regression.pageFactory.AddAVisitor;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class SearchAndAddVisitor {

    public static WebDriver driver;
    private ReadWritePropertyFile readWritePropertyFile = new ReadWritePropertyFile();
    private CurrentDateTime currentDateTime = new CurrentDateTime();
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private ReadPDFReader readPdfReader = new ReadPDFReader();
    private BNIConnect bniConnect;
    private AddAVisitor addAVisitor;
    public static String fixedDateTime;

    @Before
    public void setup() throws Exception {
//        System.out.println("Cucumber test execution has started...");
//        driver=launchBrowser.getDriver();
//        launchBrowser.invokeBrowser();
//        login.loginToBni();
          fixedDateTime =  currentDateTime.dateTime();
    }

    @After
    public void tearDown() throws Exception{
        //signOut.signOutBni();
    }

    // Scenario: Navigate to Add a Visitor page

    @Given("I am on the BNI home page")
    public void I_am_on_the_BNI_home_page() throws Exception {
        System.out.println("Cucumber test execution has started...");
        driver=launchBrowser.getDriver();
        launchBrowser.invokeBrowser();
        login.loginToBni();
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
        addAVisitor = new AddAVisitor(driver);
        String pageTitle = addAVisitor.getPageTitle();
        assertEquals("not able to navigate to Add A visitor page", addAVisitor.getPageTitle(), "Add a Visitor" );
    }

    // Scenario: Search with email id and name

    @Given("I am on the Add a visitor page")
    public void I_am_on_the_Add_a_visitor_page() throws Exception{
        System.out.println("I am on the Add a visitor page");
    }

    @And("I enter a valid email id")
    public  void I_enter_a_valid_email_id() throws Exception{
        String visitorDateTime = (fixedDateTime.replaceAll("/","").replaceAll(":","").replaceAll(" ", ""));
        //readWritePropertyFile.writePropertyFile(dateTime);
        addAVisitor = new AddAVisitor(driver);
        TimeUnit.SECONDS.sleep(1);
        addAVisitor.enterEmail("autotest" + visitorDateTime + "@gmail.com");
    }

    @And("click search and click search by name")
    public  void click_search_and_click_search_by_name() throws Exception{
        TimeUnit.SECONDS.sleep(2);
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickSearchButton();
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.clickSearchByNameButton();
        TimeUnit.SECONDS.sleep(2);
    }

    @And("I enter the First and Last name")
    public  void I_enter_the_First_and_Last_name() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.enterFirstName("Auto");
        addAVisitor.enterLastName("Test");
        TimeUnit.SECONDS.sleep(1);
    }

    @And("I click the search button")
    public void I_click_the_search_button() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 5);
        addAVisitor = new AddAVisitor(driver);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
        driver.findElement(By.name("submit")).click();
        System.out.println("Successfully clicked the search button");
        TimeUnit.SECONDS.sleep(3);
    }

    @Then("create new button is displayed and clicked")
    public  void create_new_button_is_displayed() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickCreateNewButton();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Successfully clicked the create new button");
    }

    // Scenario: Add a new visitor

    @Given("I am on the add a new visitor page and is displayed")
    public void  I_am_on_the_add_a_new_visitor_page_and_is_displayed() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        String pageTitle = addAVisitor.getPageTitle();
        assertEquals("not able to navigate to Add A visitor page", addAVisitor.getPageTitle(), "Add a Visitor" );
    }

    @When("I select a proffession")
    public void I_select_a_proffession() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectProfession("Information Technology");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select speciality")
    public void select_speciality() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectSpeciality("Information Technology");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select person")
    public void select_person() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectInvitedBy("BNI");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("enter a valid date")
    public void enter_a_valid_date() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickVisitDateField();
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectDateFromDatePicker("12");
    }

    @And("select title, first and last name")
    public void select_title_first_and_last_name() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectVisitorTitle("Mr");
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.enterVisitorFirstName("Auto");
        TimeUnit.SECONDS.sleep(1);
        addAVisitor.enterVisitorLastName("Test");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select the country")
    public void select_the_country() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectVisitorCountry("Antarctica");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("enter the phone")
    public void enter_the_phone() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.enterVisitorPhoneNumber("9999999999");
        TimeUnit.SECONDS.sleep(2);
    }

    @And("click save button")
    public void click_save_button() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickSaveButton();
        TimeUnit.SECONDS.sleep(3);
    }
}