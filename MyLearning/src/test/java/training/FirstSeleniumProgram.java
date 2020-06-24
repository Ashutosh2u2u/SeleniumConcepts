package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		System.setProperty("webdriver.chrome.silentOutput", "true");
		//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();		
		//Open a URL
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.quit();

	}

}
