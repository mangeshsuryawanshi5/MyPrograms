package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test (invocationCount = 4)
  public void a() 
  {
	  Reporter.log("Running A method", true);
  }
  
  @AfterMethod
  public void afterMethod ()
  {
	  Reporter.log("After Method Running", true);
  }
}
