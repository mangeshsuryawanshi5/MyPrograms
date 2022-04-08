package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", ("E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe"));
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		//1.Identify listbox to be handled and store it in reference variable
		
		WebElement DropdownBox = driver.findElement(By.name("dropdown-class-example"));
		
		//2.Create an object of Select class which will accept WebElement as arguments
		
		Select s=new Select(DropdownBox);
		
		//3.By using on of the select class methods we can select value from list box like
		
	  // a.selectByVisibleText:selectByVisibleTex(String arg0)
		//b.selectByIndex:selectByIndex(int arg0)
		///c.selectByValue:selectByValue(String arg0)
		
		
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option1");
		
		System.out.println("IsMultiple stat is "+s.isMultiple());
		

	}

}
