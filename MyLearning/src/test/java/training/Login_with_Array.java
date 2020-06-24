package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_with_Array {
	//Global variables		
	public static String p_password;
	public static String p_username;

	public static void main(String[] args) throws InterruptedException {
		//Declare arrays

		String[] Username_Array={"standard_user","performance_glitch_user","problem_user"};
		String[] Password_Array={"secret_sauce","secret_sauce","secret_sauce"};

		//Read data from the Arrays
		for(int i=0;i<Username_Array.length;i++){
			//Initialize the variables						
			p_username=Username_Array[i];
			p_password=Password_Array[i];

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

}
