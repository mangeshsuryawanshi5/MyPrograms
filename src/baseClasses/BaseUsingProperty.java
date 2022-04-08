package baseClasses;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utilityPackage.UtilityUsingProperty;

public class BaseUsingProperty
{
	
	protected WebDriver driver;
	public void launchBrowser () throws IOException
	{
	  System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  driver=new ChromeDriver(opt);
	  driver.get(UtilityUsingProperty.getDataFromProperty("URL"));
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