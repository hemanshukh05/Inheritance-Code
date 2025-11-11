/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.


EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.


Explanation:
 Tests inheritance where logic changes depending on product type.
*/



import java.util.*;

class Product{
    int id;
    String name;
    double basePrice;

    void setData(int id,String name,double price){
        this.id=id;
        this.name=name;
        basePrice=price;
    }
}

class LuxuryProduct extends Product {
    
    void showFinalPrice(){
        double tax = basePrice*20/100; 
		double finalPrice = basePrice+tax;
		
        System.out.println("\nLuxury Product\n====================");
        System.out.println("Product ID: "+id+"\nName: "+name+"\nBase Price: "+basePrice+"\nTax 20%: "+tax);
        
        System.out.println("Final Price: "+finalPrice);
    }
}

class EssentialProduct extends Product {
    
    void showFinalPrice(){
        double tax = basePrice*5/100; 
        double finalPrice = basePrice+tax;
		
        System.out.println("\nEssential Product\n====================");
        System.out.println("Product ID: "+id+"\nName: "+name+"\nBase Price: "+basePrice+"\nTax 5%: "+tax);
        
        System.out.println("Final Price: "+finalPrice);
    }
}

public class Q9_Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
        LuxuryProduct lp = new LuxuryProduct();
        System.out.print("Enter Luxury Product ID: ");
        int lId = sc.nextInt();
      
        System.out.print("Enter Luxury Product Name: ");
        String lName =sc.nextLine();
		sc.nextLine();
		
        System.out.print("Enter Luxury Product Base Price: ");
        double lPrice = sc.nextDouble();
		lp.setData(lId,lName,lPrice);
		lp.showFinalPrice();

        
        EssentialProduct ep = new EssentialProduct();
        System.out.print("\nEnter Essential Product ID: ");
        int eId =sc.nextInt();

        System.out.print("Enter Essential Product Name: ");
        String eName =sc.nextLine();
		sc.nextLine();
		
        System.out.print("Enter Essential Product Base Price: ");
        double ePrice = sc.nextDouble();
        ep.setData(eId,eName,ePrice);
		ep.showFinalPrice();      
    }
}