package main.java.setion007AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class UpdateStaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        String s;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().fullscreen();
        Thread.sleep(500);
        //

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(500);

        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        s = driver.findElement(By.id("divpaxinfo")).getText();

        Assert.assertEquals(s, "5 Adult");
        Thread.sleep(1500);

        driver.quit();
    }
}
