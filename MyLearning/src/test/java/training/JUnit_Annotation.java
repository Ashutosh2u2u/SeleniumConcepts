package training;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit_Annotation {
	
	@Test
	public void FirstMethod(){
		System.out.println("This is the 1st test method");
	}
	
	@Test
	public void SecondMethod(){
		System.out.println("This is the 2nd test method");
	}
	
	@Ignore
	@Test
	public void ThirdMethod(){
		System.out.println("This is the 3rd test method");
	}
	
	@Test
	public void FourthMethod(){
		System.out.println("This is the 4th test method");
	}
	
	@After
	public void AfterMethod(){
		System.out.println("This is the After Method");
	}
	
	@Before
	public void BeforeMethod(){
		System.out.println("This is the Before Method");
	}
	
	@AfterClass
	public static void AfterClassMethod(){
		System.out.println("This is the After Class method");
	}

	
	@BeforeClass
	public static void BeforeClassMethod(){
		System.out.println("This is the Before Class Method");
	}
}
