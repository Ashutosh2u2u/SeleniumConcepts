package training;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("______________________________________________________________________________________");
		System.out.println("\t\t\tMULTIPLICATION TABLE");
		System.out.println("======================================================================================");
		for(int i=1;i<=12;i++)
		{
			/*if(i==1) 
			{
				System.out.printf("x  | %d  | %d  | %d  | %d  | %d  | %d  | %d  | %d  | %d  | %d  | %d  | %d|\n",i, 
						(i+1), (i+2),(i+3),(i+4),(i+5),(i+6),(i+7),(i+8),(i+9),(i+10),(i+11));
			
			}*/
			for(int j=1;j<=12;j++) 
			{
				if(j==1)
				{
					if(i>9) 
					{
						System.out.printf("%d | %d ",i, (i*j));
					}
					else 
					{
						System.out.printf("%d  | %d ",i, (i*j));
					}
				}
				else 
				{
						if((i*j)>99) {
							System.out.printf("| %d ", (i*j));
							
					}
						else if((i*j)>9)
						{
							System.out.printf("| %d ", (i*j));
						}
						else
						{
							System.out.printf("| %d  ", (i*j));	
						}
				}
			}
			System.out.println();
		}

	}

}
