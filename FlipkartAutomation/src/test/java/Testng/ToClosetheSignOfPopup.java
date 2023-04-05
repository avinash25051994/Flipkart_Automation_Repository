package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.ProductDetailspage;
import browsersetup.Base;
import module.SignUpPopUp;

public class ToClosetheSignOfPopup extends Base {
	WebDriver driver;
	SignUpPopUp signUpPopUp;
	
	
	
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
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	
	  
	@BeforeClass
	  public void createPOMObject() {
     signUpPopUp = new SignUpPopUp(driver);
	}
		  
	
	@BeforeMethod
         public void gotoSignUpPopUp() {
  	     System.out.println("BeforeMethod");
  		 driver.get("https://www.flipkart.com/");
 	    signUpPopUp.executeScriptclose();
	}
	
	@Test
    public void test () {
 	   System.out.println("Test");
       String expectedURL = "https://www.flipkart.com/";
	   String actualURL = driver.getCurrentUrl();
	   System.out.println(driver.getCurrentUrl());
		   if (expectedURL.equals(actualURL))	
			   Assert.assertEquals(actualURL, expectedURL);
//		   {
//			   System.out.println("Passed");
//			   
//		   }
//		   else
//		   {
//			   
//			   System.out.println("Failed");
//		   }
	   }
	@AfterMethod
      public void logOutFromApplication () {           //logOut
   	   System.out.println("AfterMethd");
      }
		 
		 @AfterClass
		 public void clearObjects() {
			  signUpPopUp = null;
			  
		 }
		@AfterTest
     public void closedBrowser() {
  	   System.out.println("AfterTest");
  	   driver.quit();
  	   driver = null;
  	   System.gc();//Garbage collection
	       System.out.println("browser close");
	   
     }

	
}
