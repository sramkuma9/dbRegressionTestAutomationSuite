package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.*;
import bni.regression.pageFactory.AddAVisitor;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.DataTable;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class AddAndSearchBrandNewVisitor {

    public static WebDriver driver;
    private ReadWritePropertyFile readWritePropertyFile = new ReadWritePropertyFile();
    private CurrentDateTime currentDateTime = new CurrentDateTime();
    private LaunchBrowser launchBrowser = new LaunchBrowser();
    private Login login = new Login();
    private SignOut signOut = new SignOut();
    private BNIConnect bniConnect;
    private AddAVisitor addAVisitor;
    public static String fixedDateTime;
    public static String visitorDateTime;
    public String name;
    public String[] addAVisitorDetails = new String[8];
    public String firstName;
    public String lastName;
    public List<List<String>> loginSubList;
    private CaptureScreenShot captureScreenShot;
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();

    @Before
    public void setup() throws Exception {
        fixedDateTime = currentDateTime.dateTime();
    }

    @After
    public void tearDown() throws Exception {

    }

    // Scenario: Navigate to Add a Visitor page
    @Given("User navigates to BNI homepage using the below login credentials")
    public void User_navigates_to_BNI_homepage_using_the_below_login_credentials(DataTable loginDetails) throws Exception {
        List<List<String>> login = loginDetails.raw();
        loginSubList = login.subList(1,login.size());
        System.out.println(loginSubList.get(0));

//        for (Integer loginIteration = 1; loginIteration < login.size(); loginIteration++) {
//            for (Integer colIteration = 0; colIteration < 2; colIteration++){
//                String[] splitCredentials = login.get(loginIteration).toString().replace("[", "").replace("]", "").replaceAll(" ", "").split(",");
//                System.out.println(splitCredentials[colIteration]);
//            }
//            //System.out.println("row length is " + splitCredentials.length);
//
//        }
//        driver = launchBrowser.getDriver();
//        launchBrowser.invokeBrowser();
//        login.loginToBni(userName, password);
//        TimeUnit.SECONDS.sleep(2);
//        driver = launchBrowser.getDriver();
//        bniConnect = new BNIConnect(driver);
//        captureScreenShot = new CaptureScreenShot(driver);
//        bniConnect.navigateMenu("Operations,Region");
//        TimeUnit.SECONDS.sleep(2);
    }

    @When("I enter a valid new email id and click search and create new button and I enter the below details and click the save button and search the added visitor")
    public void When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button_and_search_the_added_visitor(DataTable addPVVisitor) throws Exception {
        Integer i = 2;
        //System.out.println(loginSubList.get(0));
        for (Map<String, String> data : addPVVisitor.asMaps(String.class, String.class)) {
            System.out.println(loginSubList.get(i-2));
            for (Integer colIteration = 0; colIteration < 2; colIteration++){
                String[] splitCredentials = login.get(loginIteration).toString().replace("[", "").replace("]", "").replaceAll(" ", "").split(",");
                System.out.println(splitCredentials[colIteration]);
            }
            bniConnect = new BNIConnect(driver);
            bniConnect.selectItemFromManageVisitor("Add a Visitor");
            addAVisitor = new AddAVisitor(driver);
            TimeUnit.SECONDS.sleep(3);
            String dateTimeStamp = currentDateTime.dateTime();
            visitorDateTime = (dateTimeStamp.replaceAll("/", "").replaceAll(":", "").replaceAll(" ", ""));
            addAVisitor.enterEmail(data.get("firstName") + data.get("lastName") + visitorDateTime + "@gmail.com");
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickSearchButton();
            readWriteExcel.setExcelFile("src/test/resources/inputFiles/testInput.xlsx");
            boolean setFlag = readWriteExcel.setCellData("src/test/resources/inputFiles/testInput.xlsx", "addVisitor", 0, i, data.get("firstName") + data.get("lastName") + visitorDateTime + "@gmail.com");
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickSearchByNameButton();
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.enterFirstName(data.get("firstName"));
            addAVisitor.enterLastName(data.get("lastName"));
            TimeUnit.SECONDS.sleep(1);
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
            driver.findElement(By.name("submit")).click();
            addAVisitor.clickCreateNewButton();
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
            TimeUnit.SECONDS.sleep(10);
            bniConnect = new BNIConnect(driver);
            TimeUnit.SECONDS.sleep(5);
            bniConnect.selectItemFromManageVisitor("Add a Visitor");
            TimeUnit.SECONDS.sleep(3);
            addAVisitor = new AddAVisitor(driver);
            addAVisitor.enterEmail(data.get("firstName") + data.get("lastName") + visitorDateTime + "@gmail.com");
            TimeUnit.SECONDS.sleep(2);
            addAVisitor.clickSearchButton();
            TimeUnit.SECONDS.sleep(3);
            String day = data.get(("visitDay"));
            String year = data.get(("visitYear"));
            String month = data.get(("visitMonth"));
            SimpleDateFormat inputFormat = new SimpleDateFormat("MMM");
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputFormat.parse(month));
            SimpleDateFormat outputFormat = new SimpleDateFormat("MM");
            String expectedDate = day + "/" + outputFormat.format(cal.getTime()) + "/" + year;
            addAVisitor = new AddAVisitor(driver);
            addAVisitorDetails = addAVisitor.getSearchResults();
            captureScreenShot = new CaptureScreenShot(driver);
            captureScreenShot.takeSnapShot(driver, "searchAndAddBrandNewVisitor");
            assertEquals("Visit date is not correct", expectedDate, addAVisitorDetails[0]);
            assertEquals("First Name is not correct", data.get("firstName"), addAVisitorDetails[1]);
            assertEquals("Last Name is not correct", data.get("lastName"), addAVisitorDetails[2]);
            assertEquals("Region is not correct", data.get("region"), addAVisitorDetails[3]);
            assertEquals("Chapter is not correct", data.get("chapter"), addAVisitorDetails[4]);
            assertEquals("Company Name is not correct", data.get("companyName"), addAVisitorDetails[5]);
            addAVisitor = new AddAVisitor(driver);
            addAVisitor.clickCloseButton();
            TimeUnit.SECONDS.sleep(2);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            i++;
        }
    }

    @Then("brand new visitor details saved successfully")
    public void brand_new_visitor_details_saved_successfully() throws Exception {
        System.out.println("Visitor details added successfully.");
    }

    @And("sign out from BNI")
    public void sign_out_from_BNI() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        signOut.signOutBni();
    }
}