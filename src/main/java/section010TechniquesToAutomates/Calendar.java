package main.java.section010TechniquesToAutomates;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        Actions a = new Actions(driver);
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.path2usa.com/travel-companions/");
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.id("travel_date")).click();

        List<WebElement> dates = driver.findElements(By.className("day"));
        int days = dates.size();

        for (int i = 0; i < days; i++) {
            System.out.println(dates.get(i).getText());
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
