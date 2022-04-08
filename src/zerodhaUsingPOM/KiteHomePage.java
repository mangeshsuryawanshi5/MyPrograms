package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//1.Variable initialiazation
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogoutButton;
	
	//2.Constructor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	
	public void validateUserID()
	{
		String actual = UserID.getText();
		String expected = "HD5857";
		
		if(actual.equals(expected))
		{
			System.out.println("USerID matching Test Case Passed");
		}
		else
		{
			System.out.println("USerID not matching Test Case Failed");
		}
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(500);
		LogoutButton.click();
	}
	
	

}
