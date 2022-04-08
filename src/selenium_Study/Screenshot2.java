package selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String A=RandomString.make(2);
		
		File destination=new File("E:\\Mangesh\\Velocity\\Selenium\\Screenshot\\File"+A+".png");
		
		FileHandler.copy(source, destination);

	}

}
