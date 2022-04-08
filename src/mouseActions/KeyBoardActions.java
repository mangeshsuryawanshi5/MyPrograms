package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//	    day.click();
		
		Actions act=new Actions(driver);
//		act.click(day).perform();
//		Thread.sleep(2000);
//		
//		for(int i=0;i<=17;i++)
//		{
//			act.sendKeys(Keys.UP).perform();
//			Thread.sleep(2000);
//		}
//		
//		act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		act.click(firstName).keyDown(Keys.SHIFT).sendKeys("mangesh").build().perform();
		
		
		
		
		
		
	}

}
