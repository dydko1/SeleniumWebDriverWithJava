package test.java.test.old;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.pages.zold.tools.Login;
import test.pages.zold.tools.Profile;

import java.util.concurrent.TimeUnit;

public class TestToolsLoginTC {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        System.out.println("\t*** Before test ***");
        driver.get("https://demoqa.com/login");
    }

    @Test(priority = 0)
    public void testPrivacy() throws InterruptedException {
        //Instantiating Login & Profile page using initElements()
        Thread.sleep(2000);
        Login loginPg = PageFactory.initElements(driver, Login.class);
        Profile profilePg = PageFactory.initElements(driver, Profile.class);

        //Using the methods created in pages class to perform actions
        loginPg.LogIn_Action("mirek", "Mirdydxxxxx^");
        Thread.sleep(2000);
        profilePg.verifyUser("mirek");
        profilePg.logout_Action();
        Thread.sleep(2000);
    }

    @AfterTest
    public void close11() throws InterruptedException {
        System.out.println("\t*** After test ***");
        Thread.sleep(1500);
        driver.close();
    }
}
