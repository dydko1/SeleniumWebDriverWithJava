package test.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page1Miro {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2500);
        driver.quit();
    }
}
