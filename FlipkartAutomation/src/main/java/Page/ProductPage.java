package Page;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


	@FindBy (xpath= "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement AddtoCart ;
	
	
	@FindBy (xpath= "//div[@class='_2sKwjB']")
	private WebElement Text ;
	
//	@FindBy (xpath= "//span[text()='Place Order']")
//	private WebElement Button ;
//	
//	@FindBy (xpath= "//span[text()='Enter Email/Mobile number']")
//	private WebElement Title ;
	
	WebDriver driver ;
	
	public  ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void clickAddtoCart()  {
		ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(allAddr.get(1));
		AddtoCart.click();
	}
	public String getText()  {
		 ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(allAddr.get(1));
			String text = Text.getText();
			System.out.println(text);
			
			return text;
			
		}
//	public void clickButton()  {
//		ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(allAddr.get(1));
//		Button.click();
//	}
//	public String getTitle()  {
//		 ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(allAddr.get(1));
//			String title = Title.getTagName();
//			System.out.println(Title);
//			return title;

}
