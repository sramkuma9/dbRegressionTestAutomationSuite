package db.endToEndTests.utils;

import db.endToEndTests.pageFactory.LoginPage;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import static db.endToEndTests.utils.LaunchBrowser.driver;

public class BniLogin {
    private LoginPage loginPage;

    public void logintoBni() throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        loginPage.enterBniUserName();
        loginPage.enterBniPassword();
        loginPage.clickBniSignInButton();
    }
}