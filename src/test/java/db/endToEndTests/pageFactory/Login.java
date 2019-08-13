package db.endToEndTests.pageFactory;

import db.endToEndTests.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static WebDriver driver;
    public WebDriverWait wait;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    @FindBy(css =  "#app > div > div > div.styles__AppContent-cDnHLr.gXPOuk > div > div.styles__ContentContainer-kcVUrs.DjEAQ > section.styles__Container-ieicpK.iVPZSq > div.styles__Container-jGsLTA.fXXdOL > form.styles__StyledForm-feCSaU.hJcysH > div:nth-child(1) > div > div > div > input")
    WebElement bniUserName;

    @FindBy(css =  "#app > div > div > div.styles__AppContent-cDnHLr.gXPOuk > div > div.styles__ContentContainer-kcVUrs.DjEAQ > section.styles__Container-ieicpK.iVPZSq > div.styles__Container-jGsLTA.fXXdOL > form.styles__StyledForm-feCSaU.hJcysH > div:nth-child(2) > div > div > div > input")
    WebElement bniPassword;

    @FindBy(css =  "#app > div > div > div.styles__AppContent-cDnHLr.gXPOuk > div > div.styles__ContentContainer-kcVUrs.DjEAQ > section.styles__Container-ieicpK.iVPZSq > div.styles__Container-jGsLTA.fXXdOL > form.styles__StyledForm-feCSaU.hJcysH > div.styles__ButtonContainer-iUsGiN.gqPErL > div > button > span.jss29")
    WebElement bniSignIn;

    public Login(WebDriver driver) {
        Login.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        //This initElements method will create all WebElements
        PageFactory.initElements(factory, this);
        wait = new WebDriverWait(driver, 5);
    }

    public void enterBniUserName(){
        bniUserName.sendKeys(readPropertyFile.loadAndReadPropertyFile("bniUsername"));
        //bniUserName.sendKeys(Keys.TAB);
    }
    public void enterBniPassword(){

        bniPassword.sendKeys(readPropertyFile.loadAndReadPropertyFile("bniPassword"));
    }
    public void clickBniSignInButton(){

        bniSignIn.click();
    }
}
