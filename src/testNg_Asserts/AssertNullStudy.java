package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullStudy {
  @Test
  public void testing()
  {
	  String a=null;
	  
	  Assert.assertNull(a, "a is not Null");
	  
	  System.out.println("Hi");
  }
}
