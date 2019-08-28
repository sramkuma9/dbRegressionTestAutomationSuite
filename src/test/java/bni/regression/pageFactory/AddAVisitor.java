package bni.regression.pageFactory;

import bni.regression.libraries.common.ReadWritePropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void clickSearchButton(){
        searchButton.click();
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
}
