package handelingofMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> columnCount = driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th"));
		
		System.out.println("Total no. of columns are "+columnCount.size());
		int TotalNumberOfColumns = columnCount.size();
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println("Total no. of rows are "+rowCount.size());
		int TotalNumberOfRows = rowCount.size();
		
		//outer for loop for Rows
		
		for(int i=1;i<=TotalNumberOfRows;i++)
		{
			String text;
			//Inner for loop for columns
			
			for(int j=1;j<=TotalNumberOfColumns;j++)
			{
				
				if(i==1)
				{
					
				text=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//th["+j+"]")).getText();
				System.out.println(text+" ");
				}
				else
				{
					text=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td["+j+"]")).getText();
					System.out.println(text+" ");
				}
			}
			
			System.out.println();
		}
		
		
		
	}

}
