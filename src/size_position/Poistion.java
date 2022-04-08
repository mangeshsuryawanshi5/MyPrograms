package size_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poistion {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//to get default position
		System.out.println(driver.manage().window().getPosition());
		//1. to change position create object of Point class which will accept x and y co-ordinates 
		Point p= new Point(70, 90);
		
		//2. use SetPosition which will accept object of point class
		
		driver.manage().window().setPosition(p);
	}

}
