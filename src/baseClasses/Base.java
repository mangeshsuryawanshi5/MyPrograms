package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	public void launchBrowser ()
	{
	  System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  driver=new ChromeDriver(opt);
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  driver.manage().window().maximize();
	  Reporter.log("Browser launched successfully",true);
	}
	
	public void closeBrowser ()
	{
	  driver.close();
	  Reporter.log("Browser closed successfully",true);
	}

}
