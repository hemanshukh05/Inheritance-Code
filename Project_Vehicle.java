/*Q2. Problem Statement:
Write a Java program to implement the concept of inheritance for different types of vehicles.
 The program must include four classes:
	1. Vehicle – Superclass
	2. Bus – Subclass of Vehicle
	3. Truck – Subclass of Vehicle
	4. Transport – Driver class containing the main() method


The goal is to demonstrate the concept of inheritance, constructor chaining, method overriding, 
and object-oriented encapsulation.

Detailed Description:

1. Class: Vehicle (Superclass)

Data Members:
	1. String model – Vehicle model
	2. String registrationNumber – Registration number of the vehicle
	3. double speed – Vehicle speed in kilometers per hour
	4. double fuelCapacity – Fuel tank capacity in liters
	5. double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor
	* Initializes all data members with the given values.

Getters and Setters
	* Provide get and set methods for each data member.

fuelNeeded(double distance)
	* Accepts distance (in kilometers) as an argument.
	* Calculates and returns the amount of fuel required for that distance.

distanceCovered(double time)
	* Accepts time (in hours) as an argument.
	* Calculates and returns the distance covered based on the vehicle’s speed.

display()
	* Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.

2. Class: Truck (Subclass of Vehicle)

Additional Data Member:
	-> double cargoWeightLimit – Cargo carrying capacity in kilograms.

Member Methods:
	1. Parameterized Constructor
		* Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


	2. Overridden display() Method
		* Must call super.display() to display the base class details,
		 and then display the cargo weight limit specific to the truck.

3. Class: Bus (Subclass of Vehicle)

Additional Data Member:
    ->int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods:
	1. Parameterized Constructor
		* Initializes all data members, including those from the superclass (using super()).

	2. Getters and Setters
		* Provide getter and setter methods for numberOfPassengers.

	3. Overridden display() Method
		* Must call super.display() to display base class details,
		  and then display the number of passengers specific to the bus.

4. Class: Transport (Driver Class)

Description:
	This class must contain the main() method to test inheritance and method overriding.

Steps to Perform in main() Method:
	i) Create an object of Truck and initialize all its data members with valid values 
	   using the parameterized constructor.

	ii) Create an object of Bus and initialize all its data members with valid values 
	    using the parameterized constructor.

	iii)For both objects:
		* Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).

		* Call the distanceCovered() method by passing a sample time (e.g., 5 hours).

		* Call the display() method to display all details.

Concepts Demonstrated:
	* Inheritance (Superclass → Subclasses)
	* Constructor Chaining using super()
	* Method Overriding (display() method)
	* Encapsulation (Private data members with getters/setters)
	* Polymorphism (Different display() methods for Bus and Truck)

*/
import java.util.Scanner;

class Vehicle{
	private String model;
	private String registrationNumber;
	private double speed;
	private double fuelCapacity; 
	private double fuelConsumption;

	Vehicle(String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption){
		this.model=model;
		this.registrationNumber=registrationNumber;
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
		this.fuelConsumption=fuelConsumption;
	}
	
	//Getters and Setters
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setReg(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	public String getReg(){
		return registrationNumber;
	}
	public void setSpeed(double speed){
		this.speed = speed;
	}
	public double getSpeed(){
		return speed;
	}
	public void setCap(double fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	public double getCap(){
		return fuelCapacity;
	}
	public void setConsump(double fuelConsumption){
		this.fuelConsumption = fuelConsumption;
	}
	public double getConsump(){
		return fuelConsumption;
	}
	
	double fuelNeeded(double distance){
		double fuel = distance/fuelConsumption;
		return fuel;
	}
	
	double distanceCovered(double time){
		double distance = speed*time;
		return distance;
	}
	
	void display(){
		System.out.println("\n==========Vehicle Info===========");
		System.out.printf("Model : %s\nRegistration Number : %s\nSpeed of Vehicle : %.2f km/h",model,registrationNumber,speed);
		System.out.printf("\nFuel Capacity : %.2f\nFuel Comsumption : %.2f",fuelCapacity,fuelConsumption);
	}
}

class Truck extends Vehicle{
	double cargoWeightLimit; // Cargo carrying capacity in kilograms
	
	Truck(String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption,double cargoWeightLimit){
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.cargoWeightLimit=cargoWeightLimit;
	}
	
	void display(){
		super.display();
		System.out.printf("\nCargo Weight Limit of Truck : %.2f kg",cargoWeightLimit);
		System.out.println("\n================================");
	}
}

class Bus extends Vehicle{
	private int numberOfPassengers; // Total number of passengers the bus can carry
	
	Bus(String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption,int numberOfPassengers){
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.numberOfPassengers=numberOfPassengers;
	}
	
	//Getters and Setters
	public void SetNopass(){
		this.numberOfPassengers = numberOfPassengers;
	}
	public int gerNopass(){
		return numberOfPassengers;
	}

	void display(){
		super.display();
		System.out.printf("\nNumber of Passengers in Bus : %d",numberOfPassengers);
		System.out.println("\n================================");	
	}
}

public class Project_Vehicle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nFor Truck\n______________________");
		System.out.print("\nEnter Model Name : ");
		String mName = sc.nextLine();
		System.out.print("\nEnter Registration Number : ");
		String regNo=sc.nextLine();
		System.out.print("\nSpeed of Truck(km/h) : ");
		double speed= sc.nextDouble();
		sc.nextLine();
		System.out.print("\nEnter Fuel of Capacity of Truck(liters) : ");
		double fuelCap = sc.nextDouble();
		System.out.print("\nEnter Fuel Consumption(km/l) : ");
		double fuelCon = sc.nextDouble();
		System.out.print("\nEnter Cargo carrying capacity(kg) : ");
		double cargoWL= sc.nextDouble();
		
		Vehicle v = new Truck(mName,regNo,speed,fuelCap,fuelCon,cargoWL);
		System.out.print("\nEnter distance to be covered (in km): ");
		double km=sc.nextDouble();
		double fuel=v.fuelNeeded(km);
		System.out.printf("\nFuel needed: %.2f liters\n",fuel);
		System.out.print("\nEnter a time Travel(hours) : ");
		double time=sc.nextDouble();
		sc.nextLine();
		double dis=v.distanceCovered(time);
		System.out.printf("Distance covered: %.2f km\n",dis);
		
		v.display();
		
		System.out.println("\nFor Bus\n______________________");
		System.out.print("\nEnter Model Name : ");
		mName = sc.nextLine();
		System.out.print("\nEnter Registration Number : ");
		regNo=sc.nextLine();
		System.out.print("\nSpeed of Bus(km/h) : ");
		speed= sc.nextDouble();
		sc.nextLine();
		System.out.print("\nEnter Fuel of Capacity of Bus(liters) : ");
		fuelCap = sc.nextDouble();
		System.out.print("\nEnter Fuel Consumption(km/l) : ");
		fuelCon = sc.nextDouble();
		System.out.print("\nEnter Number of Passengers in Bus : ");
		int numberOP= sc.nextInt();
		
		v = new Bus(mName,regNo,speed,fuelCap,fuelCon,numberOP);
		
		System.out.print("\nEnter distance to be covered (in km): ");
		km=sc.nextDouble();
		fuel=v.fuelNeeded(km);
		System.out.printf("\nFuel needed: %.2f liters\n",fuel);
		System.out.print("\nEnter a time Travel(hours) : ");
		time=sc.nextDouble();
		dis=v.distanceCovered(time);
		System.out.printf("Distance covered: %.2f km\n",dis);
		
		v.display();
		
	}
}