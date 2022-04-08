package waitOrSynchronization;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)); //we use this syntax after selenium 4 onwards
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //we used this syntax before selenium 4
		
		//implicitlyWait-->Dynamic Wait-->Applicable for whole webpage
		//1000ms-->10ms page is loded-->900ms-->will be released
		
	}

}
