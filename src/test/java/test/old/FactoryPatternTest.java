package test.java.test.old;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.java.test.old.driverManager.DriverManager;
import test.java.test.old.driverManager.DriverManagerFactory;
import test.java.test.old.driverManager.DriverType;

public class FactoryPatternTest {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("http://testautomationguru.com");
        Assert.assertEquals("Vinsguru | Microservices Patterns, Java, Reactor, Spring, gRPC, RSocket etc", driver.getTitle());
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

    @Test
    public void launchYahooTest() {
        driver.get("https://www.yahoo.com");
        Assert.assertEquals("Yahoo is part of the Yahoo family of brands", driver.getTitle());
    }

}