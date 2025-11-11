/*
4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.

*/

import java.util.*;

class Student{
	String name;
	int marks;
	
	void setData(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	
	void result(){
		System.out.println("All Students are passed");
	}
}

class EngineeringStudent extends Student{
	void result(){
        System.out.println("\nEngineering Student\n===========================");
        System.out.println("\tName: "+name+"\n\tMarks: "+marks);
 
        if (marks >= 50)
            System.out.println("Status: Pass");
        else
            System.out.println("Status: Fail");
    }
}
class MedicalStudent extends Student{
	void result(){
        System.out.println("\nMedical Student\n===========================");
        System.out.println("\tName: "+name+"\n\tMarks: "+marks);
 
        if (marks >= 50)
            System.out.println("Status: Pass");
        else
            System.out.println("Status: Fail");
    }
}


public class Q4_Result{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		EngineeringStudent egs= new EngineeringStudent();
		egs.setData("Sanket",60);
		egs.result();
		
		MedicalStudent mds=new MedicalStudent();
		mds.setData("Rahul",45);
		mds.result();
	}
}