package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsersetup.Base;
import page.HomePage;
import page.ProductDetailPage;  
import page.ProductPage;

public class  ToVerifytheproductDetails  extends Base{

	WebDriver driver;
	 HomePage homePage;
	 ProductDetailPage productDetailPage;
	 ProductPage productPage;
	 
	 @Parameters ("browser")
	 @BeforeTest 
	  public void openBrowser (String browserName) {
		  System.out.println("BeforeTest");
		  if (browserName.equals("Chrome"))
           {
			  driver = openChromeBrowser();
           }
		  
		  if (browserName.equals("Edge"))
		  {  
			  driver = openEdgeBrowser();
		  }
	 
	 }
	 
	 
	@BeforeClass
	 public void createPOMobject() {
		  HomePage homePage = new HomePage(driver); 
		  ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
		  ProductPage productPage = new ProductPage(driver);
	}
	
	
//   public void openBrowser () {
//  System.out.println("BeforeClass");
//  System.setProperty("webdriver.chrome.driver", "C:\\\\selinium\\chromedriver_win32 (1)\\chromedriver.exe");
//	 driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //}
	
	 
   @BeforeMethod
   public void gotoSearchbar() {
	   System.out.println("BeforeMethod");
	   driver.get("https://www.amazon.in/");
	
	 homePage.Sendsearchbar("mobile");
	 homePage.clicksearchbarButton();
	
	 productDetailPage.clickResult();
	 productPage.clickBuyNow();
   }
	
   @Test 
	    public void testClass () {
	 	   System.out.println("Test");
	 	  ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
	 	  String expectedTextMsg = "Amazon Sign In";
	 	   String actualMSg = productDetailPage.getText();
	 			   
	 		if (expectedTextMsg.equals(actualMSg))	
	 		{
	 			System.out.println("Passed");
	 			
	 		}
	 		else
	 		{
	 				System.out.println("Failed");
	 		}
   }
	 		@AfterMethod
	 	     public void logOutFromApplication () {           //logOut
	 	  	   System.out.println("AfterMethd");
	 	     }
	 	     
 	     @AfterClass
 	    public void clearobject() {
 	    	homePage = null;
 	    	productDetailPage = null;
 	    	productPage = null;
 	     }
 	     
//	 	     public void closedBrowser() {
//	 	  	   System.out.println("AfterClass");
//	 	  	   driver.quit();
//	 	     }
 	     
	 	     @AfterTest
	 	     public void closedBrowser() {

	 	  	   System.out.println("AfterTest");
	 	  	   driver.quit();
	 	    	driver = null;
	 	    	System.gc();
	 	     }
	 		
   } 	    	
	 		
	
   


	

