package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEvent2Demo {
public static void main(String[] args) throws Exception {
	//Open Chrome browser
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");			
			Actions act= new Actions(driver);				
			driver.findElement(By.name("firstname")).sendKeys("Selenium");
			act.sendKeys(Keys.TAB)
			.pause(Duration.ofSeconds(1))
			.sendKeys("driver")
			.pause(Duration.ofSeconds(1))
			.sendKeys(Keys.TAB)
			.pause(Duration.ofSeconds(1))
			.sendKeys("9090909099")
			.pause(Duration.ofSeconds(1))
			.sendKeys(Keys.TAB)
			.pause(Duration.ofSeconds(1))
			.sendKeys("qwerty")
			.pause(Duration.ofSeconds(1))			
			.build().perform();
			Thread.sleep(5000);
			
			//driver.quit();
}
}
