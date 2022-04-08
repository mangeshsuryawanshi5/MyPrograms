package handelingofMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='product']//th"));
		
		for(WebElement w:tableHeader)
		{
			System.out.println(w.getText()+" || ");
		}
		
		for(int i=2;i<=11;i++)
		{
			System.out.println();

		List<WebElement> tableRow = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]//td"));
		
		for(WebElement w:tableRow)
		{
			System.out.println(w.getText()+" || ");
		}
	
		}
	}

}
