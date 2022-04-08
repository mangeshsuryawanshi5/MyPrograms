package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", ("E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe"));
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		WebElement Option1CheckBox = driver.findElement(By.name("checkBoxOption1"));
		System.out.println(Option1CheckBox.isSelected());
		
		boolean result = Option1CheckBox.isSelected();
		
		if(result)
		{
			System.out.println("Check Box is already selected");
		}
		else
		{
			System.out.println("Checkbox is not selected,selecting checkbox now");
			Option1CheckBox.click();
			Thread.sleep(2000);
			
			boolean result1 = Option1CheckBox.isSelected();
			
			System.out.println("Updated checkbox selected status is "+result1);
		}

	}

}
