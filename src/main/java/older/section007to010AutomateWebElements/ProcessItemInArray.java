package main.java.section007to010AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ProcessItemInArray {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise");

        // very important sleep
        Thread.sleep(500);
        List<WebElement> products = driver.findElements(By.cssSelector("div.products div.product"));

        List<String> vegetables = Arrays.asList("Cucumber", "Brocolli", "Tomato", "Carrot", "Almonds");

        for (WebElement element : products) {
            String[] name = element.findElement(By.cssSelector("h4.product-name")).getText().split(" ");
            String formatName = name[0];

            if (vegetables.contains(formatName)) {
                //System.out.println(formatName);
                element.findElement(By.cssSelector("button[type='button']")).click();
                //break;
            }
        }

        driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
        driver.findElement(By.cssSelector("div[class=\"cart-preview active\"] button[type=\"button\"]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input[placeholder=\"Enter promo code\"]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        Thread.sleep(1500);
        driver.quit();
    }

}
