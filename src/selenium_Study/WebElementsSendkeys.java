package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
//        driver.findElement(By.xpath("//input[@id='email']"));
//        driver.findElement(By.name("email"));
        driver.findElement(By.id("email")).sendKeys("Mangesh");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        
//        locator-->name
//		driver.findElement(By.name("email")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("2345");
		
		//tagname--> class--> use in case of plain text
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("1234");

		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("123");
		
//		locator-->id
//		driver.findElement(By.id("pass")).sendKeys("123");
//		
//		Thread.sleep(1000);
//		locator--> tagName
//		driver.findElement(By.tagName("button")).click();
		
		
//		WebElement UserName = driver.findElement(By.id("email"));
//		
//		UserName.sendKeys("1234");
//		UserName.clear();
//		UserName.sendKeys("2345");
//		
//		WebElement passWord = driver.findElement(By.id("pass"));
//		
//		passWord.sendKeys("1234");
		//locator--> link text
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//locator-->partial link Text
		driver.findElement(By.partialLinkText("password?")).click();
		
	}

}
