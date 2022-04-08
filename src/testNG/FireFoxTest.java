package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void MyMethod() 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\Mangesh\\Velocity\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
  }
}
