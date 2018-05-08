

import java.io.*;

public class Driver {
	

	
	//Declares an array with an array length of 10
	public static int[] arr = new int[10];
	
	//Generates a random number and assigns it to the array
	public static void generateRandom() {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
	}
	
	//Creates a file and adds the numbers to it
	public static void writeNumbers() {
		try {
			FileWriter fw = new FileWriter("10RandomNumbers.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0; i<arr.length; i++) {
				pw.println(" " + arr[i]);
			}
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Error!");
		}	
	}
	
	
	//Display number from the file to the console
	public static void readNumbers() {
		try {
			FileReader fr = new FileReader("10RandomNumbers.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("File not Found!");
		}	
	}
	
	
	
	

	public static void main(String[] args) {
		generateRandom();
		writeNumbers();
		readNumbers();
	}
	
	
}
