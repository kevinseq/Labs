
/****************
Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 4-bonus (Java Basics 101)
Professor Name: 
Student Name: 
Date: 02/13/2018
****************/

/* 
  This program does the following: 
    - Has 4 classes (Vehicle, Car, Sedan and a Lab4Bonus)
    - Car class inherits from Vehicle class and Sedan class inherits from the Car class
    - Main method is in the Lab4Bonus class
*/
public class Vehicle {
	
	//Instance Variables 
	private String vin;
	private String color;
	private int num_op;
	
	//A no-arg constructor.
	public Vehicle() {
		
	}
	
	//A constructor with arguments.
	public Vehicle(String vin, String color, int num_op) {
		this.vin = vin;
		this.color = color;
		this.num_op = num_op;
	}
	
	//Accessors 
	public String getVin() {
		return vin;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getNumOp() {
		return num_op;
	}
	
	//Mutators
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNumOp(int num_op) {
		this.num_op = num_op;
	}
	
	//toString Method
	public String toString() {
		String output = "";
		output += "\nVIN: " + this.getVin() + "\nCOLOR: " + this.getColor() + "\nNUM of OPERATORS: " + this.getNumOp();
		return output;
	}
	
	
}


public class Car extends Vehicle {
	
	//Instance Variable
	private String make;
	private String model;
	private double weight;
	
	//A no-arg constructor
	public Car() {
		
	}
	
	//Constructors with arguments.
	public Car(String make, String model, double weight) {
		this.make = make;
		this.model = model;
		this.weight = weight;
	}
	
	public Car(String vin, String color, int num_op, String make, String model, double weight) {
		super(vin,color,num_op);
		this.make = make;
		this.model = model;
		this.weight = weight;
	}
	
	//Accessors
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getWeight() {
		return weight;
	}
	
	//Mutators
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Car toString method.
	public String toString() {
		String output = "";
		output += "\nMAKE: " + this.getMake() + "\nMODEL: " + this.getModel() + "\nWEIGHT: " + this.getWeight();
		return output;
	}
	
	public String toStringWithSuperClass() {
		String output = "";
		output += super.toString() + "\n";
		output += "MAKE: " + this.getMake() + "\nMODEL: " + this.getModel() + "\nWEIGHT: " + this.getWeight();
		return output;
	}
	
	
}


public class Sedan extends Car {
	//Instance Variable
		private int num_doors;
		private double engine_cap;
		private int num_pass;
		
		//A no-arg constructor
		public Sedan() {
			
		}
		
		//Constructors with arguments.
		public Sedan(int num_doors, double engine_cap, int num_pass) {
			this.num_doors = num_doors;
			this.engine_cap = engine_cap;
			this.num_pass = num_pass;
		}
		
		public Sedan(String make, String model, double weight, int num_doors, double engine_cap, int num_pass) {
			super(make,model,weight);
			this.num_doors = num_doors;
			this.engine_cap = engine_cap;
			this.num_pass = num_pass;
		}
		
		//Accessors
		public int getNumOfDoors() {
			return num_doors;
		}
		
		public double getEngineCap() {
			return engine_cap;
		}
		
		public int getNumPass() {
			return num_pass;
		}
		
		//Mutators
		public void setNumOfDoors(int num_doors) {
			this.num_doors = num_doors;
		}
		
		public void setEngineCap(double engine_cap) {
			this.engine_cap = engine_cap;
		}
		
		public void setNumPass(int num_pass) {
			this.num_pass = num_pass;
		}
		
		//Car toString method.
		public String toString() {
			String output = "";
			output += "\nDOORS: " + this.getNumOfDoors() + "\nENGINE: " + this.getEngineCap() + "\nPASSENGERS: " + this.getNumPass();
			return output;
		}
		
		public String toStringWithSuperClass() {
			String output = "";
			output += super.toString() + "\n";
			output += "DOORS: " + this.getNumOfDoors() + "\nENGINE: " + this.getEngineCap() + "\nPASSENGERS: " + this.getNumPass();
			return output;
		}
		
}

public class Lab4Bonus {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("234h324","Black",1);
		Car c1 = new Car("BMW","X5",180.0);
		Car c2 = new Car("jnkj431k","Blue",1,"Audi","S5",300.0);
		Sedan s1 = new Sedan(4,3.0,4);
		Sedan s2 = new Sedan("Range Rover","Sport",504.05,4,5.0,8);
		System.out.println(v1.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toStringWithSuperClass());
		System.out.println(s1.toString());
		System.out.println(s2.toStringWithSuperClass());

	}

}

