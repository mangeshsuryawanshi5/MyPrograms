package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
  @Test
  public void testing()
  {
	  String a=null;
	  
	  Assert.assertNotNull(a, "a is null");
  }
}
