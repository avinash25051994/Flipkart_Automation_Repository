package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPopUp {
	@FindBy (xpath= "//span[text()='Hello, sign in']")
	private WebElement SignIn;
	
	@FindBy (xpath= "//input[@type='email']")
	private WebElement Emailormobilephonenumber ;
	
	
	@FindBy (xpath= "//input[@id='continue']")
	private WebElement Continue ;
	
	@FindBy (xpath= "//a[@id='auth-fpp-link-bottom']")
	private WebElement ForgotPassword ;
	
	@FindBy (xpath= "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/div/form/p")
	private WebElement Text ;
	
	@FindBy (xpath= "//input[@id='ap_email']")
	private WebElement Password;
	
	@FindBy (xpath= "//span[@class='a-button-inner']")
	private WebElement Continues ;
	
	WebDriverWait wait;
	
 WebDriver driver;
 
	public SignUpPopUp(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
		
	
	public void clickSignIn() {
			SignIn.click();
		}


    public void sendEmailormobilephonenumber(String user) {
    	 wait = new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.elementToBeClickable(Emailormobilephonenumber)); 
	   Emailormobilephonenumber.sendKeys( user );
}
    
    public void clickContinue() {
    	Continue.click();
	} 
    
    public void clickForgotPassword() {
    	ForgotPassword.click();
    } 

    public String getText() {
    
   String text = Text.getText();
	System.out.println(text);
	return text;
    }
    
    public void sendPasswod(String user) {
    	Password.sendKeys("user");
    	
    }
    
    public void clickContinues() {
    	Continues.click();
    }	
    public String getAttributeContinues() {
    	String continues = Continues.getAttribute("class");
    	System.out.println(Continues);
		return continues;
    }	
    
    	
   
}
    
   