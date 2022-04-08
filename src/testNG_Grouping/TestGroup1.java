package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup1 {
	@Test (groups = {"Regression","Sanity"})
	  public void TC6()
	  {
		  Reporter.log("Running TC6", true);
	  }
	  
	  @Test (groups = "Sanity")
	  public void TC7()
	  {
		  Reporter.log("Running TC7", true);
	  }
	  
	  @Test (groups = "Regression")
	  public void TC8()
	  {
		  Reporter.log("Running TC8", true);
	  }
	  
	  @Test (groups = "Sanity")
	  public void TC9()
	  {
		  Reporter.log("Running TC9", true);
	  }
	  
	  @Test
	  public void TC10()
	  {
		  Reporter.log("Running TC10", true);
	  }
}
