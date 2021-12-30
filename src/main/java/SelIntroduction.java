package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver96.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver
                driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //driver.close();
        driver.navigate().to("http://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("http://www.onet.pl/");
        Thread.sleep(1500);
        driver.quit();
    }
}
