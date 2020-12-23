package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_googleSearch {

	public static void main(String[] args) {
	
	     
		googleSearchTest();
		
	}
	
	public static void googleSearchTest()
	{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google url
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		
		//enter text in searchbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		//click on submit button
	//	driver.findElement(By.name("btnK")).click();
		driver .findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("test complted successfully");
		
	}
}
