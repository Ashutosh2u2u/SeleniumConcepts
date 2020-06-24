package actionsDemo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickDemo {
public static void main(String[] args) throws Exception {
	//Open Chrome browser
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://api.jquery.com/dblclick/");
			System.out.println("site open for double click demo");
			//switch to frame
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			Actions act= new Actions(driver);			
			
			WebElement target=driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"));
			//to double click
			act.doubleClick(target).perform();
			Thread.sleep(2000);	
			
			
			driver.quit();
}
}
