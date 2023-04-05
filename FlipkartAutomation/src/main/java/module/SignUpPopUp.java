package module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPopUp {
	  

	@FindBy (xpath= "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement Close;
	
	private JavascriptExecutor javascriptExecutor  ;
	
	public  SignUpPopUp(WebDriver driver) {
		PageFactory.initElements(driver,this);
		javascriptExecutor  = (JavascriptExecutor)(driver);
			
	}

	
	public void executeScriptclose() {
      javascriptExecutor.executeScript("arguments[0].click();",Close);
       	}
	
	  
	}
	
	
	
	
	
	
	

