package Module_1;

import java.util.Scanner;

public class Oue2
{

	
		public static void main(String[] args) 
		{
			char ch;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Character:-");
			ch=sc.next().charAt(0);
			
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			{
				System.out.println("Enter Character Is Vowel");
			}
			else if(ch>1)
			{
				System.out.println("Enter Character Is Consonant");
			}
			else
			{
				System.out.println("ERROR");
			}
			
		}
	}

