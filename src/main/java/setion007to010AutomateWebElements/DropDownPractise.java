package main.java.setion007to010AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropDownPractise {
    public static void main(String[] args) throws InterruptedException {
        String s;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                System.out.println("India found:)");
            } else {
                System.out.println("India does not found:(");
            }
            ;
        }

        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

        driver.quit();
    }
}
