package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
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
import page.HomePage;
import page.ProductDetailPage;
import page.ProductPage;
import page.Servicepage;

public class ToVerifyAddToCartOptionaOnApplication extends Base {

	WebDriver driver;
	 HomePage homePage;
	 ProductDetailPage productDetailPage ;
	 ProductPage productPage ;
	 Servicepage servicepage ;
	 
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
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		  
		  
	 }	
	 
	 
			 
	@BeforeClass
	 public void createPOMobject() {
		  homePage = new HomePage(driver); 
		   productDetailPage = new ProductDetailPage(driver); 
		 productPage = new ProductPage(driver);
	}

	
	 
   @BeforeMethod 
   public void gotoSearchbar() throws InterruptedException {
	   System.out.println("BeforeMethod");
	   driver.get("https://www.amazon.in/");
	  homePage.Sendsearchbar("mobile");
	  homePage.clicksearchbarButton();
	  
	  productDetailPage.clickResult();
	  productPage.clickAddtoCart();
	   productPage.clickcart();
		  productPage.SelectQty();

	    
	     
   }
	
	 @Test (priority = 1)
			 
    public void testng () throws InterruptedException {
 	   System.out.println("TestA");
 	  
 	   String expectedTextMsg = "Amazon.in Shopping Cart";
 	   String actualMSg =driver.getTitle();
 	  System.out.println(driver.getTitle());
 	   String expectedUrl= "https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?";
 	   String actualUrl =driver.getCurrentUrl();
 	   System.out.println(driver.getTitle());  
 
 		Assert.assertEquals(actualMSg, expectedTextMsg );
 		Assert.assertEquals(actualUrl, expectedUrl);
// 		if (expectedTextMsg.equals(actualMSg)&&expectedUrl.equals(actualUrl))	
// 		{
// 			System.out.println("Passed");
// 			
// 		}
// 		else
// 		{
// 				System.out.println("Failed");
// 		}
//	
	 }
	 @Test  (enabled  = false)
	 public void testng1 () throws InterruptedException  {
		 System.out.println("TestB");
		 productPage.clickAddtoCart();
		   productPage.clickcart();
		 productPage.clickBuyNow();
		 String expectedTextMsg = "Amazon Sign In";
		 String actualMSg =driver.getTitle();
		 System.out.println(driver.getTitle());  
		 Assert.assertEquals(actualMSg, expectedTextMsg );
	 		
//		 if (expectedTextMsg.equals(actualMSg)&&expectedUrl.equals(actualUrl))	
//		 {
//			 System.out.println("Passed");
//			 
//		 }
//		 else
//		 {
//			 System.out.println("Failed");
	 }
	 		
	 		
          @Test   (priority = 2)
	 		 public void testng2 () throws InterruptedException {
			 System.out.println("TestC");
			 productPage = new ProductPage(driver);
			// String subtotal = productPage.getSubtotal();
			 System.out.println(productPage.getSubtotal());
	 			 String expectedTextMsg = "0.00";
	 			 String actualMSg =productPage.getSubtotal();
	 			 	 Assert.assertEquals(actualMSg, expectedTextMsg );
	 		 				
	 }
	 
          @AfterMethod
	       public void logOutFromApplication () {           //logOut
	    	   System.out.println("AfterMethd");
	       }
	       
	       @AfterClass
	       public void clearObject() {
	    	   homePage = null; 
	    	   productPage = null; 
}
//	       public void closedBrowser() {
//	    	   System.out.println("AfterClass");
//	    	   driver.quit();
//	       }

           @AfterTest
           public void closedBrowser() {
	    	   System.out.println("AfterTest");
	    	   driver.quit();
	    	   driver = null;
	    	   System.gc();
	       }
	
}
	
	
	
	
	
	
	
	
	
	