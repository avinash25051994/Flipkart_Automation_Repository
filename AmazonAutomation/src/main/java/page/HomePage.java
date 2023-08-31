package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath= "//input[@type='text']")
	private WebElement searchbar;
	
	
	@FindBy (xpath= "//input[@type='submit']")
	private WebElement searchbarButton;
	
	
	@FindBy (xpath= "(//span[@class='a-size-medium-plus a-color-base a-text-normal'])[1]")
	private WebElement Text;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void Sendsearchbar(String user) {
		searchbar.sendKeys(user);
	}
	
	
	public void clicksearchbarButton() {
		searchbarButton.click();
	}
	
	public String getText() {
	String  text = 	Text.getText();
	System.out.println(text);
	return text;
	
	}



	
		
	}



	
		
	
	
	
	
	
	
	
	
	

