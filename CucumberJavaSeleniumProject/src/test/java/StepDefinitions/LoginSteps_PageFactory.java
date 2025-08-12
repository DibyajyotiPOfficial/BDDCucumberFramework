package StepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.*;
import pageFactory.OrangeHRM_Login_PF;

public class LoginSteps_PageFactory {

    OrangeHRM_Login_PF login;

    @Given("the user opens the OrangeHRM login page")
    public void openLoginPage() {
        login = new OrangeHRM_Login_PF(Hooks.driver);
        System.out.println("✅ Navigated to login page.");
    }

    @When("the user enters username {string} and password {string} using POM")
    public void enterCredentials(String username, String password) {
    	
        login.enterUsername(username);
        login.enterPassword(password);
        System.out.println("✅ Entered credentials.");
    }

    @And("submits the login form")
    public void submitLogin() {
        login.clickLoginBtn();
        System.out.println("✅ Submitted login form.");
    }

    @Then("the user should be redirected to the dashboard using POM")
    public void verifyDashboard() {
        boolean isDashboardVisible = Hooks.driver.getCurrentUrl().contains("dashboard");
        Assert.assertTrue("❌ Dashboard not visible", isDashboardVisible);
        System.out.println("✅ Login successful, dashboard loaded.");
    }
}