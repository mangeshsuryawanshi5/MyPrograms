package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test (priority = 1)
  public void a ()
  {
	  Reporter.log("Running A method", true);
  }
  
  @Test (priority = -2)
  public void c ()
  {
	  Reporter.log("Running C method", true);
  }
  
  @Test (priority = 1)
  public void b ()
  {
	  Reporter.log("Running B method", true);
  }
}

//1.Default priority is 0.
//2.As per number line priority will be decided
//3.If some mmethods priorities are same then they will execute alphabticallly.