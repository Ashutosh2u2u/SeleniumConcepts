package seleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='IFrame practice page']")).click();
		String parent=driver.getWindowHandle();
		System.out.println("parent window  id is"+parent);
		Set<String> allWindows=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<>(allWindows);
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	
	}
}


