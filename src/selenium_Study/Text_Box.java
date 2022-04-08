package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement UserName = driver.findElement(By.id("userName"));
		UserName.sendKeys("Mangesh_Suryawanshi");
		driver.getWindowHandle();
		
		
		
		
		
	
		
		
	}

}
