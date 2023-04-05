package TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.Homepage;
import Page.ProductDetailspage;
import Page.ProductPage;
import module.SignUpPopUp;

public class TestClass1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\selinium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
	signUpPopUp.executeScriptclose();

	Homepage homePage = new Homepage(driver); 
	 homePage.sendsearchbar("mobile");
	 homePage.clicksearchbarButton();
	 
	 ProductDetailspage productDetailPage = new ProductDetailspage(driver);
			
	 productDetailPage.clickResults();
	 
	 ProductPage productPage = new Page.ProductPage(driver);
	  productPage.clickAddtoCart();
	 
}
}
