package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWaitDemo {

	public static void main(String[] args) {
		
		test();
		
	}
	
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element =	wait.until(ExpectedConditions.elementToBeClickable(By.name("ancd")));
		
//		driver.findElement(By.name("abcd")).click();
	
	
	
		
		driver.close();
		System.out.println("test complted successfuly");
		
	}

}
