package interview_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Without_SelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	    List<WebElement> drp = driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		for(int i=0;i<drp.size();i++)
		{
			if(drp.get(i).getText().equals("Option2"))
			{
				WebElement Option2 = drp.get(i);
				Option2.click();
				System.out.println(Option2.getText());
				break;
			}
		}
	}
}
