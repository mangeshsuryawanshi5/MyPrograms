package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import kitePOMClasses.KiteLoginPage;
import utilityPackage.Utility;

public class KiteAppUserIdErrorMsgValidation extends Base {
	KiteLoginPage login;
	@BeforeClass
	public void LaunchBrowser ()
	{
		
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new KiteLoginPage(driver);
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException 
	{
		login.sendPassword(Utility.readdataFromExcel(0, 1));
		login.clickOnLoginButton();
	}
		
  @Test
  public void validateUserIdErrorMsg() throws EncryptedDocumentException, IOException 
  {
	  int TCID=555;
	  String expectedUserIdErrorMsg = Utility.readdataFromExcel(0, 4);
	  String actualUserIdErrorMsg = login.geteUserIdErrorMSg();
	  Assert.assertEquals(actualUserIdErrorMsg, expectedUserIdErrorMsg, "Error Msg is not matching");
	  Utility.takeScreenshot(driver, TCID);
	  
  }
  
  @AfterClass
  public void browserClose()
  {
	  closeBrowser();
  }
}
