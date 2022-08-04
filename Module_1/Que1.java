package Module_1;

import java.util.Scanner;

public class Que1
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first number");
		a=sc.nextInt();
		System.out.println("Enter your second number");
		b=sc.nextInt();
		System.out.println("Enter your third number");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greatest..");
		}
		else if(b>c && b>a)
		{
			System.out.println("B is greatest..");
		}
		else 
		{
			System.out.println("C is greatest");
		}
	}
}
