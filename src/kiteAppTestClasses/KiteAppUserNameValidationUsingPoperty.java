package kiteAppTestClasses;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseUsingProperty;
import kitePOMClasses.KiteHomePage;
import kitePOMClasses.KiteLoginPage;
import kitePOMClasses.KitePinPage;
import utilityPackage.UtilityUsingProperty;

public class KiteAppUserNameValidationUsingPoperty extends BaseUsingProperty {
  
  KiteLoginPage login;
  KitePinPage pin;
  KiteHomePage home;
  int TCID=11;
  
  @BeforeClass
  public void launchingBrowser () throws IOException
  {
	  launchBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
  }
  
  @BeforeMethod
  public void LoginToKiteApp () throws IOException
  {
	  login.sendUserID(UtilityUsingProperty.getDataFromProperty("UN"));
	  login.sendPassword(UtilityUsingProperty.getDataFromProperty("PWD"));
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.sendPin(UtilityUsingProperty.getDataFromProperty("PIN"));
	  pin.clickOnContinueButton();
	  
  }
  @Test
  public void validateUserID() throws IOException 
  {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String expectedUSerID = UtilityUsingProperty.getDataFromProperty("UN");
	  String actualUserID = home.getActualUserID();
	  Assert.fail();
	  Assert.assertEquals(expectedUSerID, actualUserID, "Acual and Expected User ID not matching");
	  
	  UtilityUsingProperty.takeScreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logOutFromKiteApp(ITestResult result) throws InterruptedException, IOException
  {
	  if(result.getStatus()==result.FAILURE)
	  {
		  UtilityUsingProperty.takeScreenshot(driver, TCID);
	  }
	  else
	  {
		  Reporter.log("TC is passed",true);
	  }
//	  home.clickOnLogoutButton();
  }
  
  @AfterClass
  public void ClosingBrowser()
  {
	  closeBrowser();
  }
}
