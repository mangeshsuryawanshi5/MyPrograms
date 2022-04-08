package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Switch to parent frame
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		
		WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		String Actual_Text=parent.getText();
		String Exppected_Text="Parent frame";
		
		if(Actual_Text.equals(Exppected_Text))
		{
			System.out.println("Text is matching, text case passed for parent frame");
		}
		else
		{
			System.out.println("Text is not matching, text case failed for parent frame");
		}
		
		//Switch to child frame
		
		
		WebElement childframe1 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe1);
		
		String Actual_Text1=childframe1.getText();
		String Exppected_Text1="Child Iframe";
		
		if(Actual_Text1.equals(Exppected_Text1))
		{
			System.out.println("Text is matching, text case passed for child frame");
		}
		else
		{
			System.out.println("Text is not matching, text case failed for child frame");
		}

	}

}
