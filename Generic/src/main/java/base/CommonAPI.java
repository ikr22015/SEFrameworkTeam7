package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @BeforeMethod
    @Parameters({"browser", "operatingSys", "URL"})
    public void setUp(String browserName, String os, String url){
        getLocalDrive(browserName,os);
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown(){

    }
    public void getLocalDrive(String browserName,String os){
        if (browserName.equalsIgnoreCase("chrome")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver","../Generic/drivers/chromedriver.exe");
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.chrome.driver","../Generic/drivers/chromedriver");
            }
        }else if (browserName.equalsIgnoreCase("firefox")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.firefox.driver","../Generic/drivers/geckodriver.exe");
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.firefox.driver","../Generic/drivers/geckodriver");
            }
        }
    }
}
