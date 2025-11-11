/*
2. Question:
 Create a class BankAccount with a method calculateInterest(). 
 Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.

*/


import java.util.*;

class BankAccount{
	String accHolder;
	int accBalance;
	
	void setAcc(String name,int balance){
		accHolder=name;
		accBalance=balance;
	}
	void calculateInterest(){
		System.out.println("Interest depends on account");
	}
}

class SavingsAccount extends BankAccount{
	void calculateInterest(){
		double rate=5.0;
		double interest=accBalance*rate/100;
		
		System.out.println("Name : "+accHolder+"\t\tBlance in account : "+accBalance);
		System.out.println("Saving Account");
		System.out.println("Balance with Interest = "+(accBalance+interest));
	}
}
class CurrentAccount extends BankAccount{
	void calculateInterest(){
		double rate=3.0;
		double interest=accBalance*rate/100;
		
		System.out.println("Name : "+accHolder+"\t\tBlance in account : "+accBalance);
		System.out.println("Current Account");
		System.out.println("Balance with Interest = "+(accBalance+interest));
	}
}


public class Q2_Bank{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		SavingsAccount sa=new SavingsAccount();
		sa.setAcc("Hemanshu",10000);
		sa.calculateInterest();
		
		CurrentAccount ca=new CurrentAccount();
		ca.setAcc("Prajwal",2000);
		ca.calculateInterest();
	}

}