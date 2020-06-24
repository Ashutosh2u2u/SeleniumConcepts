package training;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class JUnit_Assertions {
	
	@Rule
	public ErrorCollector objError=new ErrorCollector();
	
	@Test
	public void AssertionExample(){
		
		int a,b;
		a=50; b=50;
		try{
		Assert.assertEquals("Validating integers", a, b);}
		catch(Throwable e)
		{
			objError.addError(e);
			System.out.println(e);
			}
		String expected="Naman"; String actual="Naman";
		try{
		Assert.assertEquals("Checking Strings", expected, actual);}
		catch(Throwable e)
		{
			objError.addError(e);
			System.out.println(e);
			}
	}
}

