package page;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Servicepage {

	@FindBy (xpath= "//*[@id=\"a-page\"]/div[1]/div[4]/div[2]/a[1]")
	private WebElement Condition;
	
	WebDriver driver;
	
	public Servicepage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	
	
	public void clickCondition() {
		ArrayList<String> allAddr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(allAddr.get(1));
		Condition.click();
	}
	
	
	
}
