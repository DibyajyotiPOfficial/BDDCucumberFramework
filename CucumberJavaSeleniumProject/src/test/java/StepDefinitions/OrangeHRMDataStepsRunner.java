package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import io.cucumber.java.en.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class OrangeHRMDataStepsRunner {

    WebDriver driver = Hooks.driver;

    @Given("Browser launches and user is on the login page")
    public void browser_launches_and_user_is_on_the_login_page() {
        System.out.println("✅ Browser is already launched via Hooks.");
    }

    @When("User passes valid \"{string}\" and \"{string}\"")
    public void user_passes_valid_username_and_password(String username, String password) {
        System.out.println("🔐 Entering credentials: " + username + " / " + password);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        // 📸 Capture screenshot after entering credentials
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("G:/2025/My Automation Project/Screenshots/login_" + username + ".png"));
            System.out.println("📸 Screenshot saved for user: " + username);
        } catch (Exception e) {
            System.err.println("❌ Failed to capture screenshot: " + e.getMessage());
        }
    }

    @And("Clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("The user is now logged in and sees the landing screen")
    public void the_user_is_now_logged_in_and_sees_the_landing_screen() {
        boolean isDashboardVisible = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        Assert.assertTrue("Dashboard is not visible!", isDashboardVisible);
    }

    @And("Finally logs out from application")
    public void finally_logs_out_from_application() {
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}