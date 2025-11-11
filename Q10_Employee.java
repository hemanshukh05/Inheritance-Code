/*
10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.


ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.


Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/


import java.util.*;

class Employee {
    String name;
    double salary;

    void setData(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
	void calculateBonus(){}
}

class PermanentEmployee extends Employee{
    void calculateBonus(){
        double bonus = salary*25/100;
        System.out.println("\nPermanent Employee\n====================");
        System.out.println("Name: "+name+"\nSalary: "+salary+"\nBonus 25%: "+bonus);
    }
}

class ContractEmployee extends Employee{
    void calculateBonus(){
        double bonus = salary *10/100;
        System.out.println("\nContract Employee\n====================");
        System.out.println("Name: "+name+"\nSalary: "+salary+"\nBonus 10%: "+bonus);
    }
}

public class Q10_Employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Permanent Employee Name: ");
        String pName = sc.nextLine();
        System.out.print("Enter Salary: ");
        double pSal = sc.nextDouble();
		sc.nextLine();

        Employee emp= new PermanentEmployee();
        emp.setData(pName, pSal);
        emp.calculateBonus();  

        System.out.print("\nEnter Contract Employee Name: ");
        String cName = sc.nextLine();
        System.out.print("Enter Salary: ");
        double cSal = sc.nextDouble();

        emp = new ContractEmployee(); 
        emp.setData(cName,cSal);
        emp.calculateBonus(); 
    }
}