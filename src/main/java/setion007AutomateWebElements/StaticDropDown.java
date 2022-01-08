package main.java.setion007AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        String s;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown = new Select(staticDropDown);
        //dropDown.selectByIndex(3);

        s = dropDown.getFirstSelectedOption().getText();
        System.out.println(s);
        dropDown.selectByVisibleText("AED");
        s = dropDown.getFirstSelectedOption().getText();
        System.out.println(s);

        dropDown.selectByValue("INR");
        s = dropDown.getFirstSelectedOption().getText();
        System.out.println(s);
        Thread.sleep(1000);
        driver.quit();
    }
}
