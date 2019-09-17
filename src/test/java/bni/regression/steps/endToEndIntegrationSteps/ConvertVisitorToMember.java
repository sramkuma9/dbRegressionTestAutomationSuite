package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.CaptureScreenShot;
import bni.regression.libraries.common.CurrentDateTime;
import bni.regression.libraries.common.LaunchBrowser;
import bni.regression.libraries.common.ReadWriteExcel;
import bni.regression.libraries.ui.Login;
import bni.regression.libraries.ui.SignOut;
import bni.regression.pageFactory.*;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class ConvertVisitorToMember {
    public static WebDriver driver;
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();
    private CurrentDateTime currentDateTime = new CurrentDateTime();
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private BNIConnect bniConnect;
    private AddAVisitor addAVisitor;
    private CaptureScreenShot captureScreenShot;
    private ViewEditVisitorsList viewEditVisitorsList;
    private EnterNewApplication enterNewApplication;
    private Add add;
    public  String [] convertToMemberDetails = new String [8];

    @Before
    public void setup() throws Exception {
//        System.out.println("Cucumber test execution has started...");
//        driver = launchBrowser.getDriver();
//        launchBrowser.invokeBrowser();
//        login.loginToBni();
    }

    @After
    public void tearDown() throws Exception {
        //signOut.signOutBni();
    }

    // Scenario: Navigate to Add a Visitor page
    // Scenario: Navigate to Add a Visitor page
    @Given("I am on the Enter New Application page")
    public void I_am_on_the_Enter_New_Application_page() throws Exception {
        //System.out.println("Cucumber test execution has started...");
        driver = launchBrowser.getDriver();
        launchBrowser.invokeBrowser();
        login.loginToBni();
        System.out.println("I am on the BNI home page");
        TimeUnit.SECONDS.sleep(2);
        driver = launchBrowser.getDriver();
        bniConnect = new BNIConnect(driver);
        bniConnect.navigateMenu("Operations,Region");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Navigating to add a visitor page");
        bniConnect = new BNIConnect(driver);
        bniConnect.selectItemFromManageVisitor("View/Edit Visitors List");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList = new ViewEditVisitorsList(driver);
        viewEditVisitorsList.clickFromStartDateField();
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectYear("2019");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectMonth("Jan");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectDateFromDatePicker("15");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.clickToEndDateField();
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectYear("2019");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectMonth("Sep");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.selectDateFromDatePicker("10");
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.clickGoButton();
        TimeUnit.SECONDS.sleep(2);
        viewEditVisitorsList.clickConvertToMemberButton();
        TimeUnit.SECONDS.sleep(2);
    }

    @When("I search emailid and click add and enter the below details and click save")
    public void I_search_emailid_and_click_add_and_enter_the_below_details_and_click_save(DataTable convertToMember) throws Exception {
        Integer i =2;
        for (Map<String, String> data : convertToMember.asMaps(String.class, String.class)) {
            readWriteExcel.setExcelFile("src/test/resources/inputFiles/testInput.xlsx");
            String visitorEmailId = readWriteExcel.getCellData("addVisitor",0,i);
            enterNewApplication = new EnterNewApplication(driver);
            enterNewApplication.enterEmail(visitorEmailId);
            TimeUnit.SECONDS.sleep(2);
            enterNewApplication.clickSearchButton();
            TimeUnit.SECONDS.sleep(2);
            enterNewApplication.clickAddButton();
            TimeUnit.SECONDS.sleep(2);
            add = new Add(driver);
            add.clickApplicationDateField();
            TimeUnit.SECONDS.sleep(2);
            add.selectVisitYear(data.get("applicationYear"));
            TimeUnit.SECONDS.sleep(2);
            add.selectVisitMonth(data.get("applicationonth"));
            TimeUnit.SECONDS.sleep(2);
            add.selectDateFromDatePicker(data.get("applicationDay"));
            TimeUnit.SECONDS.sleep(2);
            add.selectRegion(data.get("region"));
            TimeUnit.SECONDS.sleep(2);
            add.selectChapter(data.get("chapter"));
            TimeUnit.SECONDS.sleep(2);
            add.selectProfession(data.get("profession"));
            TimeUnit.SECONDS.sleep(2);
            add.selectSpeciality(data.get("speciality"));
            TimeUnit.SECONDS.sleep(2);
            add.enterFirstName(data.get("firstName"));
            TimeUnit.SECONDS.sleep(2);
            add.enterLastName(data.get("lastName"));
            TimeUnit.SECONDS.sleep(2);
            add.enterAddressLine1(data.get("addressLine1"));
            TimeUnit.SECONDS.sleep(2);
            add.selectCountry(data.get("country"));
            TimeUnit.SECONDS.sleep(2);
            add.enterPhone(data.get("phone"));
            TimeUnit.SECONDS.sleep(2);
            add.selectPaymentOption(data.get("paymentOption"));
            TimeUnit.SECONDS.sleep(2);
            add.selectMemberShipOption(data.get("membershipOption"));
            TimeUnit.SECONDS.sleep(2);
            add.clickSubmitButton();
            TimeUnit.SECONDS.sleep(4);
            enterNewApplication = new EnterNewApplication(driver);
            enterNewApplication.enterEmail(visitorEmailId);
            TimeUnit.SECONDS.sleep(2);
            enterNewApplication.clickSearchButton();
            TimeUnit.SECONDS.sleep(3);
            String day = data.get(("visitDay"));
            String year = data.get(("visitYear"));
            String month = data.get(("visitMonth"));
            SimpleDateFormat inputFormat = new SimpleDateFormat("MMM");
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputFormat.parse(month));
            SimpleDateFormat outputFormat = new SimpleDateFormat("MM");
            String expectedDate = day + "/" + outputFormat.format(cal.getTime()) + "/" + year;
            enterNewApplication = new EnterNewApplication(driver);
            convertToMemberDetails = enterNewApplication.getSearchResults();
            captureScreenShot = new CaptureScreenShot(driver);
            captureScreenShot.takeSnapShot(driver, "convertVisitorToMember");
            assertEquals("Visit date is not correct", expectedDate, convertToMemberDetails[0] );
            assertEquals("First Name is not correct", data.get("firstName"), convertToMemberDetails[1] );
            assertEquals("Last Name is not correct", data.get("lastName"), convertToMemberDetails[2] );
            assertEquals("Region is not correct", data.get("region"), convertToMemberDetails[3] );
            assertEquals("Chapter is not correct", data.get("chapter"), convertToMemberDetails[4] );
            assertEquals("Company Name is not correct", data.get("companyName"), convertToMemberDetails[5] );
            i++;
        }
    }
}