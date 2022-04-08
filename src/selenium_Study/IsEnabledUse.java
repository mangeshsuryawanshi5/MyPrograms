package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe"));
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Thread.sleep(2000);
		SignInButton.click();
		Thread.sleep(2000);
		
		WebElement GetOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(GetOTPButton.isEnabled());
		
		boolean result = GetOTPButton.isEnabled();
		
		System.out.println("GetOPTButton status is "+result);
		
		if(result)
		{
			System.out.println("GetOTPButton is enabled");
			GetOTPButton.click();
			
		}
		else
		{
			driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
			Thread.sleep(2000);
			GetOTPButton.click();
			System.out.println("Clicked on get OTP button");
		}
		
		
		
		
		
		
		
		
	}

}
