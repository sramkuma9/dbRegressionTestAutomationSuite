package db.endToEndTests.pageFactory;

import db.endToEndTests.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BNIConnect {
    public static WebDriver driver;
    public WebDriverWait wait;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    @FindBy(css =  "#accountNav_2 > p > a")
    WebElement options;

    @FindBy(css =  "#accountNav_2 > ul > li:nth-child(3) > a")
    WebElement signOut;

    public BNIConnect(WebDriver driver) {
        BNIConnect.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        //This initElements method will create all WebElements
        PageFactory.initElements(factory, this);
        wait = new WebDriverWait(driver, 5);
    }

    public void hoverOnOptions() {
        Actions action = new Actions(driver);
        action.moveToElement(options);
        action.build().perform();
    }

    public void clickSignOut() throws Exception{
        signOut.click();
        TimeUnit.SECONDS.sleep(5);
    }
}
