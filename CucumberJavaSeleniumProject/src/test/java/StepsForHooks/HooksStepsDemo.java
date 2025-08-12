package StepsForHooks;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepsDemo {
	
	WebDriver driver;
	
	
	@Before(order=1)
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\2025\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		System.out.println("Browser launches successfully.");
		
	}
	@Before(order=2)
	public void secondBeforeAnnotation() {
		
		System.out.println("I am inside second before annotation.");
		
	}

	@Given("now user is in the login page")
	public void now_user_is_in_the_login_page() {
	}

	@When("if user enters username and password")
	public void if_user_enters_username_and_password() {
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
	}

	@Then("user then navigates to landing page")
	public void user_then_navigates_to_landing_page() {
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Browser closed successfully.");
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("Executed before step");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("Executed after step");
	}
		
		

}
