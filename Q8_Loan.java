/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.


Explanation:
 Tests inheritance with customized formula calculations.
*/

import java.util.*;

class Loan{
    double amount;
    int years;

    void setData(double amount,int years){
        this.amount = amount;
        this.years = years;
    }

    void calculateEMI(double rate) {
        System.out.println("Generic Loan — No EMI calculation defined.");
    }

    /*double getEMI(double rate){
        rate = rate/(12*100); 
        int months = years*12;
        double emi =(amount*rate*Math.pow(1+rate,months))/(Math.pow(1+rate,months)-1);
        return emi;
    }*/
}

class HomeLoan extends Loan{
     
    void calculateEMI(double rate){
        //double emi = getEMI(7);
		rate = rate/(12*100); 
        int months = years*12;
        double emi =(amount*rate*Math.pow(1+rate,months))/(Math.pow(1+rate,months)-1);
        System.out.println("\nHome Loan\n=================");
        System.out.println("Loan Amount: "+amount+"\nYears: "+years+"\nInterest Rate: 7%");

        System.out.printf("Monthly EMI: %.2f\n",emi);
    }
}

class CarLoan extends Loan{
    
    void calculateEMI(double rate){
        //double emi = getEMI(9);  
		//double rate=9;
		rate = rate/(12*100); 
        int months = years*12;
        double emi =(amount*rate*Math.pow(1+rate,months))/(Math.pow(1+rate,months)-1);
        System.out.println("\nCar Loan\n=================");
        System.out.println("Loan Amount: "+amount+"\nYears: "+years+"\nInterest Rate: 9%");

        System.out.printf("Monthly EMI: %.2f\n",emi);
    }
}

public class Q8_Loan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Home Loan Amount: ");
        double hAmt=sc.nextDouble();
        System.out.print("Enter Home Loan Tenure (in years): ");
        int hYrs=sc.nextInt();
		System.out.print("Enter Interrest Rate : ");
		double hrate=sc.nextDouble();

        HomeLoan h = new HomeLoan();
        h.setData(hAmt, hYrs);
        h.calculateEMI(hrate);

  
        System.out.print("\nEnter Car Loan Amount: ");
        double cAmt =sc.nextDouble();
        System.out.print("Enter Car Loan Tenure (in years): ");
        int cYrs =sc.nextInt();
		System.out.print("Enter Interrest Rate : ");
		double crate=sc.nextDouble();

        CarLoan c = new CarLoan();
        c.setData(cAmt, cYrs);
        c.calculateEMI(crate);
    }
}