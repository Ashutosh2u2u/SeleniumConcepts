package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEvent3Demo {
public static void main(String[] args) throws Exception {
	//Open Chrome browser
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/key_presses?");			
			Actions act= new Actions(driver);				
		    act.sendKeys(Keys.ESCAPE).perform();
		    String keyboardEvent=driver.findElement(By.xpath("//p[@id='result']")).getText();			
		    if(keyboardEvent.contains("ESCAPE"))
				System.out.println(keyboardEvent+ " key");
		    
		    Thread.sleep(2000);
			
			driver.quit();
}
}
