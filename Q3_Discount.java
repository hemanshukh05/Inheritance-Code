/*
3. Question:
 Create a base class Product with fields id, name, and price. 
 Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/
 
 
 import java.util.*;

class Product{
	int id;
	String name;
	int price;
	
	Product(int id, String name, int price){
		this.id=id;
		this.name=name;
		this.price=price;
		
		System.out.println("\n\nID : "+id+"\nName : "+name+"\nPrice : "+price);
	}
}

class Electronics extends Product{
	Electronics(int n){
		super(101,"Prajwal",1200);
		int dis= price*n/100;
		System.out.println("The Toatl Bill of Electrinics After Discount  : "+(price-dis));
	}
}
class Clothing extends Product{
	Clothing(int n){
		super(102,"Sahil",2200);
		int dis= price*n/100;
		System.out.println("The Toatl Bill of Cloths After Discount  : "+(price-dis));
	}
}


public class Q3_Discount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		Electronics els = new Electronics(10);
		
		Clothing cl = new Clothing(20);
		 
	}
}
