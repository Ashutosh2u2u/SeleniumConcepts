package seleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginDemo {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get("https://demoqa.com/");
		System.out.println(driver.getTitle());	
		
		/*
		//driver.findElement(By.xpath("//a[text()='Interactions']")).click();
		List<WebElement> linkList =driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		for(int i=0;i<=linkList.size()-1;i++)
		{
			WebElement element=linkList.get(i);
			String linkText=element.getText();

			if(linkText.equalsIgnoreCase("Automation practice form"))
			{
				element.click();
				break;
			} 
			System.out.println(linkText);
		}
		System.out.println(driver.findElement(By.xpath("//em[contains(text(),'ToolsQA is a leading provider')]")).getText());
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ashutosh");
	}*/



}}