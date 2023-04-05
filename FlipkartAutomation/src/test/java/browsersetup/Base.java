package browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	 public static WebDriver openFirefoxBrowser() {
		 System.setProperty("webdriver.gecko.driver", "C:\\selinium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 return driver;
		}	
		public static WebDriver openEdgeBrowser() {
			System.setProperty("webdriver.edge.driver", "C:\\selinium\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			return driver;
		}	
}
