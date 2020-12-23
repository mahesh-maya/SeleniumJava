package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class testNG_Demo {

	
		static WebDriver driver = null;
		public static	String browserName = null;
		static Logger logger =LogManager.getLogger(Log4jDemo.class); 

	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();

		}	

		logger.info("Browser started"); 

	}

	@Test
	public static void googleSearchTest()
	{

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver .findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest() {

		driver.close();
		System.out.println("Test complted successfully");

	}

}
