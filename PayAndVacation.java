public class Person{
	
	//Instance Variables.
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
	public String getPname(){
		return this.name;
	}

	public int getPage(){
		return this.age;
	}

	public String getPssn(){
		return this.ssn;
	}

	public boolean getPalive(){
		return this.alive;
	}

	public void getPay(){
		System.out.println("A person usually gets paid monthly");
	}

	public void getVacation(){
		System.out.println("A person usually gets the weekends of");
	}

	//Mutators
	public void setPname(String name){
		this.name = name;
	}

	public void setPage(int age){
		this.age = age;
	}

	public void setPssn(String ssn){
		this.ssn = ssn;
	}

	public void setPalive(boolean alive){
		this.alive = alive;
	}

	//toString Method
	public String toString(){
		String output = "\nPerson Info: \n";
		output += "\tName: " + this.getPname() + "\n";
		output += "\tAge: " + this.getPage() + "\n";
		output += "\tSSN: " + this.getPssn() + "\n";
		output += "\tAlive: " + this.getPalive() + "\n";
		return output;
	}
	

}

public class Professor extends Person{
	
	//Instance Variables.
	private String fac_id;
	private String research_area;
	private int salary;
	private int num_vacation;

	//A no-arg constructor.
	public Professor(){

	}

	//A constructor with arguments.
	public Professor(String name, int age, String ssn, boolean alive, String fac_id, String research_area, int salary, int num_vacation){
		super(name, age, ssn, alive);
		this.fac_id = fac_id;
		this.research_area = research_area;
		this.salary = salary;
		this.num_vacation = num_vacation;
	}

	//Accessors
	public String getPfacid(){
		return this.fac_id;
	}

	public String getPresearcharea(){
		return this.research_area;
	}

	public int getPsalary(){
		return this.salary;
	}

	public int getPnumvacation(){
		return this.num_vacation;
	}

	public void getPay(){
		System.out.println("A professor usually gets paid monthly");
	}

	public void getVacation(){
		System.out.println("A professor usually gets 3 months of vacation");
	}

	//Mutators
	public void setPfacid(String fac_id){
		this.fac_id = fac_id;
	}

	public void setPresearcharea(String research_area){
		this.research_area = research_area;
	}

	public void setPsalary(int salary){
		this.salary = salary;
	}

	public void setNumvacation(int num_vacation){
		this.num_vacation = num_vacation;
	}

	//toString Method
	public String toString(){
		String output = "\n" + super.toString() + "\n";
		output += "\nProfessor Info: \n";
		output += "\tProfessor Id: " + this.getPfacid() + "\n";
		output += "\tResearch Area: " + this.getPresearcharea() + "\n";
		output += "\tSalary: " + this.getPsalary() + "\n";
		output += "\tNumber of Vacation: " + this.getPnumvacation() + "\n";
		return output;
	}
}

public class Secretary extends Person{
	
	//Instance Variables.
	private String fac_id;
	private int num_service;
	private int salary;
	private int num_vacation;

	//A no-arg constructor.
	public Secretary(){

	}

	//A constructor with arguments.
	public Secretary(String name, int age, String ssn, boolean alive, String fac_id, int num_service, int salary, int num_vacation){
		super(name, age, ssn, alive);
		this.fac_id = fac_id;
		this.num_service = num_service;
		this.salary = salary;
		this.num_vacation = num_vacation;
	}

	//Accessors
	public String getSfacid(){
		return this.fac_id;
	}

	public int getSnumservice(){
		return this.num_service;
	}

	public int getSsalary(){
		return this.salary;
	}

	public int getSnumvacation(){
		return this.num_vacation;
	}

	public void getPay(){
		System.out.println("A secretary usually gets paid bi-weekly");
	}

	public void getVacation(){
		System.out.println("A secretary usually gets one month of vacation");
	}

	//Mutators
	public void setSfacid(String fac_id){
		this.fac_id = fac_id;
	}

	public void setSnumservice(int num_service){
		this.num_service = num_service;
	}

	public void setSsalary(int salary){
		this.salary = salary;
	}

	public void setSnumvacation(int num_vacation){
		this.num_vacation = num_vacation;
	}

	//toString Method
	public String toString(){
		String output = "\n" + super.toString() + "\n";
		output += "\nSecretary Info: \n";
		output += "\tSecretary Id: " + this.getSfacid() + "\n";
		output += "\tYears of Service: " + this.getSnumservice() + "\n";
		output += "\tSalary: " + this.getSsalary() + "\n";
		output += "\tNumber of Vacation: " + this.getSnumvacation() + "\n";
		return output;
	}


}

public class StudentWorker extends Person{
	
	//Instance Variables.
	private String ta_id;
	private String year;
	private int salary;
	private int num_vacation;
	private String course_taught;

	//A no-arg constructor.
	public StudentWorker(){

	}

	//A constructor with arguments.
	public StudentWorker(String name, int age, String ssn, boolean alive, String ta_id, String year, int salary, int num_vacation, String course_taught){
		super(name, age, ssn, alive);
		this.ta_id = ta_id;
		this.year = year;
		this.salary = salary;
		this.num_vacation = num_vacation;
		this.course_taught = course_taught;
	}



	//Accessors
	public String getTaid(){
		return this.ta_id;
	}

	public String getYear(){
		return this.year;
	}

	public int getSalary(){
		return this.salary;
	}

	public int getNumvacation(){
		return this.num_vacation;
	}

	public String getCourseTaught(){
		return this.course_taught;
	}

	public void getPay(){
		System.out.println("A student usually gets paid hourly");
	}

	public void getVacation(){
		System.out.println("A student usually gets the weekned of");
	}

	//Mutators
	public void setTaid(String ta_id){
		this.ta_id = ta_id;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}

	public void setNumvacation(int num_vacation){
		this.num_vacation =  num_vacation;
	}

	public void setCoursetaught(String course_taught){
		this.course_taught = course_taught;
	}

	//toString Method
	public String toString(){
		String output = "\n" + super.toString() + "\n";
		output += "\nStudent Info: \n";
		output += "\tStudent Id: " + this.getTaid() + "\n";
		output += "\tYear: " + this.getYear() + "\n";
		output += "\tSalary: " + this.getSalary() + "\n";
		output += "\tNumber of Vacation: " + this.getNumvacation() + "\n";
		output += "\tCourses Taught: " + this.getCourseTaught() + "\n";
		return output;
	}

}

public class PayAndVacation{
	
	//Method to identify a persons Pay.
	public void identifyPay(Person p){
		p.getPay();
	}

	//Method to identify a persons vacation.
	public void identifyVacation(Person p){
		p.getVacation();
	}
	
	public static void main(String[] args){
		Professor Tommy = new Professor();
		Secretary Julia = new Secretary();
		StudentWorker Brady = new StudentWorker();
		PayAndVacation pv = new PayAndVacation();
	
		System.out.println("\nPay Structure:");
		System.out.print("\tTommy's pay type: ");
		pv.identifyPay(Tommy);
		System.out.print("\tJulia's pay type: ");
		pv.identifyPay(Julia);
		System.out.print("\tBrady's pay type: ");
		pv.identifyPay(Brady);
		
		System.out.println("\nVacation Structure:");
		System.out.print("\tNumber of vacation days for Tommy: ");
		pv.identifyVacation(Tommy);
		System.out.print("\tNumber of vacation days for Julia: ");
		pv.identifyVacation(Julia);
		System.out.print("\tNumber of vacation days for Brady: ");
		pv.identifyVacation(Brady);
		
		}
	
	
}