package test.java.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.pages.Guru99HomePageOld;
import test.pages.Guru99LoginOld;

public class Test99GuruLogin {

    // String driverPath = "C:\\geckodriver.exe";

    WebDriver driver;
    Guru99LoginOld objLogin;
    Guru99HomePageOld objHomePage;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\t*** Before test ***");
        driver.get("http://demo.guru99.com/V4/");
    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * <p>
     * Verify login page title as guru99 bank
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */
    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct() {
        //Create Login Page object
        objLogin = new Guru99LoginOld(driver);
        //Verify login page title
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        objLogin.loginToGuru99("mgr123", "mgr!23");
        // go the next page
        objHomePage = new Guru99HomePageOld(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
    @AfterMethod
    public void close11() throws InterruptedException {
        System.out.println("\t*** After test ***");
        Thread.sleep(1000);
        driver.close();
    }
}