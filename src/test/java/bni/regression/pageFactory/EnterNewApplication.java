package bni.regression.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EnterNewApplication {
    public static WebDriver driver;
    public WebDriverWait wait;

    @FindBy(css = "#droppedMemberEmail")
    WebElement emailTextBox;

    @FindBy(css = "#searchDroppedMember")
    WebElement searchButton;

    @FindBy(css = "#convertToMemberHref")
    WebElement addButton;

    public EnterNewApplication(WebDriver driver) {
        EnterNewApplication.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        //This initElements method will create all WebElements
        PageFactory.initElements(factory, this);
        wait = new WebDriverWait(driver, 5);
    }

    public void clickSearchButton() throws InterruptedException {
        searchButton.click();
        TimeUnit.SECONDS.sleep(2);
    }

    public void clickAddButton() throws InterruptedException {
        addButton.click();
        TimeUnit.SECONDS.sleep(2);
    }

    public void enterEmail(String emailId) throws InterruptedException {
        emailTextBox.sendKeys(emailId);
        TimeUnit.SECONDS.sleep(1);
    }
}
