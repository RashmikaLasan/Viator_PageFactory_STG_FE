package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SeleniumDriver{
    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    public static Logger log = Logger.getLogger("devpinoyLogger");


    private SeleniumDriver(){
        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\ChromeDriver90\\chromedriver.exe");
        driver = new ChromeDriver();
        log.info("New driver instantiated");
        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver,TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
    }

    public static void openPage(String url) {
        driver.get(url);

    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void setUpDriver(){
        if(seleniumDriver==null){
            seleniumDriver=new SeleniumDriver();
        }
    }
    public static void tearDown(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
}
