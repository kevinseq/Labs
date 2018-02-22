/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 4 (Part-2) 
  Professor Name: Dr.Wenjia Li
  Student Name: Kevin Sequeira
  Date: 02/19/2018
****************/


public class Person{

	//Instance Variables
	private String name;
	private int age;
	private String ssn;
	private boolean alive;

	//A no-arg constructor.
	public Person(){

	}

	//A constructor with arguments.
	public Person(String name, int age, String ssn, boolean alive){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}

	//Accessors
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getSSN(){
		return ssn;
	}

	public boolean getAlive(){
		return alive;
	}

	//Mutators
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setSSN(String ssn){
		this.ssn = ssn;
	}

	public void setAlive(boolean alive){
		this.alive = alive;
	}


	//toString Method
	public String toString(){
		String output = "\nPerson Info: \n";
		output += "\tName: " + getName() + "\n";
		output += "\tAge: " + getAge() + "\n";
		output += "\tSSN: " + getSSN() + "\n";
		output += "\tAlive: " + getAlive() + "\n";
		return output;
	}
}

//Student class Inherits from Person class.
public class Student extends Person{

	//Instance variables
	private String stu_id;
	private double gpa;
	private String grade;

	//A no-arg constructor.
	public Student(){

	}

	//A constructor with arguments.
	public Student(String name, int age, String ssn, boolean alive, String stu_id, double gpa, String grade){
		super(name,age,ssn,alive);
		this.stu_id = stu_id;
		this.gpa = gpa;
		this.grade = grade;
	}

	//A Copy Constructor for composition.
	public Student(Student other){
		super(other.getName(),other.getAge(),other.getSSN(),other.getAlive());
		this.stu_id = other.stu_id;
		this.gpa = other.gpa;
		this.grade = other.grade;
	}

	//Accessors
	public String getStudentId(){
		return stu_id;
	}

	public double getGPA(){
		return gpa;
	}

	public String getGrade(){
		return grade;
	}

	//Mutators
	public void setStudentId(String stu_id){
		this.stu_id = stu_id;
	}

	public void setGPA(double gpa){
		this.gpa = gpa;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}


	//toString Method
	public String toString(){
		String output = "\n" + super.toString() + "\n";
		output += "\tStudent Info: \n";
		output += "\t\tStudent ID: " + getStudentId() + "\n";
		output += "\t\tGPA: " + getGPA() + "\n";
		output += "\t\tGrade: " + getGrade() + "\n";
		return output;
	}
}

//Teacher Class Inherits from Person Class.
public class Teacher extends Person{

	//Instance variables
	private String id;
	private int salary;
	private int num_yr_prof;

	//A no-arg constructor.
	public Teacher(){

	}

	//A constructor with arguments.
	public Teacher(String name, int age, String ssn, boolean alive, String id, int salary, int num_yr_prof){
		super(name,age,ssn,alive);
		this.id = id;
		this.salary = salary;
		this.num_yr_prof = num_yr_prof;
	}

	//A Copy Constructor for composition.
	public Teacher(Teacher other){
		super(other.getName(),other.getAge(),other.getSSN(),other.getAlive());
		this.id = other.id;
		this.salary = other.salary;
		this.num_yr_prof = other.num_yr_prof;
	}

	//Accessors
	public String getTeacherId(){
		return id;
	}

	public int getSalary(){
		return salary;
	}

	public int getNumberOfYearsProfessor(){
		return num_yr_prof;
	}

	//Mutators
	public void setTeacherId(String id){
		this.id = id;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}

	public void setNumberOfYearsProfessor(int num_yr_prof){
		this.num_yr_prof = num_yr_prof;
	}


	//toString Method
	public String toString(){
		String output = "\n" + super.toString() + "\n";
		output += "\tTeacher Info: \n";
		output += "\t\tTeacher ID: " + getTeacherId() + "\n";
		output += "\t\tSalary: " + getSalary() + "\n";
		output += "\t\tNumber of Years Professor: " + getNumberOfYearsProfessor() + "\n";
		return output;
	}
}


//The department class uses composition to create student and teacher array.
public class Department{

	//Instance Variables.
	private String deptName;
	private int numMajors;
	private Teacher[] listTeachers;
	private Student[] listStudents;

	//A no-arg constructor.
	public Department(){

	}

	//A constructor with arguments.
	public Department(String deptName, int numMajors, Teacher[] listTeachers, Student[] listStudents){
		this.deptName = deptName;
		this.numMajors = numMajors;

		this.listTeachers = new Teacher[listTeachers.length];
		for(int i = 0; i < listTeachers.length; i++) {
			this.listTeachers[i] = new Teacher(listTeachers[i]);
		}

		this.listStudents = new Student[listStudents.length];
		for(int i = 0; i < listStudents.length; i++) {
			this.listStudents[i] = new Student(listStudents[i]);
		}
	}

	//Accessors.
	public String getDepartmentName(){
		return deptName;
	}

	public int getNumberOfMajors(){
		return numMajors;
	}

	public Teacher[] getListOfTeachers(){
		Teacher[] copy = new Teacher[this.listTeachers.length];
		for(int k = 0; k < copy.length; k++) {
			copy[k] = new Teacher(this.listTeachers[k]);
		}
		return copy;
	}

	public Student[] getListOfStudents(){
		Student[] copy = new Student[this.listStudents.length];
		for(int k = 0; k < copy.length; k++) {
			copy[k] = new Student(this.listStudents[k]);
		}
		return copy;
	}

	//Mutators.
	public void setDepartmentName(String deptName){
		this.deptName = deptName;
	}

	public void setNumberOfMajors(int numMajors){
		this.numMajors = numMajors;
	}

	public void setListOfTeachers(Teacher[] lt){
		this.listTeachers = new Teacher[lt.length];
		for(int j=0; j<lt.length; j++) {
			this.listTeachers[j] = new Teacher(lt[j]);
		}
	}

	public void setListOfStudents(Student[] ls){
		this.listStudents = new Student[ls.length];
		for(int j=0; j<ls.length; j++) {
			this.listStudents[j] = new Student(ls[j]);
		}
	}


	//toString Method.
	public String toString() {
		String output = "\nDepartment Info: \n";
		output += "\tDepartment Name: " + getDepartmentName() + "\n";
		output += "\tNumber of Majors: " + getNumberOfMajors() + "\n";
		for(int l=0; l<this.listTeachers.length; l++) {
			output += "\nTeacher# " + l + ": \n" + this.listTeachers[l].toString();
		}
		for(int m=0; m<this.listStudents.length; m++) {
			output += "\nStudent# " + m + ": \n" + this.listStudents[m].toString();
		}
		return output;
	}

}

//The driver class contains the main method.
public class Driver{
	public static void main(String[] args) {

		//Teachers and students in the Science Depertament
		Teacher[] slt = new Teacher[3];
		slt[0] = new Teacher("Sally",43,"56-33-554",true,"44",500000,30);
		slt[1] = new Teacher("Kumar",55,"77-36-775",true,"45",550000,20);
		slt[2] = new Teacher("Mira",66,"13-57-545",true,"47",660000,10);
		

		Student[] sls = new Student[5];
		sls[0] = new Student("Max",22,"12-32-234",true,"123421",4.0,"A");
		sls[1] = new Student("Timmy",23,"435-346-265",true,"547745",3.0,"B");
		sls[2] = new Student("Jack",19,"45-426-222",true,"124567",4.0,"A");
		sls[3] = new Student("Monica",20,"65-556-665",true,"868745",3.0,"B");
		sls[4] = new Student("Penny",22,"77-226-885",true,"090242",4.0,"A");
		
		
		//Teachers and students in the Biology department.
		Teacher[] blt = new Teacher[3];
		blt[0] = new Teacher("Phebie",43,"56-22-554",true,"44",500000,10);
		blt[1] = new Teacher("Aniston",40,"77-77-775",true,"45",450000,10);
		blt[2] = new Teacher("Suzanne",54,"13-23-545",true,"47",400000,10);
		

		Student[] bls = new Student[5];
		bls[0] = new Student("Sammmy",22,"62-32-234",true,"128821",4.0,"A");
		bls[1] = new Student("Jackie",23,"135-346-265",true,"774745",3.0,"B");
		bls[2] = new Student("Omar",19,"25-426-222",true,"124667",4.0,"A");
		bls[3] = new Student("Tina",20,"35-556-665",true,"844745",3.0,"B");
		bls[4] = new Student("Kumar",22,"47-226-885",true,"330242",4.0,"A");

		Department Science = new Department("Science",10,slt,sls);
		Department Biology = new Department("Biology",2,blt,bls);
		

		System.out.print(Science.toString());
		System.out.print(Biology.toString());
	
	}
}