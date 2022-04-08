package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
  @Test
  public void testing()
  {
	  boolean result=false;
	  
	  Assert.assertFalse(result, "Result is True");
  }
}
