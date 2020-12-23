package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class demoMultiBrowserParallel {

	WebDriver driver =null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(String browserName) {
		
		System.out.println("Browser Name : "+browserName);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else	if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",projectPath + "\\drivers\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
					}
		
		else if (browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver",projectPath + "\\drivers\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		
	}
	
	@Test
	public void test() {
		
		driver.get("https://www.google.com");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		
	}
	
}
