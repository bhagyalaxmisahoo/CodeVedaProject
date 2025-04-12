package com.codveda.projects;

import java.awt.Choice;
import java.util.Scanner;

class BankAccount
{
	private double balance;
	public BankAccount(double initialBalance)
	{
	if (initialBalance>=0)
	{
		this.balance=initialBalance;
	}	
	else
	{
		System.out.println("Initial balance cannot be negative.Setting balance to 0.");
		this.balance=0;
	}
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Successfully deposited:₹"+amount);
		}
		else
		{
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Withdrawal amount must be positive.");
		}
		else if(amount>balance)
		{
			System.out.println("Insufficient funds.Current balance:₹"+balance);
		}
		else
		{
			balance-=amount;
			System.out.println("Successfully withdrew:₹ "+amount);
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Your current balance is:₹"+balance);
	}
	
}
public class BankingApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BankAccount account=new BankAccount(0);
		
		while(true)
		{
			System.out.println("\n====Simple Banking System====");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.print("Choose an option(1-4): ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter deposit amount:₹");
				double deposit=sc.nextDouble();
				account.deposit(deposit);
				break;
			case 2:	
				System.out.println("Enter withdrawal amount:₹");
				double withdraw=sc.nextDouble();
				account.withdraw(withdraw);
				break;
			case 3:
				account.checkBalance();
				break;
			case 4:
				System.out.println("Thank you for using the banking system.Goodbye!");
				sc.close();
				return;
			default:
				System.out.println("Invalid option.Please select 1-4.");
			}
		}
	}

}
