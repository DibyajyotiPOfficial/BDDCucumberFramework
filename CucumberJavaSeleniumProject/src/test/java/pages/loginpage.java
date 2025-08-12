package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginpage {

    WebDriver driver;

    // Locators
    private By txt_username = By.xpath("//input[@placeholder='Username']");
    private By txt_password = By.xpath("//input[@placeholder='Password']");
    private By btn_login = By.xpath("//button[text()=' Login ']");
    private By dashboard_header = By.xpath("//h6[text()='Dashboard']");

    // Constructor
    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(btn_login).click();
    }

    public boolean isDashboardDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard_header)).isDisplayed();
    }
}