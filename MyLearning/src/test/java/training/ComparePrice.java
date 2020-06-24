package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComparePrice {

	public static void main(String[] args) throws Exception {	
		
		//Open Chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\training\\src\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		///driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/home-kitchen/kitchen-appliances/induction-cooktops/pr?facets.availability[]=Exclude+Out+of+Stock&p[]=facets.brand%255B%255D%3DBajaj&p[]=facets.brand%255B%255D%3DMorphy%2BRichards&p[]=facets.brand%255B%255D%3DPhilips&p[]=facets.brand%255B%255D%3DPigeon&p[]=facets.brand%255B%255D%3DPrestige&p[]=facets.discount_range%255B%255D%3D35%2525%2B-%2B40%2525&p[]=facets.discount_range%255B%255D%3D40%2525%2B-%2B45%2525&p[]=facets.discount_range%255B%255D%3D45%2525%2B-%2B50%2525&p[]=facets.discount_range%255B%255D%3DMore%2Bthan%2B50%2525&p[]=facets.filter_standard%255B%255D%3D1&sid=j9e%2Fm38%2F575&otracker=clp_banner_2_1.bannerX3.BANNER_kitchen-appliances-store_91a2a9f3-55fb-4bdf-861b-cb88829c8dd9_wp1");
		System.out.println("site open");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[1]/div/a[1]/div[1]/div/div[1]/img")).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println("p");
		
		if(driver.findElements(By.xpath(".//h1[@data-reactid='198']")).size()!=0)//check the availability of asset
		{
		String data = driver.findElement(By.xpath(".//div[@data-reactid='216']")).getText();	       
        System.out.println("data is" +data);
		}
      
          System.out.println("r");
          driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
          System.out.println("t");
          Thread.sleep(5000);
          driver.get("https://www.google.co.in/search?q=amazon&ie=utf-8&oe=utf-8&gws_rd=cr&ei=vjQEWY3BJMPXvgSj1pLICA#q=induction+cooktop");
          Thread.sleep(5000);
          driver.findElement(By.xpath(".//div[contains(@class,'pla-hovercard-container')]")).click();
          Thread.sleep(5000);
          
          if(driver.findElements(By.xpath("//span[contains(@itemprop,'name')]")).size()!=0)//check the availability of asset
  		{
  		String data1 = driver.findElement(By.xpath("//span[contains(@class,'product_price')]")).getText(); 	         
        System.out.println("data is" +data1);
  		}
          
      //    driver.manage().window().maximize();
          driver.findElement(By.xpath(".//*[@id='productTitle']"));
          
}
}