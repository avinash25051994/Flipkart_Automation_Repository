package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

import Page.Homepage;
import Page.ProductDetailspage;
import Page.ProductPage;
import browsersetup.Base;
import module.SignUpPopUp;


public class ToVerifytheAddtoCartoptiononAppplication extends Base{

	WebDriver driver;
	SignUpPopUp signUpPopUp;
	Homepage homePage;
	ProductDetailspage productDetailPage;
	 ProductPage productPage;
	 
	 @Parameters ("browser")
	 @BeforeTest 
	  public void openBrowser (String browserName) {
		  System.out.println("BeforeTest");
		  
		  if (browserName.equals("Firefox"))
		  {  
			  driver = openFirefoxBrowser();
		  }
		  if (browserName.equals("Edge"))
		  {  
			  driver =openEdgeBrowser ();
		  }
		  
	 }
	 
	@BeforeClass
	  public void createPOMObject() {
   signUpPopUp = new SignUpPopUp(driver);
   Homepage homePage = new Homepage(driver);
   ProductDetailspage productDetailPage = new ProductDetailspage(driver);
   ProductPage productPage = new Page.ProductPage(driver);
	}
		  
	  	   
	@BeforeMethod
         public void gotoSignUpPopUp() {
  	     System.out.println("BeforeMethod");
  		 driver.get("https://www.flipkart.com/");

  		 SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
  		signUpPopUp.executeScriptclose();

  		 
  		 homePage.sendsearchbar("mobile");
  		 homePage.clicksearchbarButton();
  		
  		
 		  productDetailPage.clickResults();
	     
 		 
  	      productPage.clickAddtoCart();
 	  
	} 
	 
  	   @Test  (priority =1)
       public void test () {
    	   System.out.println("Test");
    	   String expectedTextMsg = "We're sorry! Only 1 unit(s) for each customer";
    	   String actualMSg =driver.getCurrentUrl();
    		System.out.println(driver.getCurrentUrl());	
    		
    		Assert.assertEquals(actualMSg, expectedTextMsg);
    		
//    		if (expectedTextMsg.equals(actualMSg))	
//    		{
//    			System.out.println("Passed");
//    			
//    		}
//    		else
//    		{
//    			
//    			System.out.println("Failed");
    		}
    		
  	 @AfterMethod
       public void logOutFromApplication () {           //logOut
    	   System.out.println("AfterMethd");
       }
		 
		 @AfterClass
		 public void clearObjects() {
			  signUpPopUp = null;
			  homePage= null;
		      productDetailPage= null;
			  productPage= null;
		 }
		@AfterTest
      public void closedBrowser() {

   	   System.out.println("AfterTest");
   	   driver.quit();
   	   driver = null;
   	   System.gc();//Garbage collection
      }

  	   
}
  	   
  	   
 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
  		    
