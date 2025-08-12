package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        try {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            // ❌ Do NOT add "--headless" if you want to see the browser
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
            System.out.println("✅ Browser launched and navigated to login page.");
        } catch (Exception e) {
            System.err.println("❌ Failed to initialize ChromeDriver: " + e.getMessage());
            throw new RuntimeException("Driver setup failed", e);
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            try {
                Thread.sleep(3000); // 👀 Pause to observe browser before closing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
            System.out.println("✅ Browser closed successfully.");
        }
    }
}