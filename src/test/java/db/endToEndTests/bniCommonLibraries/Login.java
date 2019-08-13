package db.endToEndTests.bniCommonLibraries;

import db.endToEndTests.utils.CaptureScreenShot;

import java.util.concurrent.TimeUnit;
import static db.endToEndTests.utils.LaunchBrowser.driver;

public class Login {
    private db.endToEndTests.pageFactory.Login login;
    private CaptureScreenShot captureScreenShot = new CaptureScreenShot(driver);
    public void loginToBni() throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = new db.endToEndTests.pageFactory.Login(driver);
        login.enterBniUserName();
        login.enterBniPassword();
        login.clickBniSignInButton();
        captureScreenShot.takeSnapShot(driver);
        TimeUnit.SECONDS.sleep(6);
    }
}