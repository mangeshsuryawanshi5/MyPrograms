package kitePOMTestNG;

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
//	String myUserID="HD5857";
//	String myPassword="Ajinkya@123";
	
	public void sendUserID(String myUserID)
	{
		USerID.sendKeys(myUserID);
	}
	public void sendPassword(String myPassword)
	{
		Password.sendKeys(myPassword);
	}
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}

}

