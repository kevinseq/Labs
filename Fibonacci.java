
/****************
Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 12 (Recursion)
Professor Name: Dr.Wenji Li
Student Name: Kevin Sequeira 
Date: 05/01/2018
****************/

public class Fibonacci {
	
	//A method that uses the recursion
	public static int fibonacciSequence(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacciSequence(n-1) + fibonacciSequence(n-2);
		}
	}
	
	public static void main(String[] args) {
		
		//Variables
		int start = 10;
		int end = 20;
		
		//Iterates over the specified range of numbers
		for(int i = start; i < end+1; i++) {
		System.out.println("The " + i + "th Fibonacci Sequence is " + fibonacciSequence(i));
		}
	}

}
