package bni.regression.pageFactory;

import bni.regression.libraries.common.ReadPropertyFile;
import com.sun.java.util.jar.pack.Instruction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BNIConnect {
    public static WebDriver driver;
    public WebDriverWait wait;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    @FindBy(css =  "#accountNav_2 > p > a")
    WebElement options;

    @FindBy(css =  "#accountNav_2 > ul > li:nth-child(3) > a")
    WebElement signOut;

    @FindBy(css =  "#textnav > li")
    List<WebElement> menuNavigate;

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

    public void hoverOnMenu(String menuItem) throws Exception {
        String[] menusplit = menuItem.split(",");
        int size = menusplit.length;
        Actions action = new Actions(driver);
        for (WebElement trElement : menuNavigate) {
            List<WebElement> td_collection = trElement.findElements(By.tagName("a"));
            String menuName = td_collection.get(0).getText();
            if (menusplit[0].equals(menuName)) {
                switch(size)
                {
                    case 1:
                        TimeUnit.SECONDS.sleep(3);
                        td_collection.get(0).click();
                        break;
                    case 2:
                        TimeUnit.SECONDS.sleep(3);
                        action.moveToElement(td_collection.get(0));
                        action.build().perform();
                        TimeUnit.SECONDS.sleep(3);
                        td_collection.findElement(By.tagName("a"));
                        break;
                }



            }
        }
    }


    public void clickSignOut() throws Exception{
        signOut.click();
        TimeUnit.SECONDS.sleep(5);
    }
}
