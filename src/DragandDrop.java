import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
Thread.sleep(2000);

WebElement Drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement Drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

Actions act=new Actions(driver);
act.dragAndDrop(Drag, Drop).perform();

	}

}
