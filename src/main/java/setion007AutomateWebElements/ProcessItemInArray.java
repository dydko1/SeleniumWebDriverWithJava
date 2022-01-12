package main.java.setion007AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ProcessItemInArray {
    public static void main(String[] args) throws InterruptedException {
        String s = "Mirek";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise");

        List<WebElement> products = driver.findElements(By.cssSelector("div.product"));

        List<String> vegetables = Arrays.asList("Cucumber", "Brocolli");

        for (WebElement element : products) {
            String[] name = element.getText().split(" ");
            String formatName = name[0];


            if (vegetables.contains(formatName)) {
                //System.out.println(name);
                element.findElement(By.cssSelector("button")).click();
                //break;
            }
        }
        Thread.sleep(2500);
        driver.quit();
    }
}
