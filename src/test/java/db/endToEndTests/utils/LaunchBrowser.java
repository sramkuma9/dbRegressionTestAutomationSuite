package db.endToEndTests.utils;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

    public static WebDriver driver;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    public WebDriver getDriver() {
        return driver;
    }

    public void invokeBrowser() throws Exception {
        String browserType = readPropertyFile.loadAndReadPropertyFile("browserType");
        String appURL = readPropertyFile.loadAndReadPropertyFile("bniUrl");

        switch(browserType)
        {
            case "IE":
                driver = initInternetExplorerDriver(appURL);
                break;
            case "FIREFOX":
                driver = initFirefoxDriver(appURL);
                break;
            case "CHROME":
                driver = initChromeDriver(appURL);
                break;
            default:
                System.out.println("browser : "+ browserType + "is invalid, launching Chrome as browser of choice..");
                driver = initChromeDriver(appURL);
        }
    }

    private WebDriver initChromeDriver(String appURL) {
        String envName = readPropertyFile.loadAndReadPropertyFile("bniUrl");
        System.out.println("Executing the tests in " + envName + " environment");
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", ("src/test/resources/drivers/chromedriver.exe"));
        //WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setHeadless(true);
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
        driver.navigate().to(appURL);
        return driver;
    }

    private static WebDriver initInternetExplorerDriver(String appURL) {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/ie.exe");
        System.out.println("Launching Internet browser..");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String appURL) {
        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }
}