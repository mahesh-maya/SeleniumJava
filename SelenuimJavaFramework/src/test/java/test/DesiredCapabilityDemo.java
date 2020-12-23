package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityDemo {

	public static void main(String[] args) {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreZoomSetting", true);
		
		String projectPath = 	System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IE\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test complted succesffuly");
		
	}

}
