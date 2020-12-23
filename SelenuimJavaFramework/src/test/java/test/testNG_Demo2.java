package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Demo2 {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearchTest2()
	{
		//goto google url
		driver.get("https://www.google.com/");

		//		driver.get("http://www.facebook.com/");

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

	}

	@Test
	public static void googleSearchTest3()
	{
		//goto google url
		driver.get("https://www.google.com/");

		//		driver.get("http://www.facebook.com/");

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

	}
	
	@Test
	public static void googleSearchTest4()
	{
		//goto google url
		driver.get("https://www.google.com/");

		//		driver.get("http://www.facebook.com/");

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

	}
	
	@AfterTest
	public void tearDownTest() {

		driver.close();
		System.out.println("Test complted successfully");

	}

}
