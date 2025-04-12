package com.codveda.projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	Random random=new Random();
	
	int randomNumber=random.nextInt(100)+1;
	int maxAttempts=7;
	int attempts=0;
	
	System.out.println("Welcome to the Number Guessing Game!");
	System.out.println("I'm thinking of a number between 1 and 100.");
	System.out.println("You have "+maxAttempts+" attempts to guess it.\n");
	
	while(attempts<maxAttempts)
	{
		System.out.println("Enter Your Guess:: ");
		
		
		if(!sc.hasNext())
		{
			System.out.println("Invalid input! Please enter a number.");
			sc.next();
			continue;
		}
		
		int userGuess=sc.nextInt();
		attempts++;
		
		if(userGuess == randomNumber)
		{
			System.out.println(" Congratulations! You guessed the number in "+attempts+" attempt(s).");
			break;
		}
		else if(userGuess<randomNumber)
		{
			System.out.println("Too low!");
		}
		else
		{
			System.out.println("Too high!");
		}
		
		if(attempts==maxAttempts)
		{
			System.out.println("\nYou've used all your attempts.The number was:"+randomNumber);
			System.out.println("Better luck next time!");
		}
	}
	sc.close();
	}

}
