import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws Exception {

		String projectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		//name
		//		WebElement textBox = driver.findElement(By.name("q"));
		//		textBox.sendKeys("abcd");

		//xpath
		WebElement textbox =	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		textbox.sendKeys("abcd");

		List<WebElement> elementList	= driver.findElements(By.xpath("//input"));
		int size = elementList.size();
		System.out.println("Size of Input type : "+size);

		Thread.sleep(3000);
		driver.close();
	}

}
