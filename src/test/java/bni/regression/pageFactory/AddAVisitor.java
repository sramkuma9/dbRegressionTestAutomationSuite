package bni.regression.pageFactory;

import bni.regression.libraries.common.ReadWritePropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddAVisitor {
    public static WebDriver driver;
    public WebDriverWait wait;
    private ReadWritePropertyFile readWritePropertyFile = new ReadWritePropertyFile();

    @FindBy(css = "#droppedMemberEmail")
    WebElement emailTextBox;

    @FindBy(css = "#searchDroppedMember")
    WebElement searchButton;

    @FindBy(css = "#ui-dialog-title-modalwindow")
    WebElement pageTitle;

    @FindBy(css = "#showSearchByFirstAndLastName")
    WebElement searchByNameButton;

    @FindBy(css = "#createNew")
    WebElement createNewButton;

    @FindBy(css = "#droppedMemberFirstName")
    WebElement firstNameTextBox;

    @FindBy(css = "#droppedMemberLastName")
    WebElement lastNameTextBox;

    @FindBy(css = "#visitorPrimaryCategory")
    WebElement professionListBox;

    @FindBy(css = "#visitorInvitedBy")
    WebElement invitedByListBox;

    @FindBy(css = "#visitorSecondaryCategory")
    WebElement specialityListBox;

    @FindBy(css = "#visitDate")
    WebElement visitDateTextBox;

    @FindBy(css = "#ui-datepicker-div > table > tbody > tr")
    List<WebElement> datePicker;


    public AddAVisitor(WebDriver driver) {
        AddAVisitor.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        //This initElements method will create all WebElements
        PageFactory.initElements(factory, this);
        wait = new WebDriverWait(driver, 5);
    }

    public void enterEmail(String dateTime){
        emailTextBox.sendKeys(dateTime);
    }

    public void enterFirstName(String firstName){
        firstNameTextBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }

    public void selectProfession(String profession) {
        Select professionSelect = new Select(professionListBox);
        professionSelect.selectByVisibleText(profession);
    }

    public void selectSpeciality(String speciality) {
        Select specialitySelect = new Select(specialityListBox);
        specialitySelect.selectByVisibleText(speciality);
    }

    public void selectInvitedBy(String invitedBy) {
        Select invitedBySelect = new Select(invitedByListBox);
        invitedBySelect.selectByVisibleText(invitedBy);
    }

    public void clickSearchButton(){
        searchButton.click();
         }

    public void clickVisitDateField(){
        visitDateTextBox.click();
    }

    public void clickSearchByNameButton(){
        searchByNameButton.click();
    }

    public void clickCreateNewButton(){
        createNewButton.click();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void selectDateFromDatePicker(String day) throws Exception{
        TimeUnit.SECONDS.sleep(2);
        for(WebElement trElement : datePicker)
        {
            List<WebElement> td_collection=trElement.findElements(By.tagName("td"));
            String dayItem = td_collection.get(0).findElement(By.tagName("a")).getText();
            if (day.equals(dayItem)){
                td_collection.get(0).findElement(By.tagName("a")).click();
                TimeUnit.SECONDS.sleep(3);
                break;
            }
        }
    }
}
