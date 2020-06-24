package testNGdemo;
import java.util.Scanner;
public class TestNaukri {
	 
    //public class Arithmetic{ 
/*public static void main(String[] args){ 
    int x, y,sum,sub,mul,div,mod; 
    Scanner scanner = new Scanner(System.in); 
    x = scanner.nextInt(); 
    y = scanner.nextInt(); 
    sum = x+y; 
    sub = x-y; 
    mul = x*y; 
    div = x/y; 
    mod = x%y; 
System.out.println(x+"+"+y+"="+sum); 
            System.out.println(x+"-"+y+"="+sub); 
            System.out.println(x+"*"+y+"="+mul); 
            System.out.println(x+"/"+y+"="+div); 
            System.out.println(x+"%"+y+"="+mod); 
 
} */
//} 
/*//public class Table{ 
public static void main(String[] args){ 
int i,j,k; 
Scanner scanner = new Scanner(System.in); 
i = scanner.nextInt(); 
for(j=1;j<=10;j++){ 
    k=i*j; 
    System.out.println(i+"*"+j+"="+k); 
} 


} 
}*//*
	 public static void main(String[] args)
	 {
	  long binary1, binary2;
	  int i = 0, remainder = 0;
	  int[] sum = new int[20];
	  Scanner in = new Scanner(System.in);

	  System.out.print("Input first binary number: ");
	  binary1 = in.nextLong();
	  System.out.print("Input second binary number: ");
	  binary2 = in.nextLong();

	  while (binary1 != 0 || binary2 != 0) 
	  {
	   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
	   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
	   binary1 = binary1 / 10;
	   binary2 = binary2 / 10;
	  }
	  if (remainder != 0) {
	   sum[i++] = remainder;
	  }
	  --i;
	  System.out.print("Sum of two binary numbers: ");
	  while (i >= 0) {
	   System.out.print(sum[i--]);
	  }
	   System.out.print("\n");  
	 }
	}*/
	public static void main(String[] args){ 
        String a; 
        Scanner scanner = new Scanner(System.in); 
        a= scanner.nextLine(); 
        char[] ch = new char[a.length()];  
       int k = 1; 
       for (int i = 0; i < a.length(); i++) {  
       int l=a.length()-k; 
       ch[i] = a.charAt(l);  
       k++; 
   }  
   for (char c : ch) {  
      System.out.print(c);  
   }  
   scanner.close();
	}
}

	




	


