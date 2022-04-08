package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement userIDField = driver.findElement(By.id("userid"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userIDField.sendKeys("HD5857");
		passwordField.sendKeys("Ajinkya@123");
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pinField = driver.findElement(By.xpath("//input[@type='password']"));
		pinField.sendKeys("969696");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		Thread.sleep(3000);
		
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
		userID.click();
		
		String actualUserID = userID.getText();
		String expectedUserID = "HD5857";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("UserID is matching Text Case Passed");
		}
		else
		{
			System.out.println("UserID is not matching Text Case Failed");
		}
		
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		
		driver.close();
		
		
		
		
		
	}

}
