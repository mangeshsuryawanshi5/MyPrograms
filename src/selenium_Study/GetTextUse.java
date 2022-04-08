package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", ("E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe"));
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
//			System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
           
			 WebElement WebEle = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
			 String Actualtext = WebEle.getText();
			 System.out.println("Text is "+Actualtext);
			 
			 String Expectedtext="Welcome To Practice Page";
			 
			 if(Actualtext.equals(Expectedtext))
			 {
				 System.out.println("Text is matching, Text Case is passed");
			 }
			 else {
				 System.out.println("Text is not matching, Text Case is faild");
			 
			 }
	}

}
