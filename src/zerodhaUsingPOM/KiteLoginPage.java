package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//1.Initiliaze variable
	
	@FindBy(id="userid") private WebElement USerID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	
	//2.Use Constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods which works on data members
	
	public void sendUserID()
	{
		USerID.sendKeys("HD5857");
	}
	public void sendPassword()
	{
		Password.sendKeys("Ajinkya@123");
	}
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}

}
