/*
Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.

Class Structure:
Parent Class – Person

Data Members:
 int id, String name, String address, String contactNo
 
Member Methods:
	1. addDetails() – Accept and store basic person details.
	2. displayDetails() – Display details of a person.
	3. updateAddress() – Update the address of a person.
	4. updateContact() – Update contact number.
	5. showBasicInfo() – Display ID, name, and contact number.

Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage

Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
	
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
	Add student details using addDetails() method.
	Enter marks for three subjects using enterMarks().
	Calculate and store the student’s percentage using calculatePercentage().
	Update the student’s contact number using updateContact().
	Display all details of the student using displayDetails().
	
	Add faculty details using addDetails() method.
	Assign subject to faculty using assignSubject().
	Calculate salary increment for the faculty using calculateIncrement().
	Update the faculty’s address using updateAddress().
	Display complete faculty information using displayFacultyInfo().
	
Instructions:
	Use constructors in all classes for initialization.
	
	Use the super keyword to call parent constructors in child classes.
	
	Apply method overriding for displayDetails() to show specific outputs for each child class.
	
	Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.

*/
import java.util.Scanner;

class Person{
	
	Scanner sc=new Scanner(System.in);
	
	int id; 
	String name;
	String address;
	String contactNo;
	
	void addDetails(int id,String name,String address,String contactNo){
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
	}
	
	void displayDetails(){
		System.out.print("Depends on child");
	}
	
	void updateAddress(){
		System.out.println("Enter updated address");
		address=sc.nextLine();
	}
	
	void updateContact(){
		System.out.println("Enter updated contact number");
		contactNo=sc.nextLine();
	}
	
	void showBasicInfo(){
		System.out.println("ID : "+id+"\nName : "+name+"\nAddress : "+address+"\nContact No. : "+contactNo);
	}
}

class Student extends Person{
	String courseName;
	int marks[]=new int[3];
	double percentage;
	
	Student(String courseName){
		//super.addDetails(id,name,address,contactNo);
		
		this.courseName=courseName;
	}
	
	void enterMarks(){
		System.out.println("Enter marks of Student");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		sc.nextLine();
	}
    void calculatePercentage(){
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
		}
		percentage=sum/(double)marks.length;
	}
	
	void displayDetails(){
		System.out.println("\n===========Student Info===========");
		System.out.println("ID : "+id+"\nName : "+name+"\nAddress : "+address+"\nContact No. : "+contactNo);
		System.out.println("Course : "+courseName);
		System.out.println("Marks of Student :");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
		}
		System.out.printf("\nPercentage : %.2f",percentage);
		System.out.println("\n==================================");
	}
}

class Faculty extends Person{
	String subject;
	double salary;
	int experience;
	
	Faculty(double salary,int experience){
		//super.addDetails(id,name,address,contactNo);
	
		this.salary=salary;
		this.experience=experience;
	}
	
	void assignSubject(){
		System.out.println("Enter Subject assign to the Teacher");
		subject=sc.nextLine();
	}
	
    void calculateIncrement(){
		System.out.println("Increament in salary");
		double inc=salary*10/100;
		System.out.println(inc);
		salary=salary+inc;
	}
	
    void displayFacultyInfo(){
		System.out.println("\n===========Teacher Info===========");
		System.out.println("ID :\t"+id+"\nName :\t"+name+"\nAddress :\t"+address+"\nContact No. :\t"+contactNo);
		System.out.println("Teaching Subject :\t"+subject);
		System.out.printf("Salary :\t%.2f \nExperience :\t%d Years",salary,experience);
		System.out.println("\n==================================");	 
	}
}

public class Project_College{
	public static void main(String[] args){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Course Name ");
	String cName=sc.nextLine();
	
	Student s =new Student(cName);
	
	int id=101; 
	System.out.println("Enter name of Student");
	String name=sc.nextLine();

	System.out.println("Enter Address of Student");
	String address=sc.nextLine();

	System.out.println("Enter Contact Number of Student");
	String contactNo=sc.nextLine();
	
	s.addDetails(id,name,address,contactNo);
	
	s.enterMarks();
	s.calculatePercentage();
	s.updateContact();
	s.displayDetails();
	

	System.out.println("\nEnter Salary of Teacher ");
	double sal=sc.nextDouble();
	
	System.out.println("Enter experience");
	int exp=sc.nextInt();
	sc.nextLine();
	
	Faculty f =new Faculty(sal,exp);
	
	id=1001; 
	System.out.println("Enter name of Teacher");
	name=sc.nextLine();
	 
	System.out.println("Enter Address of Teacher");
	address=sc.nextLine();
 
	System.out.println("Enter Contact Number of Teacher");
	contactNo=sc.nextLine();
	 
	
	f.addDetails(id,name,address,contactNo);
	
	f.assignSubject();
	f.calculateIncrement();
	f.updateAddress();
	f.displayFacultyInfo();	
	
	}
}
	