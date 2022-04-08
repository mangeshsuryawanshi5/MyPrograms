package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserID();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUserID();
		home.clickOnLogoutButton();
		
		driver.close();
		
		
	}

}
