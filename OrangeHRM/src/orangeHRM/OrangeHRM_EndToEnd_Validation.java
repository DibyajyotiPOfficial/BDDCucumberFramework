package orangeHRM;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_EndToEnd_Validation {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"G:\\2025\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The URL is: " + driver.getCurrentUrl());

		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginBtn.click();
		System.out.println("User is successfully logged in.");
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Current Window Title: " + driver.getTitle());
		// CODE FOR USER PROFILE SECTION
//		WebElement userProfile = driver.findElement(By.className("oxd-userdropdown-tab"));
//		userProfile.click();
//		WebElement aboutOption = driver.findElement(By.xpath("//a[text()='About']"));
//		aboutOption.click();
//		System.out.println("About poped up successfully.");
//		//Close the about pop up
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='×']")).click();
//		System.out.println("About pop up closed successfully.");
//		Thread.sleep(1000);
//		//clicking again on user profile
//		userProfile.click();
//		WebElement supportOption=driver.findElement(By.xpath("//a[text()='Support']"));
//		supportOption.click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		//clicking again on user profile
//		Thread.sleep(1000);
//		userProfile.click();
//		WebElement changePasswordOption = driver.findElement(By.xpath("//a[text()='Change Password']"));
//		changePasswordOption.click();
//		WebElement currentPassword=driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
//		currentPassword.sendKeys("admin171124");
//		WebElement newPassword = driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
//		newPassword.sendKeys("admin1711");
//		WebElement confirmPassword = driver.findElement(By.xpath("(//input[@type=\"password\"])[3]"));
//		confirmPassword.sendKeys("admin1711");
//		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		userProfile.click();
//		Thread.sleep(1000);
//		WebElement logoutOption = driver.findElement(By.xpath("//a[text()='Logout']"));
//		logoutOption.click();
//		System.out.println("User logged out successfully.");

		// CODE FOR QUICK LAUNCH SECTION
//		WebElement assignLeave = driver.findElement(By
//				.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"Assign Leave\"]"));
//		assignLeave.click();
		//ASSIGN LEAVE FUNCTIONALITY CODE
//		WebElement assignLeaveText = driver.findElement(By.xpath("//h6[text()='Assign Leave']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		wait.until(ExpectedConditions.visibilityOf(assignLeaveText));
//		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Timothy Campbell");
//		Thread.sleep(2000);
//		//Handling dynamic drop down
//		WebElement listbox = wait.until(
//			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']"))
//			);
//		System.out.println("Listbox content:\n" + listbox.getAttribute("innerHTML"));
//		List<WebElement> options = driver.findElements(
//			    By.xpath("//div[@role='listbox']//span")
//			);
//
//			for (WebElement opt : options) {
//			    String text = opt.getText();
//			    if (text.equalsIgnoreCase("Timothy Campbell")) {
//			        opt.click();
//			        break;
//			    }
//			}
//			WebElement leaveTypeDropdown = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
//			leaveTypeDropdown.click();
//			WebElement leaveType = driver.findElement(By.xpath("//span[text()='CAN - Matternity']"));
//			leaveType.click();
//			// Wait for input fields
//			WebElement fromDate = wait.until(ExpectedConditions.elementToBeClickable(
//			        By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")));
//			fromDate.click();
//			fromDate.clear();
//			fromDate.sendKeys(Keys.CONTROL + "a");
//			fromDate.sendKeys(Keys.DELETE);
//			fromDate.sendKeys("2025-20-06");
//
//			Thread.sleep(1000);
//
//			WebElement toDate = wait.until(ExpectedConditions.elementToBeClickable(
//			        By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")));
//			toDate.click();
//			toDate.clear();
//			toDate.sendKeys(Keys.CONTROL + "a");
//			toDate.sendKeys(Keys.DELETE);
//			toDate.sendKeys("2025-22-06");
//
//	        JavascriptExecutor js = (JavascriptExecutor)driver;
//	        WebElement assignBtn = driver.findElement(By.xpath("//button[@type=\"submit\" and text()=' Assign ']"));
//	        js.executeScript("arguments[0].scrollIntoView(true)",assignBtn);
//	        assignBtn.click();
//	        
//	        WebElement confirmAssignment = driver.findElement(By.xpath("//button[text()=' Ok ']"));
//	        confirmAssignment.click();
	        
//	       driver.navigate().back();
//	        WebElement LeaveList = driver.findElement(By.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"Leave List\"]"));
//	        LeaveList.click();
//	        System.out.println(driver.getCurrentUrl());
//	        driver.navigate().back();
//	        WebElement timesheets = driver.findElement(By.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"Timesheets\"]"));
//	        timesheets.click();
//	        System.out.println(driver.getCurrentUrl());
//	        driver.navigate().back();
//	        WebElement applyLeave = driver.findElement(By.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"Apply Leave\"]"));
//	        applyLeave.click();
//	        System.out.println(driver.getCurrentUrl());
//	        driver.navigate().back();
//	        WebElement myLeave = driver.findElement(By.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"My Leave\"]"));
//	        myLeave.click();
//	        System.out.println(driver.getCurrentUrl());
//	        driver.navigate().back();
//	        WebElement myTimesheet = driver.findElement(By.xpath("//button[@class=\"oxd-icon-button orangehrm-quick-launch-icon\" and @title=\"My Timesheet\"]"));
//	        myTimesheet.click();
//	        System.out.println(driver.getCurrentUrl());
//	        driver.navigate().back();
	        
	        //HELP FUNCTIONALITY
//	        WebElement helpIcon = driver.findElement(By.xpath("//button[@title=\"Help\"]"));
//	        helpIcon.click();
//	        
//	        String pid = driver.getWindowHandle();
//	        System.out.println("PID: "+ pid);
//	        Set<String> allWindowIds = driver.getWindowHandles();
//	        System.out.println("All window ids: " + allWindowIds);
//	        allWindowIds.remove(pid);
//	        String cid = allWindowIds.iterator().next();
//	        driver.switchTo().window(cid);
//	        driver.findElement(By.xpath("//span[text()='Admin User Guide']")).click();
//	        System.out.println("Admin user guide card clicked and the URL is: " + driver.getCurrentUrl());
//	        List<WebElement> adminUserGuideLinks = driver.findElements(By.xpath("//div[@id=\"main-content\"]//li"));
//	        for (WebElement link : adminUserGuideLinks) {
//	            System.out.println(link.getText());
//	        }
	        //STOP WATCH - TIME AT WORK SECTION
//		WebElement stopwatch = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]"));
//		stopwatch.click();
//		driver.findElement(By.xpath("//button[text()=' In ']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()=' Out ']")).click();
				
		//MY ACTIONS SECTION
		driver.findElement(By.xpath("//p[text()='(1) Timesheet to Approve']")).click();
		List<WebElement> leftPanelOptions = driver.findElements(By.xpath("//ul[@class=\"oxd-main-menu\"]//li"));
		// Iterate through each menu item
		for (int i = 0; i < leftPanelOptions.size(); i++) {
		    // Re-locate the elements each time due to DOM refresh after navigation
		    leftPanelOptions = driver.findElements(By.xpath("//ul[@class=\"oxd-main-menu\"]//li"));

		    WebElement item = leftPanelOptions.get(i);
		    String label = item.getText();
		    System.out.println("Clicking: " + label);

		    item.click();
		    
		   
		
			}
		 	WebElement userProfile = driver.findElement(By.className("oxd-userdropdown-tab"));
		    userProfile.click();
			Thread.sleep(1000);
			WebElement logoutOption = driver.findElement(By.xpath("//a[text()='Logout']"));
			logoutOption.click();
			System.out.println("User logged out successfully.");
			driver.quit();
	}
	
	        
		/*
		 * // Clicking on hyperlink
		 * driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 */
		/*
		 * // Handling tabs String parentWindow = driver.getWindowHandle();
		 * System.out.println("Parent window id: " + parentWindow); Set<String>
		 * allWindows = driver.getWindowHandles();
		 * System.out.println("Child window id: " + allWindows); for (String windowId :
		 * allWindows) { if (!windowId.equals(parentWindow)) {
		 * driver.switchTo().window(windowId);
		 * System.out.println("Switched to child window: " + windowId); }
		 * 
		 * }
		 */

		// Now we're in the child window. Click on Book a Free Demo
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//				WebElement bookADemoBtn = wait.until(ExpectedConditions.elementToBeClickable(
//						driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]"))));
//				bookADemoBtn.click();
//				
//				//FILLING UP FORM TO BOOK A FREE DEMO
//				driver.findElement(By.id("Form_getForm_FullName")).sendKeys("test free demo");
//				driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9900029692");
//				driver.findElement(By.id("Form_getForm_Email")).sendKeys("testfreedemo@gmail.com");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//input[@placeholder=\"Company Name\"]")).sendKeys("test limited");
//				Thread.sleep(1000);
//				WebElement countryDropdown = driver.findElement(By.id("Form_getForm_Country"));
//				Select sel = new Select(countryDropdown);
//				sel.selectByVisibleText("India");
//				Thread.sleep(1000);
//				WebElement noOfEmployees = driver.findElement(By.xpath("//select[@name=\"NoOfEmployees\"]"));
//				Select sel1 = new Select(noOfEmployees);
//				//sel.selectByVisibleText("11 - 50 	");
//				Thread.sleep(1000);
//				sel1.selectByValue("11 - 50");
//				Thread.sleep(25000);
//				WebElement getFreeDemoButton = driver.findElement(By.xpath("//input[@value=\"Get a Free Demo\"]"));
//				wait.until(ExpectedConditions.elementToBeClickable(getFreeDemoButton));
//				getFreeDemoButton.click();
//				System.out.println("Clicked on Get a Free Demo Button.");
//				System.out.println(driver.findElement(By.xpath("//h1[text()='Thank you.']")).getText());
//				System.out.println(driver.findElement(By.xpath("//p[text()='We’ll be contacting you shortly!  ']")).getText());
//				/*
//				 * Thank you. We’ll be contacting you shortly!
//				 */
		// Optionally, close child and return to parent
		// driver.close();
		// driver.switchTo().window(parentWindow);

		// FILLING UP FORM TO CONTACT SALES TEAM
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		 * WebElement bookADemoBtn = wait.until(ExpectedConditions
		 * .elementToBeClickable(driver.findElement(By.
		 * xpath("(//button[text()='Contact Sales'])[2]")))); bookADemoBtn.click();
		 * driver.findElement(By.id("Form_getForm_FullName")).sendKeys("test free demo"
		 * ); driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9900029692");
		 * driver.findElement(By.id("Form_getForm_Email")).sendKeys(
		 * "testfreedemo@gmail.com"); Thread.sleep(1000); WebElement countryDropdown =
		 * driver.findElement(By.id("Form_getForm_Country")); Select sel = new
		 * Select(countryDropdown); sel.selectByVisibleText("India");
		 * Thread.sleep(1000); WebElement noOfEmployees =
		 * driver.findElement(By.xpath("//select[@name=\"NoOfEmployees\"]")); Select
		 * sel1 = new Select(noOfEmployees); Thread.sleep(1000);
		 * sel1.selectByValue("11 - 50");
		 * driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("test analyst");
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//textarea[@placeholder=\"Your Message*\"]"))
		 * .sendKeys("This is used for testing contact sales team."); //Scrolling down
		 * to element WebElement contactSalesBtn =
		 * driver.findElement(By.id("Form_getForm_action_submitForm"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript(
		 * "arguments[0].scrollIntoView({behavior:'smooth',block:'center'});",
		 * contactSalesBtn); //js.executeScript("window.scrollTo(0-500);");
		 * Thread.sleep(25000);
		 * driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		 * System.out.println("Successfully clicked on contact sales button");
		 * System.out.println(driver.findElement(By.xpath("//h1[text()='Thank you.']")).
		 * getText()); System.out.println(driver.findElement(By.
		 * xpath("//p[text()='We’ll be contacting you shortly!  ']")).getText());
		 * 
		 * break;
		 * 
		 * 
		 * /* // Clicking on social media icons List<WebElement> socialmediaIcons =
		 * driver.findElements(By.xpath("//div//a")); for (WebElement icons :
		 * socialmediaIcons) { try { icons.click(); Thread.sleep(2000); } catch
		 * (Exception e) { System.out.println("Error clicking element: " +
		 * e.getMessage()); }
		 * 
		 * }
		 */
		// The URL is:
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		// Logging in with valid credentials.
		/*
		 * WebElement username =
		 * driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		 * WebElement password =
		 * driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		 * username.sendKeys("Admin"); password.sendKeys("admin123"); WebElement
		 * loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 * loginBtn.click();
		 */
//		//Getting error message on logging in with invalid credentials
//		WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
//		System.out.println("The error message on invalid login is: " + errorMsg.getText());
		// Clicking on forgot password
//		WebElement forgotPwd = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
//		forgotPwd.click();
		// Passing user name in the forgot password page.
//		WebElement resetUsername = driver.findElement(By.xpath("//input[@name=\"username\"]"));
//		resetUsername.sendKeys("pdibyajyoti772@gmail.com");
//		WebElement resetPwdBtn = driver.findElement(By.xpath("//button[text()=' Reset Password ']"));
//		resetPwdBtn.click();
//		//Getting success message after passing username for forgot password
//		WebElement forgotPwdSuccessMsg = driver
//				.findElement(By.xpath("//h6[text()='Reset Password link sent successfully']"));
//		System.out.println(forgotPwdSuccessMsg.getText());//Reset Password link sent successfully
		// Canceling forgot password option
//		WebElement cancelBtn = driver.findElement(By.xpath("//button[text()=' Cancel ']"));
//		cancelBtn.click();
//		System.out.println("Current URL: " + driver.getCurrentUrl());

		

	}


