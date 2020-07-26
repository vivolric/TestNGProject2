package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseDriver {
//    public static WebDriver driver;
//    static {
//        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
//        driver = new ChromeDriver();
//        //driver.manage().window().maximize();
//        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
//    }
//}

    /*
     WebDriver driver; access modifier is a default --> accessible in the same package

     We need to make driver as public or protected so we are able to access it
     */

    protected static WebDriver driver;

    @BeforeMethod(groups = {"SmokeTesting","Regression"})
    @Parameters({"browser"})
    public void BeforeMethod(String browser){

//        With this if else statement We are getting the browser name from the xml file then
//          We are opening the browser in this if statement
//          Before you download the geckoDriver you should have firefox browser in your laptop
//        Link for the firefox --> https://github.com/mozilla/geckodriver/releases/tag/v0.26.0

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
            driver = new ChromeDriver(); // Opening the chrome
        }else if(browser.equalsIgnoreCase("firefox")){
//                                                                                No exe for mac
            System.setProperty("webdriver.gecko.driver" ,"/Users/bulut/Selenium/geckodriver");
            driver = new FirefoxDriver();
        }

        // driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }
}