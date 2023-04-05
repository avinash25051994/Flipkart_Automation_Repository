package Page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailspage {


	@FindBy (xpath= "(//div[@class='_2kHMtA'])[1]")
	private WebElement Results;
	
	@FindBy (xpath= "(//p[1])[1]")
	private WebElement Text;
	
	

	public  ProductDetailspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	   
	}
	
	public void clickResults()  {
		Results.click();
		
	}
	public String getText() {
		String text = Text.getAttribute("text");
		return text;
}
}