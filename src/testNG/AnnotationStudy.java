package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void ValidateUserID ()
  {
	  Reporter.log("Running Test",true);
  }
  
  @BeforeMethod
  public void loginToKite()
  {
	  Reporter.log("Logging in....", true);
  }
  @BeforeClass
  public void launchBrowser ()
  {
	  Reporter.log("Launching Bowser", true);
  }
  @AfterClass
  public void closebrowser ()
  {
	  Reporter.log("Close Browser", true);
  }
  @AfterMethod
  public void logOut ()
  {
	  Reporter.log("Logging Out....", true);
  }
}
