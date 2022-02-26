package test.pages.zold.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage1 {
    WebDriver driver;
    By homePageUserName = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]");

    public Guru99HomePage1(WebDriver driver) {
        this.driver = driver;
    }

    public String getManagerId() {
        return driver.findElement(homePageUserName).getText();
    }
}
