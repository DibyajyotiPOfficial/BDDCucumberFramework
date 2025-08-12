package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchFunctionality {
	
	WebDriver driver;
	WebElement inputBox;
	
	@Given("browser is open and maximized")
	public void browser_is_open_and_maximized() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\2025\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
	   
	}

	@When("user enters anything in search box")
	public void user_enters_anything_in_search_box() {
	   inputBox = driver.findElement(By.xpath("//textarea[@name='q']"));
	}

	@And("hits enter")
	public void hits_enter() {
	    inputBox.sendKeys("testim.io",Keys.ENTER);
	}

	@Then("user should be navigated to the respective page")
	public void user_should_be_navigated_to_the_respective_page() {
	    System.out.println("User navigated successfully!!");
	    System.out.println(driver.findElement(By.xpath("//h3[text()='Automated UI and Functional Testing - AI-Powered Stability - Testim.io']")).getText());
	    driver.close();
	    driver.quit();
	}
	
}
