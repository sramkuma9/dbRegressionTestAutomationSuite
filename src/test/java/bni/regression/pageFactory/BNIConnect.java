package bni.regression.pageFactory;

import bni.regression.libraries.common.ReadWritePropertyFile;
import org.openqa.selenium.*;
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
    private ReadWritePropertyFile readWritePropertyFile = new ReadWritePropertyFile();

    @FindBy(css =  "#accountNav_2 > p > a")
    WebElement options;

    @FindBy(css =  "#accountNav_2 > ul > li:nth-child(3) > a")
    WebElement signOut;

    @FindBy(css =  "#textnav > li")
    List<WebElement> menuNavigate;

    @FindBy(css =  "#textnav > li > ul > li")
    List<WebElement> subMenuNavigate;

    @FindBy(css = "#tabs-3-4 > table")
    List<WebElement> manageVisitorMenu;

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

    public void navigateMenu(String menuItem) throws Exception {
        String[] menusplit = menuItem.split(",");
        int size = menusplit.length;
        Actions action = new Actions(driver);
        int counter = 0;
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
                        //td_collection.findElement(By.tagName("a"));
                        for (WebElement subElement : subMenuNavigate) {
                            List<WebElement> sub_collection = subElement.findElements(By.tagName("a"));
                            String subMenuName = sub_collection.get(0).getText();
                            if (menusplit[1].equals(subMenuName)) {
                                sub_collection.get(0).click();
                                counter = counter + 1;
                                break;
                            }
                        }
                }
            }
            if (counter == 1){
                break;
            }
        }
    }

    public void selectItemFromManageVisitor(String item) throws Exception{
        TimeUnit.SECONDS.sleep(2);
        for(WebElement trElement : manageVisitorMenu)
        {
            List<WebElement> td_collection=trElement.findElements(By.tagName("tbody"));
            String menuItem = td_collection.get(0).findElement(By.tagName("tr")).getText();
                if (item.equals(menuItem)){
                    td_collection.get(0).findElement(By.tagName("tr")).findElement(By.tagName("a")).click();
                    TimeUnit.SECONDS.sleep(3);
                    break;
                }
        }
    }

    public void clickSignOut() throws Exception{
        signOut.click();
        TimeUnit.SECONDS.sleep(5);
    }
}
