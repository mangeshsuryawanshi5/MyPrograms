package testNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
  @Test
  public void AssertTest() 
  {
	  String name="Mangesh";
	  String name1="Mangesh1";
	  
//	  if(name.equals(name1))
//	  {
//		  System.out.println("TC is passed");
//	  }
//	  else
//	  {
//		  System.out.println("TC is Failed");
//	  }
	  
	  Assert.assertEquals(name, name1, "String not matching");
  }
}
