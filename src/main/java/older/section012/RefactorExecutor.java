package main.java.section012;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class RefactorExecutor {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        Actions a = new Actions(driver);
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(500);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500;");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(1)"));

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i).getText());
        }

        Thread.sleep(500);
        driver.quit();
    }

}
