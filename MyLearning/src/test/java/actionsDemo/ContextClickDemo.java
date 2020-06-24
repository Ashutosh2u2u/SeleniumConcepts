package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ContextClickDemo {
public static void main(String[] args) throws Exception {
	//Open Chrome browser
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			System.out.println("site open for context click demo");
			Actions act= new Actions(driver);			
			
			WebElement target=driver.findElement(By.xpath("//span[text()='right click me']"));
			//to right click
			act.contextClick(target).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Copy']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);	
			
			
			driver.quit();
}
}
