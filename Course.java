/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 3 
  Professor Name: 
  Student Name: 
  Date: 02/06/2018
****************/

/* 
  This Class includes the following: 
    - Accessor/Mutator methods
    - toString method
    - this keyword
*/

public class Student {
	
	//The basic feature of a student.
	public String name;
	private String student_id;
	private double GPA;
	
	//A no-arg constructor
	public Student() {

	}
	
	//A constructor that creates a student with the specified name, id and gpa.
	public Student(String name, String student_id, double GPA) {
		this.name = name;
		this.student_id = student_id;
		this.GPA = GPA;
		
		//Checks for invariance.
		if(!isValidState(name, student_id)) {
			System.err.println("Invalid state for the student construction");
		}
	}
	
	//Copy Constructor
	public Student(Student other) {
		if(other == null) {
			System.out.println("EXIT");
		}
		this.name = other.name;
		this.student_id = other.student_id;
		this.GPA = other.GPA;
	}
	
	//This method checks if the state of the construction is valid.
	private boolean isValidState(String name, String student_id) {
		return (name != null) && (!name.equals("")) && (student_id != null) && (!student_id.equals(""));
	}
	
	//The Accessor's
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return student_id;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	//The Mutators
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentId(String student_id) {
		this.student_id = student_id;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	//toString Method
	public String toString() {
		String output = "";
		output += "NAME: " + getName() + "\nSTUDENT_ID: " + getStudentId() + "\nGPA: " + getGPA() + "\n";
		return output;
	}
	
}

public class Course {
	//Instance Variables 
	public String courseName;
	private String courseNumber;
	public String instructorName;
	private Student[] listStudents;
	
	//A no-arg constructor
	public Course() {
		
	}
	
	//A constructor that creates a course with the course name, course number, instructor name and list of students.
	public Course(String cname, String cnumber, String iname, Student[] ls) {
		this.courseName = cname;
		this.courseNumber = cnumber;
		this.instructorName = iname;
		this.listStudents = new Student[ls.length];
		for(int i=0; i<ls.length; i++) {
			this.listStudents[i] = new Student(ls[i]);
		}
	}
	
	//Accessor
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseNumber() {
		return courseNumber;
	}
	
	public String getInstructorName() {
		return instructorName;
	}
	
	public Student[] getListStudent() {
		Student[] alt_ls = new Student[this.listStudents.length];
		for(int k = 0; k < alt_ls.length; k++) {
			alt_ls[k] = new Student(this.listStudents[k]);
		}
		return alt_ls;
	}
	
	//Mutator
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public void setListStudent(Student[] ls2) {
		this.listStudents = new Student[ls2.length];
		for(int j = 0; j<ls2.length; j++) {
			this.listStudents[j] = new Student(ls2[j]);
		}
	}
	
	//toString Method
	public String toString() {
		String output = "";
		output += "COURSE NAME: " + this.getCourseName() + "\nCOURSE NUMBER: " +  this.getCourseNumber() + "\nINSTRUCTOR NAME: " +  this.getInstructorName()+ "\n";
		for(int l = 0; l<this.listStudents.length; l++) {
			output += "\nStudent " + l + ": \n" + this.listStudents[l].toString();
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		Student[] lss = new Student[3];
		lss[0] = new Student("Maria Fang","508331", 4.0);
		lss[1] = new Student("Lee Kumar","502323", 3.9);
		lss[2] = new Student("George Rao","403434", 3.5);
		
		Student[] lsm = new Student[3];
		lsm[0] = new Student("Tom Collins","508331", 4.0);
		lsm[1] = new Student("Tim Tang","502323", 3.9);
		lsm[2] = new Student("Timmy ca","403434", 3.5);
		
		Course science = new Course("Science","342","Jack MA",lss);
		Course math = new Course("Math","432","Tony Singh",lsm);
		System.out.println(science.toString());
		System.out.print(math.toString());
		
	}

}

