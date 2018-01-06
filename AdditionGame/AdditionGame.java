//Kelly Catbagan
//CSIS 1400
//Koziatek

//ASSUMPTIONS
//1. User enters integer > 0 for numberOfProblems

import java.util.*;

public class AdditionGame
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in); //declare and initialize scanner and generator
		Random generator = new Random(); 

		System.out.print("Welcome to the Addition Game! Here you can " +
						  "practice adding 2 numbers less than 100!" +
						  " How many problems do you want to practice? ");

		int numberOfProblems = input.nextInt();	//take user input to determine number of problems in game

		System.out.println("\nGreat! Let's get started!\n");

		int currentProblem = 0; //declare and initialize global variables
		int randomInt1 = 0;
		int randomInt2 = 0;
		int answer = 0;	
		int guess = 0;	
		int totalCorrect = 0;
		String output = ""; 
 
                while (numberOfProblems - currentProblem > 0)
		{		
			randomInt1 = generator.nextInt(100 + 1); //reassign values to local variables
			randomInt2 = generator.nextInt(100 + 1);
			answer = randomInt1 + randomInt2;	

			System.out.print("What is " + randomInt1 + " + " + 
							randomInt2 + "? ");

			guess = input.nextInt();  //take user input to compare to problem answer

			if(guess == answer)
			{	
				totalCorrect = totalCorrect + 1; //count total correct problems out of number of desired problems
				output = "Correct " + Integer.toString(totalCorrect) +" out of " 
				         + Integer.toString(numberOfProblems); 
			}
			else 
			{
				output = "Incorrect " + Integer.toString(totalCorrect) +" out of " 
				         + Integer.toString(numberOfProblems);
 			}
			
			currentProblem = currentProblem + 1; //count number of problems to achieve user's desired number of problems
			System.out.println(output); 
		}

		System.out.println("Great work! Practice is the key to success!");

	}
}
