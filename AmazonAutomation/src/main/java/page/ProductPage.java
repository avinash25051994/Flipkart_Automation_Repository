package page;

import java.util.ArrayList;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	@FindBy (xpath= "//input[@id='buy-now-button']")
    private WebElement BuyNow;
	
	@FindBy (xpath= "//select[@name='quantity']")
	private WebElement Quantity;
	
	@FindBy (xpath= "//input[@id='add-to-cart-button']")
	private WebElement AddtoCart;
	
	@FindBy (xpath= "//span[@id='attach-sidesheet-view-cart-button']")
	private WebElement cart;
	
	@FindBy (xpath = "//select[@autocomplete='off']")
	private WebElement Qty;
	
	@FindBy (xpath= "(//a[@id='quantity_2'])[2]")
	private WebElement quantity;
	
	@FindBy (xpath= "//span[@class='currencyINR']")
	private WebElement Subtotal;
	
	
	
	
	WebDriver driver;
	WebDriverWait wait;
	Select select;
	Actions actions;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
		
	}
	

	public void clickBuyNow()   {
     ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(allAddr.get(1));
				
				try {
					
					BuyNow.click();
				}
				
				catch ( NoSuchElementException e){
					
					WebDriverWait wait = new WebDriverWait(driver,40);
			    	wait.until(ExpectedConditions.elementToBeClickable(BuyNow)); 
			    	BuyNow.click();
				}
	
	}
//	public void SelectQuantity()  {
//		 ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(allAddr.get(1));
//		Select quantity = new Select (Quantity);
//		quantity.selectByIndex(3
//				);
//	}
	
	
	public void clickAddtoCart()  {
		ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(allAddr.get(1));
			AddtoCart.click();
	}	
	    public void clickcart() throws InterruptedException {
	    	ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(allAddr.get(1));
	    	WebDriverWait wait = new WebDriverWait(driver,40);
	    	wait.until(ExpectedConditions.elementToBeClickable(cart)); 
	    	cart.click();
	    	
	}		
	
	
//		public void ActQty() throws InterruptedException {
//			ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(allAddr.get(1));
//			Actions actions = new Actions(driver);
//			 actions.moveToElement(Qty).click().build().perform();
// 
//		} 
//			 
	    public void SelectQty() {
	    	Select select = new Select (Qty);
	    	select.selectByIndex(2);
	    }
		
	    public String getSubtotal() {
	    	try {
	    		
	    		String subtotal = Subtotal.getText();
	    		return subtotal;
			}
			
			catch ( NoSuchElementException e){
				
				WebDriverWait wait = new WebDriverWait(driver,40);
		    	wait.until(ExpectedConditions.elementToBeClickable(Subtotal)); 
		    	String subtotal = Subtotal.getText();
		    	return subtotal;
			}
	    	
	    }

	
	
	
	
//	public String getText()  {
//	 ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
//					driver.switchTo().window(allAddr.get(1));
//		String text = Text.getText();
//		System.out.println(text);
//		return text;
//		
//	}
		

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

