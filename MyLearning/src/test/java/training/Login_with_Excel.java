package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_with_Excel {
	//Global variables		
		public static String p_password;
		public static String p_username;
		public static String[][] dataArray;

	public static void main(String[] args) throws Exception {
		//Call the Data Array
		dataArray=ExcelParser.getData("Data.xls");
		
		//Read the data from the array
		for(int i=0;i<dataArray.length;i++){
			//Initialize the variables			
			p_password=dataArray[i][1];
			p_username=dataArray[i][0];
			
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
