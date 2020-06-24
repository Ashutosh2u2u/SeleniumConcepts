package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragDropDemo {
	public static void main(String[] args) throws Exception {
		//for removing unwanted log file from console
		System.setProperty("webdriver.chrome.silentOutput", "true");
		//Open Chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chrome\\chromedriver_win32\\chromedriver.exe"); 
		//to accept SSl certificate
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		WebDriver driver=new ChromeDriver(options);


		//Maximize the browser window
		driver.manage().window().maximize();

		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		System.out.println("site open");
		Thread.sleep(2000);
		//javascript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement drag1=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		//This will scroll the page till the element is found		
		//js.executeScript("arguments[0].scrollIntoView();", drag1);
		js.executeScript("window.scrollBy(401,24)");
		Thread.sleep(2000);

		WebElement drop1=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		Actions act= new Actions(driver);

		//Drag and drop method 1
		/*	act.clickAndHold(drag1)
			.pause(Duration.ofSeconds(2))
			.moveToElement(drop1)
			.pause(Duration.ofSeconds(2))
			.release()			
			.build()
			.perform();*/
		//Drag and Drop method 2
		act.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
