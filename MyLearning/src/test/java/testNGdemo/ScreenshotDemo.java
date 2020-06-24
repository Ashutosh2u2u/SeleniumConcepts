package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utility.ScreenshotTest;

public class ScreenshotDemo {
	WebDriver driver;
	@Test
	public void captureScreenshot(){

		// public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe") ;
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//a[text()='Automation practice form']")).click();
		List<WebElement> linkTags=driver.findElements(By.tagName("a"));
		linkTags.size();
		for(WebElement we: linkTags)
		{
		System.out.println(we.getText());	
		}
	}
	//take screenshot only in case of failure
	@AfterMethod
	//store all result in result object of ITestResult
	public void tearUp(ITestResult result){
		//verify for test failure
		if(ITestResult.FAILURE==result.getStatus()){
			//it tells which test get failed getName
			ScreenshotTest.screenshot(driver,result.getName());
		}
		driver.close();
	}

}

