package vwo_endtoend_functionality;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class VWO_EndToEndFunctionality {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"G:\\2025\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();

//		// TEST CASE 1
//		driver.get(
//				"https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
//		driver.findElement(By.id("page-v1-step1-email")).sendKeys("pdibyajyoti772@syscorp.com");
//		driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox")).click();
//		driver.findElement(By.xpath("//button[text()='Create a Free Trial Account']")).click();
//
//		// TEST CASE 2
//		WebElement passwordPage = driver
//				.findElement(By.xpath("//h4[normalize-space(text())='Set up your password to get started']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		wait.until(ExpectedConditions.visibilityOf(passwordPage));
//		driver.findElement(By.id("page-v1-fname")).sendKeys("dibyajyoti");
//		driver.findElement(By.id("page-v1-lname")).sendKeys("pattnaik");
//		driver.findElement(By.id("page-v1-pnumber")).sendKeys("9900029692");
//		driver.findElement(By.id("page-v1-pwd")).sendKeys("Djpsd@636261");
//		WebElement pwdPageCheckBox = driver.findElement(By.id("page-free-trial-step2-cu-gdpr-consent-checkbox"));
//		if (pwdPageCheckBox.isSelected()) {
//			System.out.println("Is Selected!!");
//		} else {
//			System.out.println("Is Not Selected!!");
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[normalize-space(text())='Create Account']")).click();

		// TEST CASE 6
		driver.get("https://app.vwo.com/#/login");
		driver.findElement(By.id("login-username")).sendKeys("pdibyajyoti772@syscorp.com");
		driver.findElement(By.id("login-password")).sendKeys("Djpsd@171124");
		driver.findElement(By.xpath("//span[@class=\"checkbox-radio-button ng-scope\"]")).click();
		driver.findElement(By.id("js-login-btn")).click();

//		//TEST CASE 4
//		driver.findElement(By.xpath("(//button[@title=\"User menu\"])[1]")).click();
//		driver.findElement(By.xpath("(//li[normalize-space(text())='Logout'])[2]")).click();
//		System.out.println("Successfully logged out & back to login page.");

		// TEST CASE 5 & 6
//		driver.findElement(By.id("login-username")).sendKeys("pdibyajyoti773@syscorp.com");
//		driver.findElement(By.id("login-password")).sendKeys("Djpsd@636201");
//		driver.findElement(By.xpath("//span[@class=\"checkbox-radio-button ng-scope\"]")).click();
//		driver.findElement(By.id("js-login-btn")).click();
//		WebElement loginUnsuccessfulLoginText = driver.findElement(By.id("js-notification-box-msg"));
//		String unsuccessfulLoginMsg = loginUnsuccessfulLoginText.getText();
//		System.out.println(unsuccessfulLoginMsg);

		// TEST CASE 8, 9 and 10
//		System.out.println(driver.findElement(By.xpath("//h4[text()='Welcome dibyajyoti pattnaik 👋🏻']")).getText());
//		driver.findElement(By.xpath("//button[text()='Select All']")).click();
//		
//		WebElement disabledButton = driver.findElement(By.xpath("(//div//button[@data-qa=\"btn-next\" and text()=' Start 30 day Free Trial '])[2]"));
//		// Scroll the button into view nicely
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", disabledButton);
//
//		// Optional: wait a bit if there are dynamic overlays
//		Thread.sleep(1000); // Or better, explicit wait for overlay disappearance
//
//		// Try Selenium click first
//		try {
//		    disabledButton.click();
//		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
//		    System.out.println("Standard click failed, using JS click.");
//		    js.executeScript("arguments[0].click();", disabledButton);
//		}
		// TEST CASE 12
//		driver.findElement(By.xpath("(//button[@title=\"User menu\"])[2]")).click();
//		driver.findElement(By.xpath("//div[text()='Edit Profile']")).click();
//		WebElement changePassword = driver.findElement(By.xpath("//form//h5[text()='Change Password']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
//		driver.findElement(By.id("current-password")).sendKeys("Djpsd@636261");
//		driver.findElement(By.id("new-password")).sendKeys("Djpsd@171124");
//		driver.findElement(By.id("confirm-password")).sendKeys("Djpsd@171124");
//		WebElement saveBtn = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(2000));
//		wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
//		System.out.println("Password Changed Successfully!!");
//		
		// TEST CASE 13
//		driver.findElement(By.xpath("(//button[@title=\"User menu\"])[2]")).click();
//		Actions act = new Actions(driver);
//		WebElement theme = driver.findElement(By.xpath("//span[text()='Theme']"));
//		act.moveToElement(theme).build().perform();
//		driver.findElement(By.xpath("//span[text()='Dark']")).click();

		// TEST CASE 14
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Need Help?']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h6[text()='Raise a Support Ticket']")).click();
//		Thread.sleep(2000);
//		System.out.println("Clicked on raise a support ticket.");
//		WebElement supportTicketPage=driver.findElement(By.xpath("//h4[text()='Raise a Support Ticket']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
//		wait.until(ExpectedConditions.textToBePresentInElement(supportTicketPage, "Raise a Support Ticket"));
//		driver.findElement(By.id("support-subject")).sendKeys("Ticket for walkthrough of VWO application.");
//		driver.findElement(By.id("support-description")).sendKeys("This ticket is being raised for requesting a walk through of the VWO application.");
//		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();

		// TEST CASE 15
//		WebElement toggleBtn = driver.findElement(By.xpath("//*[@icon-name=\"icon--navbar-collapse\"]"));
//		toggleBtn.click();
//		Thread.sleep(5000);
//		Actions act = new Actions(driver);
//		Thread.sleep(1000);
//		act.moveToElement(toggleBtn).build().perform();
//		Thread.sleep(1000);
//		WebElement lefthandPanel = driver.findElement(By.xpath("//div[@class=\"navbar navbar--dark\"]"));
//		Thread.sleep(5000);
//		act.moveToElement(lefthandPanel).build().perform();

		// TEST CASE 16
//		driver.findElement(By.xpath("//span[text()='Insights']")).click();
//		driver.findElement(By.xpath("//span[text()=' Funnel Reports ']")).click();
//		driver.findElement(By.xpath("//a[text()=' Create a Funnel Report ']")).click();
//		driver.findElement(By.id("campaignName")).sendKeys("TEST FUNNEL");
//		driver.findElement(By.xpath("//button[text()=' Create ']")).click();
//		System.out.println("Funnel Create button clicked!!");

		// TEST CASE 17
//		WebElement data360 = driver.findElement(By.xpath("//span[text()='Data360']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", data360);
//		data360.click();
//		driver.findElement(By.xpath("//span[text()='Introduction']")).click();
//		driver.findElement(By.xpath("//span[text()='Read documentation']")).click();
//		Set<String> wids = driver.getWindowHandles();
//		System.out.println(wids);
//		Iterator<String> it = wids.iterator();
//		String mainTab = it.next();  
//		String newTab = it.next(); 
//		driver.switchTo().window(newTab);
//		WebElement aboutSection = driver.findElement(By.className("article-title"));
//		System.out.println(aboutSection.getText());

		// TEST CASE 18 & 19
//		WebElement data360 = driver.findElement(By.xpath("//span[text()='Data360']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", data360);
//		data360.click();
//		driver.findElement(By.xpath("//span[text()='Introduction']")).click();
//		driver.findElement(By.xpath("//span[text()='Read documentation']")).click();
//		Set<String> wids = driver.getWindowHandles();
//		System.out.println(wids);
//		Iterator<String> it = wids.iterator();
//		String mainTab = it.next();
//		String newTab = it.next();
//		driver.switchTo().window(newTab);
//		WebElement aboutSection = driver.findElement(By.className("article-title"));
//		System.out.println(aboutSection.getText());
//		driver.findElement(By.linkText("See more →")).click();
//		List<WebElement> articleLists = driver.findElements(By.xpath("//ul[@class=\"article-list\"]/li"));
//		for (WebElement alists : articleLists) {
//			alists.click();
//			System.out.println(alists.getText());

//			About VWO Data360
//			Working With Profiles in VWO
//			Working With Attributes in VWO
//			Working With Events in VWO
//			Working With Segments in VWO Data360
//			Working With Triggers in VWO
//			Working With Metrics in VWO
//			VWO Metric Reports
//			Migrate Goals and Funnels to Metric Reports and Funnel Reports
//			Tracking Multi-Currency Conversions in VWO
//			How to Track Offline Conversions Using VWO Data360?
//			How to Track Visitors Based on Time Spent?
//			How to Track Visitors Based on Scroll Level?
//			Track Clicks Based on Text on Your Web Page
//			Ways to Add Custom Attribute / Event Code to your Webpages
//			Using Audit in VWO
//			Working with Pages in VWO
//			Fastrack Your Campaign Pages Configuration With VWO Pages Copilot
//			Creating Funnels With VWO Data360

//		}
		// TEST CASE 20
//		WebElement data360 = driver.findElement(By.xpath("//span[text()='Data360']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", data360);
//		data360.click();
//		driver.findElement(By.xpath("//span[text()='Events']")).click();
//		driver.findElement(
//				By.xpath("//div[@class=\"page-header page-header--fixed ng-scope\"]//button/span[text()='Create']"))
//				.click();
//		driver.findElement(By.id("event-name")).sendKeys("TEST EVENTS");
//		driver.findElement(By.xpath("//button[text()=' Create ']")).click();
//		WebElement eventCreationText = driver.findElement(By.xpath("//p[text()='Basic information about the event']"));
//		String eventText = eventCreationText.getText();
//		System.out.println(eventText);

		// TEST CASE 21
//		WebElement data360 = driver.findElement(By.xpath("//span[text()='Data360']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", data360);
//		data360.click();
//		driver.findElement(By.xpath("//span[text()='Funnels']")).click();
//		driver.findElement(By.xpath("//div[@class=\"page-header page-header--fixed ng-scope\"]//span[text()='Create']"))
//				.click();
//		driver.findElement(By.id("funnelName")).sendKeys("TEST FUNNEL");
//		
//		driver.findElement(By.xpath("//button//span[text()='Add a step']")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("TEST EVENTS",Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Add a step']")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("TEST EVENTS",Keys.ENTER);
//		
//		driver.findElement(By.xpath("//button[text()=' Create ']")).click();
		
		//TEST CASE 22
//		driver.findElement(By.xpath("//span[text()='Plan']")).click();
//		driver.findElement(By.xpath("//span[text()='Observations']")).click();
//		driver.findElement(By.xpath("//button[text()=' Create an Observation ']")).click();
//		driver.findElement(By.id("create-observation-description")).sendKeys("TEST OBSERVATION");
//		driver.findElement(By.xpath("//button[text()='Create']")).click();
//		WebElement observationText = driver.findElement(By.xpath("(//span[text()='Observations'])[2]"));
//		System.out.println(observationText.getText());
		
		//TEST CASE 23
//		driver.findElement(By.xpath("//span[text()='Plan']")).click();
//		driver.findElement(By.xpath("//span[text()='Hypotheses']")).click();
//		driver.findElement(By.xpath("//button[text()=' Create a Hypothesis ']")).click();
//		driver.findElement(By.xpath("(//div[@data-qa=\"opesuxkore\"])[1]")).click();
//		driver.findElement(By.xpath("(//div[@data-qa=\"uugosdfapi\"])[1]")).click();
//		driver.findElement(By.id("create-hypothesis-solution")).sendKeys("TEST HYPOTHESIS");
//		driver.findElement(By.id("create-hypothesis-problem")).sendKeys("TEST HYPOTHESIS PROBLEM");
//		driver.findElement(By.xpath("//button[text()='Create']")).click();
//		driver.navigate().to("https://app.vwo.com/#/plan/hypotheses/progressview?accountId=1113962");
//		Actions act = new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//div[@data-qa=\"bakudurozo\"]"));
//		WebElement target = driver.findElement(By.xpath("(//div[@dnd-inserted=\"onHypothesisInserted($index)\"])[2]"));
//		act.dragAndDrop(source, target).build().perform();
		
		//TEST CASE 24
//		driver.findElement(By.xpath("//span[text()='Configurations']")).click();
//		driver.findElement(By.xpath("//span[text()='Websites and Apps']")).click();
//		driver.findElement(By.xpath("//button[text()=' Connect Now ']")).click();
//		driver.findElement(By.xpath("//*[text()='Website']")).click();
//		driver.findElement(By.id("platformInfo-url")).sendKeys("www.factoreal.com");
//		driver.findElement(By.xpath("//button[text()=' Add domain ']")).click();
//		
//		WebElement domainPage = driver.findElement(By.xpath("(//span[text()='Debugger'])[2]"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		wait.until(ExpectedConditions.textToBePresentInElement(domainPage, "Debugger"));
		
		//TEST CASE 24 CONTINUED & TEST CASE 25
//		driver.navigate().to("https://app.vwo.com/#/websites-and-apps/connected/website/4/code?accountId=1113962");
//
//		WebElement checkUrl = driver.findElement(By.id("urlCheckInput"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", checkUrl);
//
//		checkUrl.sendKeys("https://www.factoreal.com");
//		driver.findElement(By.xpath("//span[text()='Check']")).click();
//
//		// Brief wait to allow the new window to open
//		Thread.sleep(2000); // 2 seconds
//
//		// Get all window handles and switch
//		Set<String> windowHandles = driver.getWindowHandles();
//		Iterator<String> iterator = windowHandles.iterator();
//		String parentWindow = iterator.next();
//		String childWindow = iterator.next();
//
//		driver.switchTo().window(childWindow);
//		System.out.println("Title of child window (factoreal page): " + driver.getTitle());

		
		//TEST CASE 26
//		driver.findElement(By.xpath("//span[text()='Configurations']")).click();
//		driver.findElement(By.xpath("//span[text()='Integrations']")).click();
//		driver.findElement(By.xpath("//button[text()=' Request New Integration ']")).click();
//		driver.findElement(By.id("requested-integration-name")).sendKeys("test integration name");
//		driver.findElement(By.id("requested-integration-reason")).sendKeys("test integration reason");
//		driver.findElement(By.xpath("//button[text()='Request Integration']")).click();
		
		//TEST CASE 27
//		driver.findElement(By.xpath("//span[text()='Configurations']")).click();
//		driver.findElement(By.xpath("//span[text()='Pages']")).click();
//		driver.findElement(By.xpath("//span[text()='Create']")).click();
//		driver.findElement(By.id("save-page-name")).sendKeys("TEST PAGES NAME");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-qa=\"oqanadxozu\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='URL contains']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter URL']")).sendKeys("https://www.google.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter URL of a page']")).sendKeys("https://www.google.com");
//		driver.findElement(By.xpath("//button[text()=' Create ']")).click();
		
		//TEST CASE 28
//		driver.findElement(By.xpath("//span[text()='Updates']")).click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		Iterator<String> iterator = windowHandles.iterator();
//		String pid = iterator.next();
//		String cid = iterator.next();
//		Thread.sleep(2000);
//		driver.switchTo().window(cid);
//		System.out.println("Switched tab: Current URL is: " + driver.getCurrentUrl());
		
		//TEST CASE 29
//		driver.findElement(By.xpath("//span[text()='Updates']")).click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		Iterator<String> iterator = windowHandles.iterator();
//		String pid = iterator.next();
//		String cid = iterator.next();
//		Thread.sleep(2000);
//		driver.switchTo().window(cid);
//		System.out.println("Switched tab: Current URL is: " + driver.getCurrentUrl());
//		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
//		driver.findElement(By.xpath("//button[@data-hash=\"pricing\"]")).click();
//		driver.findElement(By.id("modal-req-demo-v1-fname")).sendKeys("Dibyajyoti");
//		driver.findElement(By.id("modal-req-demo-v1-lname")).sendKeys("Pattnaik");
//		driver.findElement(By.id("modal-req-demo-v1-email")).sendKeys("dpattnaik8833@google.com");
//		driver.findElement(By.id("modal-req-demo-v1-pnumber")).sendKeys("9900029663");
//		driver.findElement(By.id("modal-req-demo-cu-message")).sendKeys("TEST COMMENTS");
//		driver.findElement(By.id("modal-req-demo-cu-gdpr-consent-checkbox")).click();
//		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
//		Thread.sleep(2000);
//		WebElement successMessage = driver.findElement(By.xpath("//h4[text()='Thanks for your request!']"));
//		System.out.println(successMessage.getText());
//		WebElement successMessage2 = driver.findElement(By.xpath("//p[text()='A VWO Account Manager will get back to you soon.']"));
//		System.out.println(successMessage2.getText());
		
		//TEST CASE 30
		driver.findElement(By.xpath("//span[text()='Updates']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String pid = iterator.next();
		String cid = iterator.next();
		Thread.sleep(2000);
		driver.switchTo().window(cid);
		System.out.println("Switched tab: Current URL is: " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		WebElement footerLinksSection = driver.findElement(By.xpath("//div[@class=\"D(f)--md D(n)--print Mb(30px)--md Mb(70px)\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center', inline: 'center'});", footerLinksSection);
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class=\"D(f)--md D(n)--print Mb(30px)--md Mb(70px)\"]//ul/li"));
		for (WebElement links : footerLinks) {
			System.out.println(links.getText());
			
		}
		
		
		
		
		

	}

}
