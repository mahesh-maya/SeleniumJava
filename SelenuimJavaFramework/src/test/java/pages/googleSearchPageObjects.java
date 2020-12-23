package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {

	WebDriver driver =null;
	
	
	public googleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By textBox_Search = By.name("q");
	By buton_search = By.name("btnK");
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textBox_Search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(buton_search).sendKeys(Keys.RETURN);
	}
	
	
	
	
	
	
}
