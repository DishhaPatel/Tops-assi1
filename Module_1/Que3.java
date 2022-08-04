package Module_1;

import java.util.Scanner;

public class Que3 
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter a year..");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println(" year is leap year.. ");
		}
		else 
		{
			System.out.println("year is not leap year..");
		}
	//for loop to print 10 natural number
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
}
}