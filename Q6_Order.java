/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.

*/


import java.util.*;

class Order {
    int orderId;
    double amount;

    void setData(int id, double amount) {
		orderId=id;
        this.amount =amount;
    }

    void calculateBill() {
        System.out.println("Depends on Order");
    }
}

class CODOrder extends Order{
     
    void calculateBill(){
        double bill = amount + 50;
		
        System.out.println("\nCash on Delivery Order\n======================");
        System.out.println("Order ID: "+orderId+"\nBase Amount: "+amount+"\nDelivery Charge: 50");

        System.out.println("Final Bill Amount: " +bill);
    }
}

class OnlinePaymentOrder extends Order{
     
    void calculateBill(){
        double cashback = amount*5/100; 
        double bill = amount-cashback;
		
        System.out.println("\nOnline Payment Order\n======================");
        System.out.println("Order ID: "+orderId+"\nBase Amount: "+amount+"\nCashback 5%: "+cashback);
         
        System.out.println("Final Bill Amount after Cashback: " +bill);
    }
}

public class Q6_Order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CODOrder cod = new CODOrder();
        cod.setData(1001,5000);
        cod.calculateBill();
		
        OnlinePaymentOrder online = new OnlinePaymentOrder();
        online.setData(1005,7000);
        online.calculateBill();
    }
}