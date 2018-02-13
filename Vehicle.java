
public class Vehicle {
	
	//Instance Variables 
	private String vin;
	private String color;
	public int num_op;
	
	//A no-arg constructor
	public Vehicle() {
		
	}
	
	//An arg constructor
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
	
	public int getNumOperators() {
		return num_op;
	}
	
	//Mutators
	
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setNumOperators(int num_op) {
		this.num_op = num_op;
	}
	
	public String toString() {
		String output = "";
		output += "VIN: " + this.getVin() + "\nCOLOR: " + this.getColor() + "\nNUMBEROFOPERATORS: " + this.getNumOperators();
		return output;
	}
	
}


public class Car extends Vehicle {
	
	//Instance Variables 
	public String make;
	public String model;
	public double weight;
	
	//A no-arg constructor
	public Car() {
		
	}
	
	//An arg constructor
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
	
	public String toString() {
		String output = "";
		output += super.toString() + "\n";
		output += "MAKE: " + this.getMake() + "\nMODEL: " + this.getModel() + "\nWEIGHT: " + this.getWeight();
		return output;
	}
	
}


public class Test {

	public static void main(String[] args) {

		Car c1 = new Car("881237hh317hefh8237y","BLACK",5,"Toyata","z4",503.09);	
		System.out.println(c1.toString());
		
		

	}

}

