package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.*;
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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public static String visitorDateTime;
    public String name;
    public  String [] addAVisitorDetails = new String [8];
    public String firstName;
    public String lastName;
    private CaptureScreenShot captureScreenShot;

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
        captureScreenShot = new CaptureScreenShot(driver);
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
        visitorDateTime = (fixedDateTime.replaceAll("/","").replaceAll(":","").replaceAll(" ", ""));
        addAVisitor = new AddAVisitor(driver);
        TimeUnit.SECONDS.sleep(1);
        firstName = readWritePropertyFile.loadAndReadPropertyFile("firstName", "inputFiles/searchAndAddVisitor.properties");
        lastName = readWritePropertyFile.loadAndReadPropertyFile("lastName", "inputFiles/searchAndAddVisitor.properties");
        addAVisitor.enterEmail( firstName + lastName + visitorDateTime + "@gmail.com");
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
        addAVisitor.enterFirstName(readWritePropertyFile.loadAndReadPropertyFile("firstName", "inputFiles/searchAndAddVisitor.properties"));
        addAVisitor.enterLastName(readWritePropertyFile.loadAndReadPropertyFile("lastName", "inputFiles/searchAndAddVisitor.properties"));
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

    @When("I select a chapter and proffession")
    public void I_select_a_proffession() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectChapter(readWritePropertyFile.loadAndReadPropertyFile("chapter", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectProfession(readWritePropertyFile.loadAndReadPropertyFile("proffession", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select speciality")
    public void select_speciality() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectSpeciality(readWritePropertyFile.loadAndReadPropertyFile("speciality", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select person")
    public void select_person() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectInvitedBy(readWritePropertyFile.loadAndReadPropertyFile("invitedBy", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("enter a valid date")
    public void enter_a_valid_date() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickVisitDateField();
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectVisitYear(readWritePropertyFile.loadAndReadPropertyFile("visitYear", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectVisitMonth(readWritePropertyFile.loadAndReadPropertyFile("visitMonth", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.selectDateFromDatePicker(readWritePropertyFile.loadAndReadPropertyFile("visitDay", "inputFiles/searchAndAddVisitor.properties"));
    }

    @And("select title, first and last name and company name")
    public void select_title_first_and_last_name() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectVisitorTitle(readWritePropertyFile.loadAndReadPropertyFile("visitorTitle", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.enterVisitorFirstName(readWritePropertyFile.loadAndReadPropertyFile("firstName", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(1);
        addAVisitor.enterVisitorLastName(readWritePropertyFile.loadAndReadPropertyFile("lastName", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.enterCompanyName(readWritePropertyFile.loadAndReadPropertyFile("companyName", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("select the country")
    public void select_the_country() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.selectVisitorCountry(readWritePropertyFile.loadAndReadPropertyFile("country", "inputFiles/searchAndAddVisitor.properties"));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("enter the phone")
    public void enter_the_phone() throws Exception{
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.enterVisitorPhoneNumber(readWritePropertyFile.loadAndReadPropertyFile("phoneNumber", "inputFiles/searchAndAddVisitor.properties"));
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

    // Scenario: Search the added visitor

    @Given("I am on the Add visitor page")
    public void I_am_on_the_Add_visitor_page() throws Exception{
        TimeUnit.SECONDS.sleep(4);
        System.out.println("I am on the Add a visitor page");
    }

    @When("I search the added visitor using the email id")
    public void search_the_added_visitor_using_the_email_id() throws Exception {
        bniConnect = new BNIConnect(driver);
        TimeUnit.SECONDS.sleep(5);
        bniConnect.selectItemFromManageVisitor("Add a Visitor");
        TimeUnit.SECONDS.sleep(3);
        addAVisitor = new AddAVisitor(driver);
        name = ((readWritePropertyFile.loadAndReadPropertyFile("firstName", "inputFiles/searchAndAddVisitor.properties")) + (readWritePropertyFile.loadAndReadPropertyFile("lastName", "inputFiles/searchAndAddVisitor.properties")));
        addAVisitor.enterEmail(name + visitorDateTime + "@gmail.com");
        TimeUnit.SECONDS.sleep(2);
        addAVisitor.clickSearchButton();
    }

    @Then("the saved record should retrive 2 records with type visit and visitor with correct details")
    public void the_saved_records_should_be_retrived_2_records_with_type_visit_and_visitor_with_correct_details() throws Exception {
        TimeUnit.SECONDS.sleep(3);
        String day = readWritePropertyFile.loadAndReadPropertyFile("visitDay", "inputFiles/searchAndAddVisitor.properties");
        String year = readWritePropertyFile.loadAndReadPropertyFile("visitYear", "inputFiles/searchAndAddVisitor.properties");
        String month = readWritePropertyFile.loadAndReadPropertyFile("visitMonth", "inputFiles/searchAndAddVisitor.properties");
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMM");
        Calendar cal = Calendar.getInstance();
        cal.setTime(inputFormat.parse(month));
        SimpleDateFormat outputFormat = new SimpleDateFormat("MM");
        String expectedDate = day + "/" + outputFormat.format(cal.getTime()) + "/" + year;
        addAVisitor = new AddAVisitor(driver);
        addAVisitorDetails = addAVisitor.getSearchResults();
        captureScreenShot = new CaptureScreenShot(driver);
        captureScreenShot.takeSnapShot(driver, "searchAndAddVisitor");
        assertEquals("Visit date is not correct", expectedDate, addAVisitorDetails[0] );
        assertEquals("First Name is not correct", readWritePropertyFile.loadAndReadPropertyFile("firstName", "inputFiles/searchAndAddVisitor.properties"), addAVisitorDetails[1] );
        assertEquals("Last Name is not correct", readWritePropertyFile.loadAndReadPropertyFile("lastName", "inputFiles/searchAndAddVisitor.properties"), addAVisitorDetails[2] );
        assertEquals("Region is not correct", readWritePropertyFile.loadAndReadPropertyFile("region", "inputFiles/searchAndAddVisitor.properties"), addAVisitorDetails[3] );
        assertEquals("Chapter is not correct", readWritePropertyFile.loadAndReadPropertyFile("chapter", "inputFiles/searchAndAddVisitor.properties"), addAVisitorDetails[4] );
        assertEquals("Company Name is not correct", readWritePropertyFile.loadAndReadPropertyFile("companyName", "inputFiles/searchAndAddVisitor.properties"), addAVisitorDetails[5] );
        addAVisitor = new AddAVisitor(driver);
        addAVisitor.clickCloseButton();
        TimeUnit.SECONDS.sleep(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        TimeUnit.SECONDS.sleep(2);
        signOut.signOutBni();
    }
}