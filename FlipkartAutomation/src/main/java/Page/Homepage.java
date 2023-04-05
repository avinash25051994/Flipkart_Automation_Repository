package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy (xpath= "//input[@class='_3704LK']")
	private WebElement searchbar;
	
	
	@FindBy (xpath= "//button[@type='submit']")
	private WebElement searchbarButton;
	
	@FindBy (xpath= "//a[text()='Home']")
	private WebElement Home;
	
	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sendsearchbar(String user) {
		searchbar.sendKeys(user);
	}
	
	public void clicksearchbarButton() {
		searchbarButton.click();
	}
	
	public String getHome() {
		String home = Home.getAttribute("text");
		return home;
		
	}
	
	
}
