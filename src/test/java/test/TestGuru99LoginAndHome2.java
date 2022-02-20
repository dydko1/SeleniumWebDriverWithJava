package test.java.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.pages.factory.Guru99HomePage2;
import test.pages.factory.Guru99LoginPage2;

import java.util.concurrent.TimeUnit;

public class TestGuru99LoginAndHome2 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        System.out.println("\t*** Before test ***");
        driver.get("http://demo.guru99.com/V4/");
    }

    @Test(priority = 0)
    public void testPrivacy() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        //driver.switchTo().defaultContent();
        Thread.sleep(200);
    }

    @Test(priority = 1)
    public void testLoginPage() {
        Guru99LoginPage2 guru99LoginPage1 = new Guru99LoginPage2(driver);
        String loginTitle = guru99LoginPage1.getLoginTitle();
        Assert.assertTrue(loginTitle.toLowerCase().contains("guru99 bank"));
        guru99LoginPage1.loginToGuru99("mgr123", "mgr!23");
        guru99LoginPage1.clickLogin();
    }

    @Test(priority = 2)
    public void testHomePage() {
        Guru99HomePage2 guru99HomePage = new Guru99HomePage2(driver);
        Assert.assertTrue(guru99HomePage.getManagerId().toLowerCase().contains("manger id : mgr123"));
    }

    @AfterTest
    public void close11() throws InterruptedException {
        System.out.println("\t*** After test ***");
        Thread.sleep(1500);
        driver.close();
    }
}
