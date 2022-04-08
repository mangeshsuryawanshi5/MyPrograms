package selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ClickMeButton = driver.findElement(By.id("alertButton"));
		ClickMeButton.click();
		
		//Switch to AlertPopup
		
		Alert alt = driver.switchTo().alert();
		String TextonAlertPopup = alt.getText();
		System.out.println("Text on Alert Popup is "+TextonAlertPopup);
		Thread.sleep(2000);
		
		alt.accept();
		
		
		
		
		

		
		
	}

}
