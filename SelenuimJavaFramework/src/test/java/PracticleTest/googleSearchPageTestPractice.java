package PracticleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practiclePages.googleSearchPageObjectsPractice;

public class googleSearchPageTestPractice {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
	
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	
	googleSearchPageObjectsPractice googleSearchObjPractice = new googleSearchPageObjectsPractice(driver);
	
	//goto google url
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println("Title of the page : "+title);
			
			String url = driver.getCurrentUrl();
			System.out.println("Current URL : "+url);
			
			googleSearchObjPractice.setTextInSearchBox("A B C D");
			googleSearchObjPractice.clickOnSearchButton();
			
			driver.close();
			
			System.out.println("Test complted successfully");
	
	
	}
}
