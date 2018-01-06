//Kelly Catbagan
//CSIS 1400
//Koziatek
//
//ASSUMPTIONS
//1. User enters integer

import java.util.Scanner;

public class AndOR
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		boolean div5 = n % 5 == 0;
		boolean div6 = n % 6 == 0; 
		String out = "";

		if(div5 || div6)
		{
			if(div5 && div6)
				out = "divisible by 5 and 6";
			else 
				out = "divisible by 5 or 6, but not both";
		}

		else
			out = "not divisible by 5 or 6";

		System.out.println(out);
	}
}
