package main.java.setion007AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class UpdateStaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        String s;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
        //WebDriverManager.chromedriver().setup();
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
        Thread.sleep(1500);

        driver.quit();
    }
}
