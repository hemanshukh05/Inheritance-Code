/*
1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/

import java.util.*;

class Employee{
	String name;
	int salary;
	
	void setValue(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
}

class Manager extends Employee{
	void Bonus(){
		int bonus=salary*20/100;
		int total=salary + bonus;
		System.out.println("Name : "+name+"\t\tSalary : "+salary);
		System.out.println("Total salary of Manager is = "+total);
	}
}
class Developer extends Employee{
	void Bonus(){
		int bonus=salary*20/100;
		int total=salary + bonus;
		System.out.println("Name : "+name+"\t\tSalary : "+salary);
		System.out.println("Total salary of Devoloper is = "+total);
	}
}


public class Q1_Company{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		Manager m=new Manager();
		m.setValue("Hemanshu",50000);
		m.Bonus();
		Developer d=new Developer();
		d.setValue("Prajwal",20000);
		d.Bonus();
	}

}