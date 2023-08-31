package testNgpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Browsersetup.Base;
import Utils.Utility;
import module.SignUpPopUp;

public class  VerifyUserSignUpPopUp extends Base   {
	

	WebDriver driver;
	 SignUpPopUp signUpPopUp ;
	 String  testID;
	 static String sheet1;
	 
	 static ExtentTest test;
		static ExtentHtmlReporter reporter;
		
	 @Parameters  ("browser")
	 @ BeforeTest 
	 
	  public void openBrowser (String browserName) {
		 
		 reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
		 
		  System.out.println("BeforeTest");
		  
		  if (browserName.equals("Chrome"))
	   
		  {
			  driver = openChromeBrowser();
		  }
//		  if (browserName.equals("Edge"))
//		  {  
//			  driver = openEdgeBrowser();
//		  }
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }	 
	 



	




	@BeforeClass
       public void createPOMobject() throws EncryptedDocumentException, IOException, InterruptedException {
    	   SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
  	      
    	   
    	   
    	 //  String data = Utility.getExcelData(2,0);
       }

//          public void openBrowser () {
//	     System.out.println("BeforeClass");
//	     System.setProperty("webdriver.chrome.driver", "C:\\\\selinium\\chromedriver_win32 (1)\\chromedriver.exe");
//	 	 driver = new ChromeDriver();
//	 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	       }
	       
	       @BeforeMethod
	       public void gotoSignUpPopUp() throws InterruptedException, IOException {
	    	   System.out.println("BeforeMethod");
	    	   driver.get("https://www.amazon.in/");
	    	   SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
	    		signUpPopUp.clickSignIn();
	    		
	    	
	    		signUpPopUp.sendEmailormobilephonenumber(Utility.getExceldata("sheet1", 1, 0));
	    		//signUpPopUp.sendEmailormobilephonenumber("9545874588");
	    		signUpPopUp  .clickContinue();
	    		signUpPopUp.clickForgotPassword();
	    		
	       }
	       
	       @Test
	       public void test () {
	    	   testID = "T101";
	    	   System.out.println("Test");
	    	   SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
	    	  String expectedTextMsg = "";//Enter the email address or mobile phone number associated with your Amazon account.
	    	   String actualMSg =signUpPopUp.getText();
	    	   Assert.assertEquals(actualMSg, expectedTextMsg );	   
//	    		if (expectedTextMsg.equals(actualMSg))	
//	    		{
//	    			System.out.println("Passed");
//	    			
//	    		}
//	    		else
//	    		{
//	    			
//	    			System.out.println("Failed");
//	    		}
	       }
	       
	       @Test (enabled = false)
	       public void test123 () {
	    	   testID = "T201";
	    	   System.out.println("Test1");
	    	   
	    	   SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
	    	   signUpPopUp.clickContinues();
	      String expectedErrorTitle = "";
	    	String actualErrorTitle =signUpPopUp.getAttributeContinues();
	    		if ( expectedErrorTitle.equals(actualErrorTitle))	
	    		{
	    			System.out.println("Passes");
	    			
	    		}
	    		else
	    		{
	    			
	    			System.out.println("Failed");
	    		}
	       }
	       @Test  (enabled = false)
	       public void test1234 () {
	    	   testID = "T301";
	    	   System.out.println("Test1");
	    	   
	    	   SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
	    	   signUpPopUp.clickContinues();
	      String expectedErrorTitle = "a-button-inner";
	    	String actualErrorTitle =signUpPopUp.getAttributeContinues();
	    		if ( expectedErrorTitle.equals(actualErrorTitle))	
	    		{
	    			System.out.println("Passes");
	    			
	    		}
	    		else
	    		{
	    			
	    			System.out.println("Failed");
	    		}
	       }
	       
	       @AfterMethod
	       public void logOutFromApplication (ITestResult result) throws IOException {  //logOut
	    	  if (ITestResult.FAILURE == result.getStatus()) 
	    	  {
	    	   Utility.captureScreen(driver, testID);
	    	  }
	   
	    	  System.out.println("AfterMethod");
	       }
	       
	       @AfterClass
	       
	       public void clearObject() {
	    	   signUpPopUp = null; 
	       }
	       
	       
	       
	       
	       @AfterTest
	       public void closedBrowser() {

	    	   System.out.println("AfterTest");
	    	   driver.quit();
	    	   driver = null;
	    	   System.gc();
	       }   
//	    
//	       public void closedBrowser() {
//	    	   System.out.println("AfterClass");
//	    	   driver.quit();
//	       }
	       
	       
	       
}	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       

