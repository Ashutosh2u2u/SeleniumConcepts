package testDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationLibrary {
	int waitTime=3000;
	public static WebDriverWait wait ; 
	public Boolean EnterDataToInputTextBox_UsingXpath(WebDriver driver,String SearchByXpath,String DataToEnter) throws IOException	
	{
		try
		{

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath(SearchByXpath)).sendKeys(DataToEnter);
		}
		catch(Exception e)
		{
			//result.print(e.getMessage(),"Fail");
			//driver, SearchByName+"_Failure");
			driver.close();
			return false;
		}

		return true;

	}

}
