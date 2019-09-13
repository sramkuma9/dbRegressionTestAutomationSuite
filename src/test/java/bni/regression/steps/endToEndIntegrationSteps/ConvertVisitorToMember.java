package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.CaptureScreenShot;
import bni.regression.libraries.common.ReadWriteExcel;
import bni.regression.pageFactory.BNIConnect;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ConvertVisitorToMember {
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();

    @Before
    public void setup() throws Exception {
//        System.out.println("Cucumber test execution has started...");
//        driver = launchBrowser.getDriver();
//        launchBrowser.invokeBrowser();
//        login.loginToBni();
    }

    @After
    public void tearDown() throws Exception{
        //signOut.signOutBni();
    }

    // Scenario: Navigate to Add a Visitor page
    // Scenario: Navigate to Add a Visitor page
    @Given("User navigates to BNI homepage")
    public void User_navigates_to_BNI_homepage() throws Exception {
        //System.out.println("Cucumber test execution has started...");
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
        System.out.println("Navigating to add a visitor page");
        bniConnect = new BNIConnect(driver);
        bniConnect.selectItemFromManageVisitor("View/Edit Visitors List");
    }

    @When("I enter a valid existing email id and click search and create new button and I enter the below details and click the save button and search the added visitor")
    public void When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button_and_search_the_added_visitor(DataTable addPVVisitor) throws Exception{
        Integer i =2;
        for (Map<String, String> data : addPVVisitor.asMaps(String.class, String.class)) {

}
