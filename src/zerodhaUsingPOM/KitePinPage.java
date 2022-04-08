package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	//1. Variable declaration
	
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	//2.Constructor
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Method
	
	public void sendPin()
	{
		pin.sendKeys("969696");
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	

}
