package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEventDemo {
public static void main(String[] args) throws Exception {
	//Open Chrome browser
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");			
			Actions act= new Actions(driver);				
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(5000);
			
			driver.quit();
}
}
