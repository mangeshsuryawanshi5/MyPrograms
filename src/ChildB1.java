
import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildB1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		String MainPageWindowID = driver.getWindowHandle();
//		System.out.println("The ID of Main Page is "+MainPageWindowID);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> AllWindowID = driver.getWindowHandles();
		
		
		System.out.println("All ID's are "+AllWindowID);
		
		ArrayList<String> al=new ArrayList<String>(AllWindowID);
	        String mainPageId = al.get(0);
	        String ChildPageId = al.get(1);
            System.out.println(mainPageId);
	
//		Iterator<String> it = AllWindowID.iterator(); //Pointinng to -1
//		
//		String MainPageId = it.next(); //Pointing to 0th location
//		String ChildPageId = it.next();////Pointing to 1st location
//		Thread.sleep(2000);
//		
		//Switch selenium focus to child page
		
		
		driver.switchTo().window(ChildPageId); //Focuse switched from main page to child page
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		
		driver.close();
//		
//		
//		driver.switchTo().window(MainPageId);
//		
//		driver.close();
		
	}

}
