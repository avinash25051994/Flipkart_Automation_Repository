package Browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

   public class Base {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/browserfile/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	  return driver;
	}	
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "src/test/resources/browserfile/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}	
	
		
	
	
	
}
