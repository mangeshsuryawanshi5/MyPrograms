package crossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CT1 {
  @Parameters("browserName")
  @Test
  public void CrossBrowser(String browserName) 
  {
	  WebDriver driver=null;
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if (browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\Mangesh\\Velocity\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  
  }
}
