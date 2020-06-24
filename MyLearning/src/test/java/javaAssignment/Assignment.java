package javaAssignment;

import java.util.Scanner;

public class Assignment {



	private static int countOccurrences(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}

		return counter;
	}
	public static String replaceChar(String st1)
	{
		String replaceString=st1.replace('w','T');
		return replaceString;
	}

	public static String concatStrs(String st1,String st2)
	{
		String ConcatString=st1.concat(st2);
		return ConcatString;
	}

	public static String uprcaseStr(String st1)
	{
		String UprString=st1.toUpperCase();
		return UprString;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();

		System.out.println("You entered string "+str1+ "  " +str2+"");
		char ch ='w';

		System.out.println("Character " + ch + " occurs " + countOccurrences(str1, ch) + " times.");
		System.out.println("Character " + ch + " occurs " + countOccurrences(str2, ch) + " times.");
		
		System.out.println(replaceChar(str1));
		System.out.println(replaceChar(str2));
		
		System.out.println(uprcaseStr(str1));
		System.out.println(uprcaseStr(str2));
		
		
		System.out.println(concatStrs(str1, str2));
	}
}
