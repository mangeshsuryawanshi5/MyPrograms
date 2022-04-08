package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
  @Test
  public void testing()
  {
	  String a="Pune";
	  String b="Mumbai";
	  
	  Assert.assertNotNull(a, "a is null");
	  System.out.println(" a is not null");
	  
	  Assert.assertNull(b, "a is not null");
	  System.out.println("b is null");
	  
	  Assert.fail();
  }
}
