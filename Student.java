/****************

  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 2 
  Professor Name: 
  Student Name: 
  Date: 02/01/2018

****************/

/* 
  This program includes the following: 
    - Accessor/Mutator methods
    - toString method
    - this keyword
*/

public class Student {
	
	//The basic features of a student.
	public String name;
	private String student_id;
	private double GPA;
	
	//A no-arg constructor
	public Student() {
	}
	
	//A constructor that creates a student with the specified name,id and gpa.
	public Student(String name, String student_id, double GPA) {
		this.name = name;
		this.student_id = student_id;
		this.GPA = GPA;
		
		//Checks for invariance.
		if(!isValidState(name, student_id)) {
			System.err.println("Invalid state for the student construction");
			//System.exit(0);
		}
	}
	
	//This method checks if the state of the construction is valid.
	private boolean isValidState(String name, String student_id ) {
		return (name != null) && (!name.equals("")) && (student_id != null) && (!student_id.equals(""));
	}
	
	//The Accessor's 
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return student_id;
	}
	
	public double getGPA(){
		return GPA;
	}
	
	//The Mutator's
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setStudentId(String student_id){
		this.student_id = student_id;
	}
	
	public void setName(double GPA){
		this.GPA = GPA;
	}
	
	//The toString method
	public String toString(){
	    String studentInfo = "";
	    studentInfo += "Name: " + name + "\n";
	    studentInfo += "Student ID: " + student_id + "\n";
	    studentInfo += ((GPA <= 4.0) && (GPA >= 0.0)) ? "GPA: " + GPA : "No GPA because it is the first semester" + "\n";
	    return studentInfo;
	  }
  
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Jack Cramer","2343",4.0);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
    
}
