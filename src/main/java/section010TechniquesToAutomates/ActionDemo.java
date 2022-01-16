package main.java.section010TechniquesToAutomates;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.image.Kernel;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ActionDemo {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        Actions a = new Actions(driver);
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.pl/");
        WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));

        // a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        a.moveToElement(move).contextClick().build().perform();
        Thread.sleep(2500);

        driver.quit();
    }

}
