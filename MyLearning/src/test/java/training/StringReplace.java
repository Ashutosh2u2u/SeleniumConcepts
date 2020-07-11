package training;

public class StringReplace {

	public static void main(String[] args) {
		String newString=newStringwith_("This is my house");
		System.out.println(newString);

	}
	public static String newStringwith_(String CurrentParameter)
	{
		String newParameter=null;
		if(CurrentParameter.contains(" "))
		{
		  newParameter=CurrentParameter.replaceAll(" ","<#@#>");
		}
		else
		{
			newParameter=CurrentParameter;
		}
		return newParameter;
		
	}
}
