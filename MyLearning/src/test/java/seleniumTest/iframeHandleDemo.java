package seleniumTest;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandleDemo {

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get("https://demoqa.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='IFrame practice page']")).click();
		driver.switchTo().frame("IF2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		
	}

}


