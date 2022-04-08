package selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", ("E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe"));
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String s=RandomString.make(2);
		
		File destination=new File("E:\\Mangesh\\Velocity\\Selenium\\Screenshot\\file"+s+".png");
		
		FileHandler.copy(source, destination);
		

	}

}
