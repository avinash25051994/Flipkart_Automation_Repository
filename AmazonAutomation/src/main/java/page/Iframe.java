package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	@FindBy (xpath= "(/html/body/input)")
	private WebElement topic;
	
	
	@FindBy (xpath= "//input[@id='a']")
	private WebElement checkbox;
	

	
//	@FindBy (xpath= "(/html/body/div/button)[1]")
//	private WebElement topic;
//	
//	
//	@FindBy (xpath= "//*[@id=\"u_5_6\"]")
	//private WebElement Frame;
	
 private WebDriver driver;
	
	public Iframe(WebDriver driver) {
	PageFactory.initElements(driver,this);
		this.driver= driver;
	}
	
	public void sendtopic() {
		 driver.switchTo().frame("frame1");
		topic.sendKeys("frame");
	}
	public void clickcheckbox() {
		driver.switchTo().frame("frame3");
		checkbox.click();
		driver.switchTo().defaultContent();
	    
	}
	
	public void selectAnimals() {
		
	driver.switchTo().frame("frame2");
		Select Animals = new Select(driver.findElement(By.id("animals")));
	    Animals.selectByIndex(3);
	}	
//	}	driver.switchTo().frame("parent_iframe");
//		topic.click();
//	}
//	public void clickFrame() {
//		driver.switchTo().frame("iframe1");
//		Frame.click();
//	}


	
}
