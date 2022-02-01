package main.java.older.section005006;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String s;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        Thread.sleep(500);
        driver.findElement(By.id("inputUsername")).sendKeys("Miro1234");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(1000);
        s = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(s,"You are successfully logged in.");
        s=driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText();
        //Assert.assertEquals(s,"Hello Miro1234,");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div>p")).click();
        Thread.sleep(1500);
        driver.quit();
    }
}
