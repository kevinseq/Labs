
/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 6 (Abstract Class) 
  Professor Name: 
  Student Name: 
  Date: 03/14/2018
****************/

//This is a class definition for the Employee abstract class
import java.util.Date;
public abstract class Employee {
	
	//Instance Variable
	private String name;
	private String ssn;
	private Date hireDate;
	
	//A no-argument constructor
	public Employee() {
		
	}
	
	//A constructor with name, ssn, hireDate as arguments
	public Employee(String name, String ssn, Date hireDate) {
		this.name = name;
		this.ssn = ssn;
		this.hireDate = hireDate;
	}
	
	//Accessors
	public String getName() {
		return this.name;
	}
	
	public String getSsn() {
		return this.ssn;
	}
	
	public Date getHireDate() {
		return this.hireDate;
	}
	
	//Mutators
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	//Abstract Methods 
	public abstract double getPay();
	
	public abstract int getDaysOff();
	
	//Concrete Methods 
	public boolean samePay(Employee other) {
		return(this.getPay() == other.getPay());
	}
	
	public boolean sameDaysOff(Employee other) {
		return (this.getDaysOff() == other.getDaysOff());
	}
}

//This class defines the professor class that inherits from the Employee Abstract class.
public class Professor extends Employee{
	
	//Instance Variables 
	private String employeeType;
	private int daysOff;
	private int pay;
	private String payMethod;
	
	//A no-argument constructor
	public Professor() {
		
	}
	
	//A constructor with the daysOff, pay and payMethod arguments
	public Professor(String employeeType,int daysOff, int pay, String payMethod) {
		this.employeeType = employeeType;
		this.daysOff = daysOff;
		this.pay = pay;
		this.payMethod = payMethod;
	}
	
	//Accessors 
	public String getEmployeeType() {
		return this.employeeType;
	}
	
	public double getPay() {
		return this.pay;
	}
	
	public int getDaysOff() {
		return this.daysOff;
	}
	
	public String getPayMethod() {
		return this.payMethod;
	}
	
	//Mutators 
	
	
	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	//toString Method
		public String toString() {
			String output = "\n Employee Information \n";
			output += "\t Employee Type: " + this.getEmployeeType() + "\n";
			output += "\t Employee Days Off: " + this.getDaysOff() + "\n";
			output += "\t Employee Pay: " + this.getPay() + "\n";
			output += "\t Employee PayMethod: " + this.getPayMethod() + "\n";
			return output;
		}
	
}

//This class defines the professor class that inherits from the Employee Abstract class.
public class Ta extends Employee{
	
	//Instance Variables 
	private String employeeType;
	private int daysOff;
	private int pay;
	private String payMethod;
	
	//A no-argument constructor
	public Ta() {
		
	}
	
	//A constructor with the daysOff, pay and payMethod arguments
	public Ta(String employeeType, int daysOff, int pay, String payMethod) {
		this.employeeType = employeeType;
		this.daysOff = daysOff;
		this.pay = pay;
		this.payMethod = payMethod;
	}
	
	//Accessors 
	public String getEmployeeType() {
		return this.employeeType;
	}
	
	public double getPay() {
		return this.pay;
	}
	
	public int getDaysOff() {
		return this.daysOff;
	}
	
	public String getPayMethod() {
		return this.payMethod;
	}
	
	//Mutators 
	
	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	//toString Method
		public String toString() {
			String output = "\n Employee Information \n";
			output += "\t Employee Type: " + this.getEmployeeType() + "\n";
			output += "\t Employee Days Off: " + this.getDaysOff() + "\n";
			output += "\t Employee Pay: " + this.getPay() + "\n";
			output += "\t Employee PayMethod: " + this.getPayMethod() + "\n";
			return output;
		}
	
}

//This is the driver class
public class Driver {
	public static void main(String[] args) {
		Professor p1 = new Professor("Professor",90,90000,"Yearly");
		Professor p2 = new Professor("Professor",90,60000,"Yearly");
		Ta t1 = new Ta("TA",30,15,"Hourly");
		Ta t2 = new Ta("TA",30,13,"Hourly");
		
		System.out.println(“The Professor and the TA have the same pay: ” + p1.samePay(t1));
		System.out.println(“The Professor and the TA have the same days off: ” + p2.sameDaysOff(t2));
		

	}

}
