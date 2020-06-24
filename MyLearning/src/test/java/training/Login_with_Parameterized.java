package training;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class Login_with_Parameterized {
	//Global variables
		//public static String p_email;
		public static String p_password;
		public static String p_username;
		public static String[][] dataArray;
		@Rule
		public ErrorCollector objError=new ErrorCollector();
	
	@Parameters
	public static String[][] retreiveData() throws Exception{
		dataArray=ExcelParser.getData("Data.xls");
		return dataArray;
	}
	
	//Constructor to initialize global variables
	public Login_with_Parameterized(String password, String username){
		p_password=password;
		p_username=username;
	}
	
	@Test
	public void Login() throws InterruptedException{

		//Open browser

		//remove logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		//Open browser
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new InternetExplorerDriver();
		//Open a URL
		driver.get("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);

		//Enter email & password
		driver.findElement(By.id("user-name")).sendKeys(p_username);
		driver.findElement(By.id("password")).sendKeys(p_password);
		Thread.sleep(2000);

		//Click on Login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(2000);
		
		//Close the browser			
		driver.close();

				
	}

}
