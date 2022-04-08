package testNG_SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	SoftAssert s=new SoftAssert();
  @Test
  public void f()
  {
	  String a="Pune";
	  String b="Pune";
	  	  
	  s.assertNull(b, "b is null");
	  
	  s.assertEquals(a, b, "a and b not equal");
	  
	  s.assertAll();
  }
}
