
package utility1;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;

public  class ScreenshotTest {

	public static void screenshot(WebDriver driver,String error)
	{
		try {
			        //typecast the TakesScreenshot interface
					TakesScreenshot ts= (TakesScreenshot)driver;
					//store the screenshot in source
					File source=ts.getScreenshotAs(OutputType.FILE);
					//copy file to desired file location using FileUtils class
					FileUtils.copyFile(source, new File("./Screenshot/"+error+".jpg"));
					System.out.println("Screenshot Taken successfully");
					
		} catch (Exception e) {
			System.out.println("Error while taking screenshot");
			e.printStackTrace();
		} 
	}

}
