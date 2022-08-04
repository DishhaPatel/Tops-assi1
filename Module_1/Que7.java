package Module_1;

import java.util.Scanner;

public class Que7
{
	   public static void main(String[] args)
	   {
		int cout = 0;
		   System.out.println("Enter the number..");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>10000000) 
		{
			System.out.println("invalid number");
		
		}
		else 
		{
			while(a>0)
			{
				a=a/10;
				cout=cout+1;
			}
			System.out.println("Number of digit :"+cout);
		}
	   }	
		

}
