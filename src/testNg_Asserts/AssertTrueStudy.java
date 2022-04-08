package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void testing() 
  {
	  boolean result=false;
	  
	  Assert.assertTrue(result, "Result is false");
  }
}
