import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = 	System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
//		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\gecko\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IE\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");

		driver.close();
	}

}
