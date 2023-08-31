package browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	 public static WebDriver openFirefoxBrowser() {
		 System.setProperty("webdriver.gecko.driver", "src/test/resources/browserfile/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 return driver;
		}	
		public static WebDriver openEdgeBrowser() {
			System.setProperty("webdriver.edge.driver", "src/test/resources/browserfile/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			return driver;
		}	
}
