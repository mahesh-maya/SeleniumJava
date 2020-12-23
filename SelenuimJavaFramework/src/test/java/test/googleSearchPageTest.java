package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPageObjects;

public class googleSearchPageTest {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();

	}
	
	public static void googleSearchTest()
	{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		//goto google url
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		
		driver.close();
		
		System.out.println("Test complted successfully");

	}
}
