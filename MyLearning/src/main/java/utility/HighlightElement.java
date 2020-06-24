package utility;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public  class HighlightElement {

	public static void Highlighting(WebDriver driver,WebElement element)
	{
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver; 

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {

				System.out.println(e.getMessage());
			} 

			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

		}
		catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
