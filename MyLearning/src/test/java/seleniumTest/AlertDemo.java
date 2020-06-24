package seleniumTest;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath(".//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(2000);
		String alert_msg=driver.switchTo().alert().getText();
		System.out.println(alert_msg);

		//using if statement
		if(alert_msg.equalsIgnoreCase("Please select start place."))
		{
			driver.switchTo().alert().accept();
		}
		//using assert 
		Assert.assertEquals(alert_msg,"Please select start place.");

		/*List<WebElement> linkList =driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		for(int i=0;i<=linkList.size()-1;i++)
		{
			WebElement element=linkList.get(i);
			String linkText=element.getText();

			if(linkText.equalsIgnoreCase("Automation practice form"))
			{
				element.click();
				break;
			} 
			System.out.println(linkText);
		}
		System.out.println(driver.findElement(By.xpath("//em[contains(text(),'ToolsQA is a leading provider')]")).getText());
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ashutosh");
	}*/
	}
}


