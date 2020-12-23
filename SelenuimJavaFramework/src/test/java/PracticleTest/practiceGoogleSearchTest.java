package PracticleTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practiclePages.*;

public class practiceGoogleSearchTest {

	static WebDriver driver =null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	practicegoogleSearchPage.textBox_Search(driver).sendKeys("Automation step by step");
	
	practicegoogleSearchPage.submitButton_Search(driver).sendKeys(Keys.RETURN);
		
	driver.close();
	System.out.println("Test complted succesfully");
		
	}
	
}
