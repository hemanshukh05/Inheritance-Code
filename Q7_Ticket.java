/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.


Explanation:
 Tests method overriding with percentage-based calculations.
*/


import java.util.*;

class Ticket{
    void calculatePrice(double price){
        System.out.println("No GST calculation defined.");
    }
}

class MovieTicket extends Ticket{
     
    void calculatePrice(double price){
        double gst = price*18/100;;
		
        System.out.println("\nMovie Ticket\n===================");
        System.out.println("Base Price: "+price+"\nGST (18%): "+gst);
    
        System.out.println("Total Price: "+(price+gst));
    }
}

class BusTicket extends Ticket{
     
    void calculatePrice(double price){
        double gst = price*5/100;
      
        System.out.println("\nBus Ticket\n===================");
        System.out.println("Base Price: "+price+"\nGST (5%): "+gst);
		
        System.out.println("Total Price: "+(price+gst));
    }
}

public class Q7_Ticket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter Movies Ticket Price");
		double mov=sc.nextDouble();
        MovieTicket m = new MovieTicket();
        m.calculatePrice(mov);
		
		System.out.println("\n\nEnter Bus Ticket Price");
		double bus=sc.nextDouble();
        BusTicket b = new BusTicket();
        b.calculatePrice(bus);
    }
}