package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test (dependsOnMethods = {"c"})
  public void a()
  {
	  Reporter.log("Running A method", true); 
  }
  
  @Test (timeOut = 1000)
  public void c () throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Running C method", true);
  }
  
  @Test 
  public void b ()
  {
	  Reporter.log("Running B method", true);
  }
}

//1.If 1 TC execution depends on multiple TC then we need to use "dependsOnMethods" TestNG keyword.
//2.If that test case is not excuted the dependable test will skipped.