package test.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99LoginPage1 {
    WebDriver driver;
    private By user99GuruName = By.xpath("//input[@name='uid']");
    private By password99Guru = By.xpath("//input[@name='password'][@type='password']");
    private By login = By.xpath("//input[@name='btnLogin']");
    private By titleText = By.xpath("//h2[@class='barone']");

    public Guru99LoginPage1(WebDriver driver) {
        this.driver = driver;
    }

    private void setUserName(String strUserName) {
        driver.findElement(user99GuruName).sendKeys(strUserName);
    }

    private void setPassword(String strPassword) {
        driver.findElement(password99Guru).sendKeys(strPassword);
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

    public String getLoginTitle() {
        return driver.findElement(titleText).getText();
    }

    public void loginToGuru99(String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
    }
}
