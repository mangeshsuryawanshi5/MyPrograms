package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		
		String myUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = MySheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = MySheet.getRow(0).getCell(2).getStringCellValue();
				
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement userIDField = driver.findElement(By.id("userid"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userIDField.sendKeys(myUserID);
		passwordField.sendKeys(myPassword);
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pinField = driver.findElement(By.xpath("//input[@type='password']"));
		pinField.sendKeys(myPin);
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		Thread.sleep(3000);
		
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
		userID.click();
		
		String actualUserID = userID.getText();
		String expectedUserID = myUserID;
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("UserID is matching Text Case Passed");
		}
		else
		{
			System.out.println("UserID is not matching Text Case Failed");
		}
		
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		
		driver.close();
		
		
	}

}
