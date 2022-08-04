package Module_1;

import java.util.Scanner;

public class Que10
{

	
	    public static void main(String[] args) 
	    {
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        System.out.print("Input Number:");
	        String n = in.nextLine();
	        if (n.matches("[0-9]+"))
	        {
	            System.out.println(n + " + " + n + n + " + " + n + n + n + " = "
	                    + (Integer.parseInt(n) + Integer.parseInt(n + n) + Integer.parseInt(n + n + n)));
	        }
	        else
	        {
	            System.out.println("Error: Invalid Input.");
	        }
	        
	    }
}
