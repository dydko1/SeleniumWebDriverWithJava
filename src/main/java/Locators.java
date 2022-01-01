package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        String s = "abcd";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver96.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys(s);
        //driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("miros");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy2");
        driver.findElement(By.className("submit")).click();
        s = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(s);
        driver.findElement(By.linkText("Forgot your password?")).click();
        //driver.close();
Thread.sleep(1000);
        driver.quit();
    }
}
