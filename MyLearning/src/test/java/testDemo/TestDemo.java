package testDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String arg[])  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");	
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();

		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ashu123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Ashu123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cruises')]")).click();
		Thread.sleep(2000);
				//{

		// }
		//driver.close();
	}}


