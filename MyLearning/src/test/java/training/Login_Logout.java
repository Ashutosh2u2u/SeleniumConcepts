package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login_Logout {

	//Global variables
	public static String p_email;
	public static String p_password;
	public static String p_username;

	public static void main(String[] args) throws InterruptedException {
		//Initialize the variables		
		p_password="secret_sauce";
		p_username="standard_user";
		//remove logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		//Open browser
		WebDriver driver=new FirefoxDriver();

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
