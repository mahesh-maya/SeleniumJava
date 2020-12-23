package practiclePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjectsPractice {

	WebDriver driver =null;
	
	public googleSearchPageObjectsPractice(WebDriver driver) {
		this.driver= driver;
	}
	
	By textBox_Search = By.name("q");
	By button_Search = By.name("btnK");
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textBox_Search).sendKeys(text);
	}
	
	public void clickOnSearchButton() {
		driver.findElement(button_Search).sendKeys(Keys.RETURN);
	}
	
	
}
