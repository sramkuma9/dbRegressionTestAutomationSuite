package bni.regression.libraries.ui;

import bni.regression.pageFactory.BNIConnect;
import bni.regression.libraries.common.LaunchBrowser;

import java.util.concurrent.TimeUnit;

public class SignOut {
    private BNIConnect bniConnect;

    public void signOutBni() throws Exception{
        LaunchBrowser.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        bniConnect = new BNIConnect(LaunchBrowser.driver);
        bniConnect.hoverOnOptions();
        TimeUnit.SECONDS.sleep(5);
        bniConnect.clickSignOut();
        TimeUnit.SECONDS.sleep(5);
        LaunchBrowser.driver.quit();
    }
}