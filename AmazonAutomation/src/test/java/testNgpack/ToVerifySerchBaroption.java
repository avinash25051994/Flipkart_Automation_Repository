package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsersetup.Base;
import module.SignUpPopUp;
import page.HomePage;
import page.ProductDetailPage;
import page.ProductPage;

public class ToVerifySerchBaroption extends Base {
	WebDriver driver;
	 HomePage homePage;
	 ProductDetailPage productDetailPage ;
	 
	 @Parameters ("browser")
	 @ BeforeTest 
	  public void openBrowser (String browserName) {
		  System.out.println("BeforeTest");
		  
		  if (browserName.equals("Chrome"))
		  {  
			  driver = openChromeBrowser();
		  }
		  if (browserName.equals(""))
		  {  
			  driver = openEdgeBrowser();
		  }
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }	 
	 
	@BeforeClass
	 public void createPOMobject() {
		  HomePage homePage = new HomePage(driver);
		ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
	
	}
	
	
//    public void openBrowser() {
//   System.out.println("BeforeClass");
//   System.setProperty("webdriver.chrome.driver", "C:\\\\selinium\\chromedriver_win32 (1)\\chromedriver.exe");
//	 driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	
//     }
	
	 
    @BeforeMethod 
    public void gotoSearchbar() {
 	   System.out.println("BeforeMethod");
 	   driver.get("https://www.amazon.in/");
 	
 	 homePage.Sendsearchbar("mobile");
	 homePage.clicksearchbarButton();
	 
	 productDetailPage.clickResult();
		
    }
	
	 @Test  
     public void testng () {
  	   System.out.println("TestA");
  	  HomePage homePage = new HomePage(driver); 
  	  String expectedTextMsg = "RESULTS";
  	   String actualMSg =homePage.getText();
  			   Assert.assertEquals(actualMSg, expectedTextMsg);
//  		if (expectedTextMsg.equals(actualMSg))	
//  		{
//  			System.out.println("Passed");
//  			
//  		}
//  		else
//  		{
//  				System.out.println("Failed");
//  		}
	
	
	}
	 @Test
     public void testng1 () {
  	   System.out.println("TestB");
  	 ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
  	  	  String expectedTextMsg = "";
  	     String actualMSg = driver.getCurrentUrl();
  	   Assert.assertEquals(actualMSg, expectedTextMsg);
//  		if (expectedTextMsg.equals(actualMSg))	
//  		{
//  			System.out.println("Pass");
//  			
//  		}
//  		else
//  		{
//  				System.out.println("Failed");
//  		}
//	 }
//  		 
  
}
	 @Test(dependsOnMethods= "testng1")
     public void testng2 () {
  	   System.out.println("TestC");
  	 ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
  	  	  String expectedTextMsg = "";
  	     String actualMSg = driver.getCurrentUrl();
  	   Assert.assertEquals(actualMSg, expectedTextMsg);

	 }
	 @AfterMethod
     public void logOutFromApplication () {           //logOut
  	   System.out.println("AfterMethd");
     }
    
	 @AfterClass
	    public void clearobject() {
	    homePage = null;
	    productDetailPage = null;
	 }  	
//     public void closedBrowser() {
//  	   System.out.println("AfterClass");
//  	   driver.quit();
//     }
     @AfterTest
     public void closedBrowser() {

  	   System.out.println("afterTest");
  	   driver.quit();
  	 driver = null;
  	System.gc();
     }
}
