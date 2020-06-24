package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login_with_CSV {
	
	//Global variables		
		public static String p_password;
		public static String p_username;
		
	public static void main(String[] args) throws IOException, InterruptedException {
		//Load the CSV file
		File objFile=new File("Data.csv");
		FileReader objFR=new FileReader(objFile);
		BufferedReader objBR=new BufferedReader(objFR);
		String data;

		//Read the data from the file
		while((data=objBR.readLine())!=null){
			System.out.println(data);
			String[] dataArray=data.split(",");
			//Initialize the variables
			//p_email=dataArray[0];
			p_username=dataArray[0];
			p_password=dataArray[1];
			
			
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
