package miro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {
    @Test
    public void getFirefox() {
        System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());

    }

    @Test
    public void getChorme() {
        System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
    }

    @Test
    public void getEdge() {
        System.out.println("GetEdge Method is running on Thread : " + Thread.currentThread().getId());
    }

    @Test
    public void getIE() {
        System.out.println("GetIE Method is running on Thread : " + Thread.currentThread().getId());
    }
}