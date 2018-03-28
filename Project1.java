/****************
Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: HW-2 
Professor Name: 
Student Name: 
Date: 03/11/2018
****************/

package allAccess;

//This class defines the Person Class and it is a Super class.

public class Person {

	//Instance Variables 

	private String name;
	private int age;
	private String ssn;
	private boolean alive;

	//A no-argument constructor

	public Person(){

	}

	//A constructor with the name, age, ssn and alive arguments

	public Person(String name, int age, String ssn, boolean alive){
		
		//This if statement checks for invariance

		if(!isValidState(name, age, ssn)){
			System.err.println("Invalid state for the Person construction");
			System.exit(0);
		}

		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}

	//This method checks if the state of the construction is valid

	public boolean isValidState(String name, int age, String ssn){
		return (name != null) && (!name.equals("")) && (age != 0) && (ssn != null) && (!ssn.equals(""));
	}

	/* Accessors */

	//This accessor gets the persons name

	public String getPersonName(){
		return this.name;
	}

	//This accessor gets the persons age

	public int getPersonAge(){
		return this.age;
	}

	//This accessor gets the persons ssn

	public String getPersonSsn(){
		return this.ssn;
	}

	//This accessor tells if the person is alive or not

	public boolean getPersonAlive(){
		return this.alive;
	}

	/* Mutators */

	//This mutator sets the persons name

	public void setPersonName(String alt_name){
		this.name = alt_name;
	}

	//This mutator sets the persons age

	public void setPersonAge(int alt_age){
		this.age = alt_age;
	}

	//This mutator sets the persons ssn

	public void setPersonSsn(String alt_ssn){
		this.ssn = alt_ssn;
	}

	//This mutator sets if the person is alive or not

	public void setPersonAlive(boolean alt_alive){
		this.alive = alt_alive;
	}

	//This is the toString method

	public String toString(){
		String output = "\n Person's Information \n";
		output += "\t Person's Name: " + this.getPersonName() + "\n";
		output += "\t Person's Age: " + this.getPersonAge() + "\n";
		output += "\t Person's SSN: " + this.getPersonSsn() + "\n";
		output += "\t Person Alive: " + this.getPersonAlive() + "\n";
		return output;
	}


}

package allAccess;

//This class defines the Kevin_Teacher Class and it is a Sub class and inherits from the Person class.

public class Kevin_Teacher extends Person{

	//Instance Variables 

	private String id;
	private int monthly_salary;
	private int num_yr_prof;

	//A no-argument constructor
	//1st constructor

	public Kevin_Teacher(){

	}

	//A constructor with the id, monthly_salary, num_yr_prof arguments
	//2nd constructor

	public Kevin_Teacher(String id, int monthly_salary, int num_yr_prof){

		//This if statement checks for invariance

		if(!isValidState(id,monthly_salary,num_yr_prof)){
			System.err.println("Invalid state for the Teacher construction");
			System.exit(0);
		}

		this.id = id;
		this.monthly_salary = monthly_salary;
		this.num_yr_prof = num_yr_prof;
	}

	//A constructor with the name, age, ssn, alive, id, monthly_salary, num_yr_prof arguments
	//3rd constructor

	public Kevin_Teacher(String name, int age, String ssn, boolean alive, String id, int monthly_salary, int num_yr_prof){
		super(name,age,ssn,alive);

		//This if statement checks for invariance

		if(!isValidState(id,monthly_salary,num_yr_prof)){
			System.err.println("Invalid state for the Teacher construction");
			System.exit(0);
		}
		

		this.id = id;
		this.monthly_salary = monthly_salary;
		this.num_yr_prof = num_yr_prof;
	}
	
	//A copy constructor 
	//4th constructor 
	public Kevin_Teacher(Kevin_Teacher other){
		super(other.getPersonName(),other.getPersonAge(),other.getPersonSsn(),other.getPersonAlive());
			
		this.id = other.id;
		this.monthly_salary = other.monthly_salary;
		this.num_yr_prof = other.num_yr_prof;

			//This if statement checks for invariance

			if(!isValidState(id,monthly_salary,num_yr_prof)){
				System.err.println("Invalid state for the Student construction");
				System.exit(0);
			}
		}

	//This method checks if the state of the Teacher construction is valid

	public boolean isValidState(String id, int monthly_salary, int num_yr_prof){
		return (id != null) && (!id.equals("")) && (monthly_salary != 0) && (num_yr_prof != 0);
	}


	/* Accessors */

	//This accessor gets the Teacher's id

	public String getTeacherId(){
		return this.id;
	}

	//This accessor gets the Teacher's monthly salary

	public int getTeacherMonthlySalary(){
		return this.monthly_salary;
	}

	//This accessor gets the Teacher's number of years as a professor

	public int getTeacherNumberOfYears(){
		return this.num_yr_prof;
	}

	/* Mutators */

	//This mutator sets the Teacher's id

	public void setTeacherId(String alt_id){
		this.id = alt_id;
	}

	//This mutator sets the Teacher's monthly salary

	public void setTeacherMonthlySalary(int alt_monthly_salary){
		this.monthly_salary = alt_monthly_salary;
	}

	//This mutator sets the Teacher's number of years as a professor

	public void setTeacherNumberOfYears(int alt_num_yr_prof){
		this.num_yr_prof = alt_num_yr_prof;
	}
	
	
	//This is the toString method that displays both the person and Teacher information

	public String toString(){
		String output = super.toString() + "\n";
		output += "\n Teacher's Information \n";
		output += "\t" + "Teacher's ID: " + this.getTeacherId() + "\n";
		output += "\t" + "Teacher's Monthly Salary: " + this.getTeacherMonthlySalary() + "\n";
		output += "\t" + "Teacher's number of years as professor: " + this.getTeacherNumberOfYears() + "\n";
		return output;
	}
}


package allAccess;

//This class defines the Kevin_Professor Class and it is a Sub class and inherits from the Kevin_Teacher class.

public class Kevin_Professor extends Kevin_Teacher{

	//Instance Variables 

	private String specialty;
	private String research_area;
	private String rank;
	private boolean tenured;

	//A no-argument constructor
	//1st constructor

	public Kevin_Professor(){

	}

	//A constructor with the specialty, research_area, rank and tenured arguments
	//2nd constructor

	public Kevin_Professor(String specialty, String research_area, String rank, boolean tenured){

		//This if statement checks for invariance

		if(!isValidState(specialty,research_area,rank)){
			System.err.println("Invalid state for the Professor construction");
			System.exit(0);
		}

		this.specialty = specialty;
		this.research_area = research_area;
		this.rank = rank;
		this.tenured = tenured;
	}

	//A constructor with the id, monthly_salary, num_yr_prof, specialty, research_area, rank and tenured arguments
	//3rd constructor

	public Kevin_Professor(String id, int monthly_salary, int num_yr_prof, String specialty, String research_area, String rank, boolean tenured){
		super(id,monthly_salary,num_yr_prof);

		//This if statement checks for invariance

		if(!isValidState(specialty,research_area,rank)){
			System.err.println("Invalid state for the Professor construction");
			System.exit(0);
		}

		this.specialty = specialty;
		this.research_area = research_area;
		this.rank = rank;
		this.tenured = tenured;
	}

	//A constructor with the name, age, ssn, alive, id, monthly_salary, num_yr_prof, specialty, research_area, rank and tenured arguments
	//4th constructor

	public Kevin_Professor(String name, int age, String ssn, boolean alive, String id, int monthly_salary, int num_yr_prof, String specialty, String research_area, String rank, boolean tenured){
		super(name,age,ssn,alive,id,monthly_salary,num_yr_prof);

		//This if statement checks for invariance

		if(!isValidState(specialty,research_area,rank)){
			System.err.println("Invalid state for the Professor construction");
			System.exit(0);
		}

		this.specialty = specialty;
		this.research_area = research_area;
		this.rank = rank;
		this.tenured = tenured;
	}

	//A Copy Constructor
	//5th constructor

	public Kevin_Professor(Kevin_Professor other) {
		super(other.getPersonName(),other.getPersonAge(),other.getPersonSsn(),other.getPersonAlive(),other.getTeacherId(),other.getTeacherMonthlySalary(),other.getTeacherNumberOfYears());
		
		this.specialty = other.specialty;
		this.research_area = other.research_area;
		this.rank = other.rank;
		this.tenured = other.tenured;
	}

	//This method checks if the state of the Professor construction is valid

	public boolean isValidState(String specialty, String research_area, String rank){
		return (specialty != null) && (!specialty.equals("")) && (research_area != null) && (!research_area.equals("")) && (rank != null) && (!rank.equals(""));
	}

	/* Accessors */

	//This accessor gets the Professors's specialty

	public String getProfessorspecialty(){
		return this.specialty;
	}

	//This accessor gets the Professor's research area

	public String getProfessorResearchArea(){
		return this.research_area;
	}

	//This accessor gets the Professors's rank

	public String getProfessorRank(){
		return this.rank;
	}

	//This accessor tells if the Professor has tenure or not

	public boolean getProfessorTenure(){
		return this.tenured;
	}

	/* Mutators */

	//This mutator sets the Professors's specialty

	public void setProfessorspecialty(String alt_specialty){
		this.specialty = alt_specialty;
	}

	//This mutator sets the Professor's research area

	public void setProfessorResearchArea(String alt_research_area){
		this.research_area = alt_research_area;
	}

	//This mutator sets the Professors's rank

	public void setProfessorRank(String alt_rank){
		this.rank = alt_rank;
	}

	//This mutator sets if the Professor received tenure or not

	public void setProfessorRank(boolean alt_tenured){
		this.tenured = alt_tenured;
	}

	public String toString(){
		String output = super.toString() + "\n";
		output += "\n Professors's Information \n";
		output += "\t" + "Professor's specialty: " + this.getProfessorspecialty() + "\n";
		output += "\t" + "Professor's Research Area: " + this.getProfessorResearchArea() + "\n";
		output += "\t" + "Professor's Rank: " + this.getProfessorRank() + "\n";
		output += "\t" + "Professor has Tenure: " + this.getProfessorTenure() + "\n";
		return output;
	}
}


package allAccess;

//This class defines the Kevin_Department class and it has a "has a" (composition) relationship with the Kevin_Professor class

public class Kevin_Department{

	//Instance Variables

	private Kevin_Professor chair;
	private Kevin_Professor[] faculty;
	private Khushbu_Course[] courses;

	//A no-argument construction
	//1st constructor

	public Kevin_Department(){

	}

	//A constructor with the chair, faculty and courses arguments
	//2nd constructor

	public Kevin_Department(Kevin_Professor chair, Kevin_Professor[] faculty, Khushbu_Course[] courses){
		
		this.chair = chair;

		this.faculty = new Kevin_Professor[faculty.length];
			for(int i = 0; i < faculty.length; i++){
				this.faculty[i] = new Kevin_Professor(faculty[i]);
			}
		

		this.courses = new Khushbu_Course[courses.length];
			for(int j = 0; j < courses.length; j++){
				this.courses[j] = new Khushbu_Course(courses[j]);
			}
		
	}

	/* Accessors */

	//This accessor gets the chair

	public Kevin_Professor getChair(){
		return this.chair;
	}

	//This accessor gets the faculty 

	public Kevin_Professor[] getFaculty(){
		Kevin_Professor[] faculty = new Kevin_Professor[this.faculty.length];
		for(int k = 0; k < faculty.length; k++){
			faculty[k] = new Kevin_Professor(this.faculty[k]);
		}
		return faculty;
	}

	//This accessor gets the courses

	public Khushbu_Course[] getCourses(){
		Khushbu_Course[] courses = new Khushbu_Course[this.courses.length];
		for(int m = 0; m < courses.length; m++){
			courses[m] = new Khushbu_Course(this.courses[m]);
		}
		return courses;
	}

	/* Mutators */

	//This mutator sets the chair

	protected void setChair(Kevin_Professor chair){
		this.chair = chair;
	}

	//This mutator sets the faculty 

	protected void setFaculty(Kevin_Professor[] faculty){
		this.faculty = new Kevin_Professor[faculty.length];
		for(int n = 0; n < faculty.length; n++){
			this.faculty[n] = new Kevin_Professor(faculty[n]);
		}
	}

	//This mutator sets the courses

	protected void setCourses(Khushbu_Course[] courses){
		this.courses = new Khushbu_Course[courses.length];
		for(int p = 0; p < courses.length; p++){
			this.courses[p] = new Khushbu_Course(courses[p]);
		}
	}

	//This is the toString method that displays the department information

	public String toStringDepartment(){
		String output = "\n Department's Information \n";
		output += "\t Department Chair: " + this.getChair() + "\n";
		for(int q = 0; q < this.faculty.length; q++){
			output += "\t Faculty Number: " + q + "\n" + this.faculty[q].toString();
		}
		for(int r = 0; r < this.courses.length; r++){
			output += "\t Course Number: " + r + "\n" + this.courses[r].toString();
		}
		return output;
	}

}

package limitedAccess;

import allAccess.Person;

//This class defines the Khushbu_Student Class and it is a Sub class and inherits from the Person class.

public class Khushbu_Student extends Person{

	//Instance Variables 

	private String student_id;
	private double gpa;
	
	//A no-argument constructor
	//1st constructor

	public Khushbu_Student(){

	}

	//A constructor with the student_id and gpa arguments
	//2nd constructor

	 public Khushbu_Student(String student_id, double gpa){

		this.student_id = student_id;
		this.gpa = gpa;
		
		//This if statement checks for invariance
		
		if(!isValidState(student_id,gpa)){
			System.err.println("Invalid state for the Student construction");
			System.exit(0);
		}

		this.student_id = student_id;
		this.gpa = gpa;
	}

	//A constructor with the name, age, ssn, alive, Student_id and gpa arguments
	//3rd constructor

	public Khushbu_Student(String name, int age, String ssn, boolean alive, String student_id, double gpa){
		super(name,age,ssn,alive);
		
		this.student_id = student_id;
		this.gpa = gpa;

		//This if statement checks for invariance

		if(!isValidState(student_id,gpa)){
			System.err.println("Invalid state for the Student construction");
			System.exit(0);
		}
		
		
	}
	
	//A copy constructor 
	//4th constructor 
	public Khushbu_Student(Khushbu_Student other){
		super(other.getPersonName(),other.getPersonAge(),other.getPersonSsn(),other.getPersonAlive());
		
		this.student_id = other.student_id;
		this.gpa = other.gpa;

		//This if statement checks for invariance

		if(!isValidState(student_id,gpa)){
			System.err.println("Invalid state for the Student construction");
			System.exit(0);
		}
	}

	//This method checks if the state of the Student construction is valid

	public boolean isValidState(String student_id, double gpa){
		return (student_id != null) && (!student_id.equals("")) && (gpa != 0) && (gpa <= 4.0);
	}

	/* Accessors */

	//This accessor gets the Student's id

	public String getStudentId(){
		return this.student_id;
	}

	//This accessor gets the Student's gpa

	public double getStudentGpa(){
		return this.gpa;
	}

	/* Mutators */

	//This mutator sets the Student's id

	public void setStudentId(String student_id){
		this.student_id = student_id;
	}

	//This mutator sets the Student's gpa

	public void setStudentGpa(double gpa){
		this.gpa = gpa;
	}

	


//This is the toString method that displays both the person and Student information

	public String toString(){
		String output = super.toString() + "\n";
		output += "\n Student's Information \n";
		output += "\t" + "Student's ID: " + this.getStudentId() + "\n";
		output += "\t" + "Student's GPA: " + this.getStudentGpa() + "\n";
		return output;
	}
}


package allAccess;

import limitedAccess.Khushbu_Student;

//This class defines the Khushbu_College_Student Class and it is a Sub class and inherits from the Khushbu_Student class.

public class Khushbu_College_Student extends Khushbu_Student{

	//Instance Variables 

	private String major;
	private String grade;
	

	//A no-argument constructor
	//1st constructor

	public Khushbu_College_Student(){
		
	}

	//A constructor with the major and grade arguments
	//2nd constructor

	public Khushbu_College_Student(String major, String grade){
		
		this.major = major;
		this.grade = grade;

		//This if statement checks for invariance
		
		if(!isValidState(major,grade)){
			System.err.println("Invalid state for the College Student construction");
			System.exit(0);
		}

		
	}

	//A constructor with the student_id, gpa, major, grade arguments
	//3rd constructor

	public Khushbu_College_Student(String student_id, double gpa, String major, String grade){
		super(student_id,gpa);
		
		this.major = major;
		this.grade = grade;

		//This if statement checks for invariance
		
		if(!isValidState(major,grade)){
			System.err.println("Invalid state for the College Student construction");
			System.exit(0);
		}

	}

	//A constructor with the name, age, ssn, alive, student_id, gpa, major and grade arguments
	//4th constructor

	public Khushbu_College_Student(String name, int age, String ssn, boolean alive, String student_id, double gpa, String major, String grade){
		super(name,age,ssn,alive,student_id,gpa);

		this.major = major;
		this.grade = grade;
		
		//This if statement checks for invariance
		
		if(!isValidState(major,grade)){
			System.err.println("Invalid state for the College Student construction");
			System.exit(0);
		}

		
	}

	//A Copy Constructor
	//5th constructor

	public Khushbu_College_Student(Khushbu_College_Student other) {
		super(other.getPersonName(),other.getPersonAge(),other.getPersonSsn(),other.getPersonAlive(),other.getStudentId(),other.getStudentGpa());
	
		this.major = other.major;
		this.grade = other.grade;
	}

	//This method checks if the state of the second construction is valid

	public boolean isValidState(String major, String grade){
		return (major != null) && (!major.equals("")) && (grade != null) && (!grade.equals(""));
	}

	/* Accessors */

	//This accessor gets the student's major

	public String getStudentMajor(){
		return this.major;
	}

	//This accessor gets the student's grade

	public String getStudentGrade(){
		return this.grade;
	}


	/* Mutators */

	//This mutator sets the students major

	public void setStudentMajor(String alt_major){
		this.major = alt_major;
	}

	//This mutator sets the student's grade

	public void setStudentGrade(String alt_grade){
		this.grade = alt_grade;
	}


	//This is the toString method that displays the person's, student's and college student's information

	public String toString(){
		String output = super.toString() + "\n";
		output += "\n College Student's Information \n";
		output += "\t" + "College Student's Major: " + this.getStudentMajor() + "\n";
		output += "\t" + "College Student's Grade: " + this.getStudentGrade() + "\n";
		return output;
	}
}


package allAccess;

//This class defines the Khushbu_Course class and it has a "has a" (composition) relationship with the Khushbu_College_Student class

public class Khushbu_Course{

	//Instance Variables

	private Kevin_Professor instructor;
	private Khushbu_College_Student[] students;
	private String course_name;

	//A no-argument construction
	//1st constructor

	public Khushbu_Course(){

	}

	//A constructor with the instructor, students and course_name arguments
	//2nd constructor

	public Khushbu_Course(Kevin_Professor instructor, Khushbu_College_Student[] s, String course_name){
		
		this.instructor = instructor;

		this.students = new Khushbu_College_Student[s.length];
			for(int i = 0; i < students.length; i++){
				this.students[i] = new Khushbu_College_Student(s[i]);
			}

		this.course_name = course_name;
	}
	
	//A Copy Constructor
	//3rd constructor

		public Khushbu_Course(Khushbu_Course other) {
		
			this.instructor = other.instructor;
			this.students = other.students;
			this.course_name = other.course_name;
		}

	/* Accessors */

	//This accessor gets the instructor

	public Kevin_Professor getInstructor(){
		return this.instructor;
	}

	//This accessor gets the students 

	public Khushbu_College_Student[] getStudents(){
		Khushbu_College_Student[] copy = new Khushbu_College_Student[this.students.length];
		for(int k = 0; k < copy.length; k++){
			copy[k] = new Khushbu_College_Student(this.students[k]);
		}
		return copy;
	}
	
	//This accessor gets the course_name

	public String getCourseName(){
		return this.course_name;
	}

	/* Mutators */

	//This mutator sets the Instructor

	protected void setInstructor(Kevin_Professor instructor){
		this.instructor = instructor;
	}

	//This mutator sets the Students

	protected void setStudents(Khushbu_College_Student[] st1){
		this.students = new Khushbu_College_Student[st1.length];
		for(int n = 0; n < st1.length; n++){
			this.students[n] = new Khushbu_College_Student(st1[n]);
		}
	}
	

	//This mutator sets the course_name

	protected void setCourseName(String course_name){
		this.course_name = course_name;
	}

	//This is the toString method that displays the Course information

	public String toString(){
		String output = "\n Course Information \n";
		output += "\n Instructor: " + this.getInstructor() + "\n";
		for(int p = 0; p < this.students.length; p++) {
			output += "\nStudent Number:" + p + "\n" + this.students[p].toString();
		}
		//output += " Students : " + this.getStudents() + "\n";
		output += "\n";
		output += " Course Name: " + this.getCourseName() + "\n";
		return output;
	}

}

package allAccess;

public class Driver2 {

	public static void main(String[] args) {
		
		//These are the Chairs of the departments
		
		Kevin_Professor ph1 = new Kevin_Professor("Jack Singh",45,"123-12-222",true,"123-123",60000,4,"Computer Science","Machine Learning","1st",true);
		Kevin_Professor ph2 = new Kevin_Professor("Tim Drake",45,"123-12-222",true,"123-123",70000,10,"Art Science","Human Art","2nd",true);
			
		//These are the faculty members for the Science Department
		
		Kevin_Professor[] facultyScience = new Kevin_Professor[3];
		facultyScience[0] = new Kevin_Professor("Jack",45,"123-12-222",true,"123-123",60000,4,"Computer Science","Machine Learning","1st",true);
		facultyScience[1] = new Kevin_Professor("Timmy",75,"123-12-292",true,"183-123",60000,4,"Computer Science","Machine Learning","3st",true);
		facultyScience[2] = new Kevin_Professor("Zach",35,"157-124-272",true,"113-123",60000,4,"Computer Science","Machine Learning","2st",true);
		
		//These are the faculty members for the Arts Department
		
		Kevin_Professor[] facultyArts = new Kevin_Professor[3];
		facultyArts[0] = new Kevin_Professor("Jack",45,"123-12-272",true,"123-123",60000,4,"Painter History","Pin Box","1st",true);
		facultyArts[1] = new Kevin_Professor("Peter",60,"123-12-242",true,"173-123",60000,4,"Arts","Lighting","2st",true);
		facultyArts[2] = new Kevin_Professor("Logan",55,"123-16-262",true,"123-123",60000,4,"Design","Photo Lighting","3st",true);
		
		//These are the students of the science department 
		
		Khushbu_College_Student[] studentscs = new Khushbu_College_Student[4];
		studentscs[0] = new Khushbu_College_Student("Suzan",20,"123-22-222",true,"50642",4.0,"Computer Science","A");
		studentscs[1] = new Khushbu_College_Student("Mark",22,"174-21-633",true,"77775",3.9,"Computer Engineer","A");
		studentscs[2] = new Khushbu_College_Student("Zia",23,"185-24-456",true,"23442",3.5,"Comupter Science","A-");
		studentscs[3] = new Khushbu_College_Student("Jenny",19,"143-62-975",true,"41223",3.0,"CyberSecurity","B");
		
		//These are the students of the art department
		
		Khushbu_College_Student[] studentsa = new Khushbu_College_Student[4];
		studentsa[0] = new Khushbu_College_Student("Tina",20,"123-22-222",true,"50042",4.0,"Painting","A");
		studentsa[1] = new Khushbu_College_Student("Beijun",22,"174-21-633",true,"77745",3.9,"Photography","A");
		studentsa[2] = new Khushbu_College_Student("Tony",23,"185-24-456",true,"23442",3.5,"Lighting","A-");
		studentsa[3] = new Khushbu_College_Student("Zachry",19,"143-62-975",true,"41223",3.0,"Fashion","B");
		
		//These are the two courses 
		
		Khushbu_Course[] courses = new Khushbu_Course[2];
		courses[0] = new Khushbu_Course(ph1,studentscs,"Algorithms");
		courses[1] = new Khushbu_Course(ph2,studentsa,"Art History");
		
		//These are the two departments
		
		Kevin_Department d1 = new Kevin_Department(ph1,facultyScience,courses);
		Kevin_Department d2 = new Kevin_Department(ph2,facultyArts,courses);
		
		System.out.println(d1.toStringDepartment());
		System.out.println(d2.toStringDepartment());
	
	}
}



