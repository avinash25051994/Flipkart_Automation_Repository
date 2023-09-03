package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.ProductDetailPage;
import page.ProductPage;


public class TestClass1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/browserfile/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
//	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//
//
// 
////	driver.get("https://www.dezlearn.com/nested-iframes-example/");
////
////	Iframe iframe = new Iframe (driver);
////	iframe.clicktopic();
////	iframe.clickFrame();
//	
//	
//	Iframe iframe = new Iframe (driver);
//	
//	iframe.sendtopic();
//	iframe.clickcheckbox();
//	iframe.selectAnimals();
	
	
	
	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
//	SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
//	signUpPopUp.clickSignIn();
//	signUpPopUp.sendEmailormobilephonenumber("7038456459");
//	signUpPopUp.clickContinue();
//	signUpPopUp.clickForgotPassword();
//     signUpPopUp.getText();
//	signUpPopUp.sendPasswod("9975484555");
//	signUpPopUp.clickContinues();
//	signUpPopUp.getAttributeContinues();
//	System.out.println("===");
//	
//	Thread.sleep(5000);
//	driver.navigate().refresh();
//	 driver.navigate().back();
//	 driver.navigate().back();
		//Thread.sleep(5000);
	 HomePage homePage = new HomePage(driver); 
	 homePage.Sendsearchbar("mobile");
	 homePage.clicksearchbarButton();
	 
	 ProductDetailPage productDetailPage = new ProductDetailPage(driver); 
	 productDetailPage.clickResult();
	 productDetailPage.getText();
	 System.out.println("getText");
	 
	 ProductPage productPage = new ProductPage(driver);
	// productPage.SelectQuantity();
	 // productPage.clickBuyNow();
	 // productPage.getText();
	 
//	  Servicepage servicepage =  new Servicepage (driver);
//	  servicepage.clickCondition();
//	  productPage.clickAddtoCart();
	 
	  productPage.clickcart();
	  //productPage.ActQty();
	  productPage.SelectQty();
	  System.out.println("getText"); 
}

}
