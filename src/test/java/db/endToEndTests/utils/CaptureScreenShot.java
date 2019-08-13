package db.endToEndTests.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.io.File;

public class CaptureScreenShot {

    public static WebDriver driver;
    private CurrentDateTime currentDateTime = new CurrentDateTime();

    public CaptureScreenShot(WebDriver driver) {
        CaptureScreenShot.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    public void takeSnapShot(WebDriver webdriver) throws Exception {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile = new File("src/test/resources/snapShots/" + currentDateTime.dateTime() +".jpg");
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
