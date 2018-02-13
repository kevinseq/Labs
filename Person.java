/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 4 
  Professor Name: 
  Student Name: 
  Date: 02/08/2018
****************/

//This class defines the person class and it is a super class.

public class Person {
	
	//Instance Variables.
	public String name;
	public int age;
	private String ssn;
	public boolean alive;
	
	//A no-arg constructor
	public Person() {
		
	}
	
	//A constructor with the name, age, ssn, alive arguments.
	public Person(String name, int age, String ssn, boolean alive) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}
	
	//Accessors 
	public String getPersonName() {
		return name;
	}
	
	public int getPersonAge() {
		return age;
	}
	
	public String getPersonSsn() {
		return ssn;
	}
	
	public boolean getPersonAlive() {
		return alive;
	}
	
	//Mutators 
	
	public void setPersonName(String name) {
		this.name = name;
	}
	
	public void setPersonAge(int age) {
		this.age = age;
	}
	
	public void setPersonSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setPersonAlive(boolean alive) {
		this.alive = alive;
	}
	
	//toString Method
	public String toString() {
		String output = "";
		output += "PERSON NAME: " + this.getPersonName() + "\nPERSON AGE: " +  this.getPersonAge() + "\nPERSON SSN: " +  this.getPersonSsn() + "\nPERSON ALIVE: " +  this.getPersonAlive() +"\n";
		return output;
	}
	
	
}

//This class defines the student class and it is a sub class.

public class Student extends Person{
	
	//Instance Variables.
	private String stu_id;
	private double gpa;
	private String grade;
	
	//A no-arg constructor
	public Student() {
		
	}
	
	//A constructor with the stu_id, gpa and grade as arguments.
		public Student(String name, int age, String ssn, boolean alive, String stu_id, double gpa, String grade) {
			super(name,age,ssn,alive);
			this.stu_id = stu_id;
			this.gpa = gpa;
			this.grade = grade;
		}
		
	//Accessors
		public String getStudentId() {
			return stu_id;
		}
		
		public double getStudentGpa() {
			return gpa;
		}
		
		public String getStudentGrade() {
			return grade;
		}
		
		
	//Mutators
		public void setStudentId(String stu_id) {
			this.stu_id = stu_id;
		}
		
		public void setStudentGpa(double gpa) {
			this.gpa = gpa;
		}
		
		public void setStudentGrade(String grade) {
			this.grade = grade;
		}
		
	//toString Method
	public String toString() {
		String output = "";
		output += super.toString() + "\n";
		output += "STUDENT ID: " + this.getStudentId() + "\nSTUDENT GPA: " +  this.getStudentGpa() + "\nSTUDENT GRADE: " +  this.getStudentGrade() +"\n";
			return output;
		}
		
}

public class Teacher extends Person{
	
	//Instance Variables.
	private String id;
	private int salary;
	private int num_yr_prof;
	
	//A no-arg constructor
	public Teacher() {
		
	}
	
	//A constructor with id, salary and num_yr_prof as arguments.
	public Teacher(String name, int age, String ssn, boolean alive, String id, int salary, int num_yr_prof) {
		super(name,age,ssn,alive);
		this.id = id;
		this.salary = salary;
		this.num_yr_prof = num_yr_prof;
	}
	
	//Accessors
	public String getTeacherId() {
		return id;
	}
	
	public int getTeacherSalary() {
		return salary;
	}
	
	public int getTeacherNumberOfYears() {
		return num_yr_prof;
	}
	
	
	//Mutators
	public void setTeacherId(String id) {
		this.id = id;
	}
	
	public void setStudentGpa(int salary) {
		this.salary = salary;
	}
	
	public void setStudentGrade(int num_yr_prof) {
		this.num_yr_prof = num_yr_prof;
	}
	
	//toString Method
	public String toString() {
		String output = "";
		output += super.toString() + "\n";
		output += "TEACHER ID: " + this.getTeacherId() + "\nTEACHER SALARY: " +  this.getTeacherSalary() + "\nNUMBER OF YEARS AS PROFESSOR: " +  this.getTeacherNumberOfYears() +"\n";
			return output;
		}
}


//This is a driver class that contains the main method.

public class Lab4 {

	public static void main(String[] args) {

		Student s1 = new Student("Ram Singh",55,"668-24-121",true,"12345",4.0,"A");	
		Teacher t1 = new Teacher("Jessi Dsilva",34,"888-44-121",true,"12",50000,5);
		System.out.println(s1.toString());
		System.out.println(t1.toString());
		
		

	}

}