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

public class Scope {
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

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement columnDriver = footerDriver.findElement(By.cssSelector("#gf-BIG > table > tbody > tr > td:first-child > ul"));
        List<WebElement> links = columnDriver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            link.sendKeys(clickOnLink);
        }

        Set tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println("+++++ " + driver.getTitle() + " +++++");
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
