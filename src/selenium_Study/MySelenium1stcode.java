package selenium_Study;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stcode {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vctcpune.com/");
		
		driver.close();// to close the current tab of the browser opened by selenium tool
		driver.quit();//to close the all tabs of the browser opened by selenium tool
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().minimize();
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		System.out.println(driver.getTitle());
		
		String title=driver.getTitle();
		System.out.println("Title of web page is "+title);
		
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		System.out.println("Url of webpage is--> "+url);
		
		
	}

}
