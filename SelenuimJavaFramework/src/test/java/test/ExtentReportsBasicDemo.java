package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		// start reporters
       ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
       
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test1", "This is my first test");
        
    	String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com");
		test1.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		test1.pass("Enetr Text in search box");
		
		driver .findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Click on Search button");
		
		driver.close();
		test1.pass("close the boweser");
		System.out.println("test complted successfully");
		
		  // calling flush writes everything to the log file
        extent.flush();

	}

}
