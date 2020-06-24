package training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login_with_Properties {
	//Global variables
	public static String p_email;
	public static String p_password;
	public static String p_username;

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		//Load the Property file
		Properties objProp=new Properties();
		objProp.load(new FileInputStream("Data.properties"));
		
		//Read from the file
		//Initialize the variables
		
		
		p_username=objProp.getProperty("Username");
		p_password=objProp.getProperty("Password");
		System.out.println(p_username + p_password);
		
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
