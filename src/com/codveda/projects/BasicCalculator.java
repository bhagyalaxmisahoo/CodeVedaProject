package com.codveda.projects;

import java.util.Scanner;

public class BasicCalculator {

	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double subtract(double a,double b)
	{
		return a-b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}
	public static double divide(double a,double b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Cannot divide by zero!!");
		}
		return a/b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter first number::");
			double num1=Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter second number::");
			double num2=Double.parseDouble(sc.nextLine());
			
			System.out.print("Choose operation(+,-,*,/): ");
			String option=sc.nextLine();
			
			double result;
			
			switch(option)
			{
			case "+":
				result=add(num1, num2);
				break;
			case "-":
				result=subtract(num1, num2);
				break;
			case "*":
				result=multiply(num1, num2);
				break;
			case "/":
				result=divide(num1, num2);
				break;
			default:
				System.out.println("Invalid Operation!!");
				return;
			}
			System.out.println("Result::"+result);
			
			
		}
		catch (NumberFormatException e)
		{
			System.out.println("Error: Please enter valid numbers..");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error: "+e.getMessage());
		}
		sc.close();
	}

}
