package main.java.setion007AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        String s;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[text()='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='MAA'][1]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
