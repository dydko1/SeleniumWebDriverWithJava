package test.webdrivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test12 {
    public static void main(String[] args) {
        //WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("96.0.4664.45").setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        //driver.close();
        driver.quit();
    }
}
