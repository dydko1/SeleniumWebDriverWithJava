package test.pages.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage2 {
    WebDriver driver;
    @FindBy(xpath = "//input[@name='uid']")
    private WebElement user99GuruName;
    @FindBy(xpath = "//input[@name='password'][@type='password']")
    private WebElement password99Guru;
    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement login;
    @FindBy(xpath = "//h2[@class='barone']")
    WebElement titleText;

    public Guru99LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void setUserName(String strUserName) {
        user99GuruName.sendKeys(strUserName);
    }

    private void setPassword(String strPassword) {
        password99Guru.sendKeys(strPassword);
    }

    public void clickLogin() {
        login.click();
    }

    public String getLoginTitle() {
        return titleText.getText();
    }

    public void loginToGuru99(String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
    }
}
