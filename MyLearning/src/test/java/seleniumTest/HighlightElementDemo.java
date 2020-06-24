package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.HighlightElement;

public class HighlightElementDemo {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/");
		System.out.println(driver.getTitle());	
		driver.findElement(By.xpath("//a[contains(text(),'Automation practice form')]")).click();
		Thread.sleep(2000);	
		
		WebElement text1=driver.findElement(By.xpath("//strong[contains(text(),'PERSONAL INFORMATION')]"));
		HighlightElement.Highlighting(driver, text1);
		Thread.sleep(5000);	
		System.out.println(text1.getText());

}}