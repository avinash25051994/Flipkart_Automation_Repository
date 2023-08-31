package page;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	@FindBy (xpath= "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement Result;
	
	@FindBy (xpath= "//span[text()='Apple iPhone 13 Mini (128GB) - Midnight']")
	private WebElement Text;
	
	WebDriver driver ;
	
	//wait
	
	//Dynamic element handling


	public ProductDetailPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
public void clickResult(){
	ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(allAddr.get(0));
	Result.click();
	
}	
	
   public String getText()  {
	ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(allAddr.get(0));
	String text = Text.getText();
	System.out.println(text);
	return text;	

}
}

