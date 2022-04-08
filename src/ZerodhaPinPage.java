
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
	//1. Variable declaration
	
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	//2.Constructor
	
	public ZerodhaPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Method
//	String myPin="969696";
	public void sendPin(String myPin)
	{
		pin.sendKeys(myPin);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	

}