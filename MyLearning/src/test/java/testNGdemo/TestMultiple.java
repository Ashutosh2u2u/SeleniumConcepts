package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMultiple {

@Test
public void testLogin()
{
	//System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver_win32//chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput", "true");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    try {
    	//open url
    	driver.get("https://demo.opencart.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
        
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally{
    	//driver.close();    	
    }      
}
@Test
public void testRegisteration()
{
	System.out.println("hi");
}
}

