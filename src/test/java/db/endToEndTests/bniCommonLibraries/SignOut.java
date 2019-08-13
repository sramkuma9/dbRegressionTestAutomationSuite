package db.endToEndTests.bniCommonLibraries;

import java.util.concurrent.TimeUnit;
import static db.endToEndTests.utils.LaunchBrowser.driver;

public class SignOut {
    private db.endToEndTests.pageFactory.BNIConnect bniConnect;

    public void signOutBni() throws Exception{
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        bniConnect = new db.endToEndTests.pageFactory.BNIConnect(driver);
        bniConnect.hoverOnOptions();
        TimeUnit.SECONDS.sleep(5);
        bniConnect.clickSignOut();
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}