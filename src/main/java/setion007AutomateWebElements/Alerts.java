package main.java.setion007AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("name")).sendKeys(s);
        WebElement webElement = driver.findElement(By.id("alertbtn"));
        webElement.click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        Thread.sleep(500);
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss(); 

        Thread.sleep(500);
        driver.quit();
    }
}
