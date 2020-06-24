package browserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserTest {

	public static void main(String[] args) {
		
		//launching browser without setting driver.exe
		//all driver are set in environment variable path
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome launched");
		WebDriver driver1=new FirefoxDriver();
		System.out.println("firefox launched");
		WebDriver driver2=new InternetExplorerDriver();
		System.out.println("IE launched");
	}

}
