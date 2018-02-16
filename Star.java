/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: HW-1 (Composition)
  Professor Name: Dr.Wenjia Li
  Student Name: Kevin Sequeira
  Date: 02/13/2018
****************/

/* This program has three classes the Star Class, Galaxy Class and HW1 Class which has the main method.
 * It creates an object of galaxy and in that it has 4 objects of Stars.
 */

public class Star {

	//Instance Variable
	private String sname;
	private double sdiameter;
	private double surfaceTemperature;
	private int age;

	//A no-argument constructor.
	public Star() {

	}

	//A constructor with arguments
	public Star(String sname, double sdiameter, double surfaceTemperature, int age) {
		this.sname = sname;
		this.sdiameter = sdiameter;
		this.surfaceTemperature = surfaceTemperature;
		this.age = age;
	}

	//A copy constructor.
	public Star(Star other) {
		if(other == null) {
			System.out.println("EXIT");
		}
		this.sname = other.sname;
		this.sdiameter = other.sdiameter;
		this.surfaceTemperature = other.surfaceTemperature;
		this.age = other.age;

	}

	//Accessors
	public String getName() {
			return sname;
	}

	public double getDiameter() {
		return sdiameter;
	}

	public double getSurfaceTemperature() {
		return surfaceTemperature;
	}

	public int getAge() {
		return age;
	}

    //Mutators
	public void setName(String sname) {
		this.sname = sname;
	}

	public void setDiameter(double sdiameter) {
		this.sdiameter = sdiameter;
	}

	public void setSurfaceTemperature(double surfaceTemperature) {
		this.surfaceTemperature = surfaceTemperature;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Star toString method.
	public String toString() {
			String output ="";
			output += "NAME: " + getName() + "\nDIAMETER: " +  getDiameter() + " million mi" + "\nSURFACE TEMPERATURE: " + getSurfaceTemperature() + " fahrenheit" + "\nAGE: " + getAge() + " years" + "\n";
			return output;
		}

}

public class Galaxy {

	//Instance Variables
	private String gname;
	private double gdiameter;
	private int num_stars;
	private Star[] nstar;

	//A no-argument constructor.
	public Galaxy() {

	}

	//A constructor with arguments
	public Galaxy(String gname, double gdiameter, int num_stars, Star[] nstar) {
		this.gname = gname;
		this.gdiameter = gdiameter;
		this.num_stars = num_stars;
		this.nstar = new Star[nstar.length];
		for(int i = 0; i < nstar.length; i++) {
			this.nstar[i] = new Star(nstar[i]);
		}
	}

	//Accessors
	public String getGname() {
		return gname;
	}

	public double getGdiameter() {
		return gdiameter;
	}

	public int getNumStars() {
		return num_stars;
	}

	public Star[] getNstar() {
		Star[] nstar = new Star[this.nstar.length];
		for(int k = 0; k < nstar.length; k++) {
			nstar[k] = new Star(this.nstar[k]);
		}
		return nstar;
	}

	//Mutators
	public void setGname(String gname) {
		this.gname = gname;
	}

	public void setGname(double gdiameter) {
		this.gdiameter = gdiameter;
	}

	public void setNumStars(int num_stars) {
		this.num_stars = num_stars;
	}

	public void setNstar(Star[] nstar) {
		this.nstar = new Star[nstar.length];
		for(int j = 0; j < nstar.length; j++) {
			this.nstar[j] = new Star(nstar[j]);
		}
	}

	//Galaxy toString method
	public String toString() {
		String output = "";
		output += "\nGALAXY NAME: " + this.getGname() + "\nGALAXY DIAMETER: " + this.getGdiameter() + " light years" + "\nNUMBER OF STARS: " + this.getNumStars() + " Billion" + "\n";
		for(int l = 0; l < this.nstar.length; l++) {
			output += "\nSTAR NUMBER " + l + "\n" + this.nstar[l].toString();
		}
		return output;
	}

}

public class HW1 {

	//The Main Method.
	public static void main(String[] args) {

		//An array of star object.
		Star[] nstar = new Star[4];
		nstar[0] = new Star("Polaris",8347.34,75.34,21);
		nstar[1] = new Star("Vega",245.23,64.34,72);
		nstar[2] = new Star("Pleiades",4115.64,98.53,64);
		nstar[3] = new Star("Canopus",61.75,898.23,53);

		//A Galaxy object.
		Galaxy god = new Galaxy("Milky Way",100000,250,nstar);

		System.out.println(god.toString());

	}

}
