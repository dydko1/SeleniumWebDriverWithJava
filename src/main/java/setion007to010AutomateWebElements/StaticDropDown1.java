package main.java.setion007to010AutomateWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticDropDown1 {
    public static void main(String[] args) throws InterruptedException {
        String s;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        //
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("div[class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] div[class='css-1dbjc4n r-18u37iz r-1w6e6rj'] div[class='css-1dbjc4n'] svg"));
        System.out.println(radioButtons.size());

        for( WebElement radioButton : radioButtons)
        {
            radioButton.click();

            Thread.sleep(250);
            //System.out.println(radioButton.isSelected());
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
