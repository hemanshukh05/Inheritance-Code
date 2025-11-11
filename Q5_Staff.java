/*
5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/


 import java.util.*;

class Staff{
    String name;
    double salary;

    void setData(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void incrementSalary() {
        System.out.println("Increment Depends");
    }
}

class TeachingStaff extends Staff {
     
    void incrementSalary(){
        double inc =salary*15/100;
		
        System.out.println("\nTeaching Staff\n=====================");
        System.out.println("Name: "+name+"Old Salary: "+salary);
 
        System.out.println("Salary after 15% increment: "+(salary+inc));
    }
}

class NonTeachingStaff extends Staff {
     
    void incrementSalary() {
        double inc =salary*10/100;
		
        System.out.println("\nNon-Teaching Staff\n=====================");
        System.out.println("Name: "+name+"Old Salary: "+salary);
        
        System.out.println("Salary after 10% increment: "+(salary+inc));
    }
}

public class Q5_Staff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        TeachingStaff ts = new TeachingStaff();
        ts.setData("Shubham",40000);
        ts.incrementSalary();

        NonTeachingStaff nts = new NonTeachingStaff();
        nts.setData("Praful",25000);
        nts.incrementSalary();

    }
}