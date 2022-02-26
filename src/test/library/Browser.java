package test.library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    static WebDriver driver;

    public static WebDriver StartBrowser(String browsername, String url) {
        // If the browser is Firefox
        if (browsername.equalsIgnoreCase("Firefox")) {
            // Set the path for geckodriver.exe
            System.setProperty("webdriver.firefox.marionette", " E://Selenium//Selenium_Jars//geckodriver.exe ");
            driver = new FirefoxDriver();
        }

        // If the browser is Chrome
        else if (browsername.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            System.out.println("\t*** Before test ***");
        }
        // If the browser is IE
        else if (browsername.equalsIgnoreCase("IE")) {
            // Set the path for IEdriver.exe
            System.setProperty("webdriver.ie.driver", "E://Selenium//Selenium_Jars//IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        driver.get(url);
        return driver;
    }
}