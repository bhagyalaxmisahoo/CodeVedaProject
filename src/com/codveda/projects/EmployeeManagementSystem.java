package com.codveda.projects;

import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	private int id;
	private String name;
	private double salary;

public Employee(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public int getId()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
}
public void setSalary(double salary)
{
	this.salary=salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}

public class EmployeeManagementSystem {

	private static ArrayList<Employee> employees=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean running=true;
		
		while(running)
		{
			System.out.println("\n====Employee Management System====");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice: ");
			
			int choice=-1;
			try
			{
				choice=Integer.parseInt(sc.nextLine());
			}
			catch (Exception e)
			{
				System.out.println("Invalid input.Please enter a number..");
			}
			
			switch(choice)
			{
			case 1->addEmployee();
			case 2->viewEmployees();
			case 3->updateEmployee();
			case 4->deleteEmployee();
			case 5->{
				System.out.println("Existing..Thank You!!");
				running =false;
			}
			default->System.out.println("Invalid Choice.Please try again.");
			}
		}
		sc.close();
	}
public static void addEmployee()
{
	try
	{
		System.out.print("Enter Employee ID: ");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		
		employees.add(new Employee(id, name, salary));
		System.out.println("Employee added successfully.");
	}
	catch(Exception e)
	{
		System.out.println("Error: "+e.getMessage());
	}
}
public static void viewEmployees()
{
	if(employees.isEmpty())
	{
		System.out.println("No employees found.");
	}
	else
	{
		System.out.println("\n Employee List::");
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
	}
}
public static void updateEmployee()
{
	System.out.println("Enter Employee ID to update: ");
	int id=Integer.parseInt(sc.nextLine());
	
	for(Employee emp:employees)
	{
		if(emp.getId()== id)
		{
			System.out.println("Enter new name: ");
			String name=sc.nextLine();
			emp.setName(name);
			
			
			System.out.println("Enter new salary: ");
			double salary=Double.parseDouble(sc.nextLine());
			emp.setSalary(salary);
			
			System.out.println("Employee updated..");
			return;
		}
	}
	System.out.println("Employee not found..");
}
public static void deleteEmployee()
{
	System.out.println("Enter Employee ID to delete: ");
	int id=Integer.parseInt(sc.nextLine());
	
	for(Employee emp:employees)
	{
		if(emp.getId()==id)
		{
			employees.remove(emp);
			System.out.println("Employee deleted..");
			return;
		}
	}
	System.out.println("Employee not found.");
}
}

