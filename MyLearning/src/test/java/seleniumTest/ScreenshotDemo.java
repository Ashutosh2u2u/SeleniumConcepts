package seleniumTest;

import java.io.File;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenshotTest;

public class ScreenshotDemo {

	    public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		ScreenshotTest.screenshot(driver,"BrowserStart");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		ScreenshotTest.screenshot(driver,"LauncedUrl");
        driver.quit();
	}
	    

}
