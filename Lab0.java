/****************

Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 0 (Java Basics 101)
Professor Name: 
Student Name: 
Date: 01/23/2018

****************/

/* 
  This program does the following: 
    - Creates an array of 10 random integers between 0 and 20. 
    - It finds the maximum value in that array and returns it.
    - It also prints out all the array elements.
*/

public class Lab0 {
  
  //In the main method an array is created an 10 random numbers between 0 and 20 are inserted in the array.
  public static void main(String[] args){
    int[] array = new int[10];
    for(int y = 0; y < 10 ;y++){
      array[y] = (int)(Math.random()*20);
    } 
    printArray(array);
    findMax(array);
  }

  //This method iterates through the array and finds the max value and returns it.
  public static int findMax(int[] array){
    int max = array[0];
    for(int i = 0; i < array.length; i++){
      if(max < array[i]){
        max = array[i];
      }
    }
    System.out.println("The max value in this array is: " + max);
    return max;
  }
  
  //This method prints out each element of the array side by side.
  public static void printArray(int[] array){
    System.out.println("The array elements are: ");
    for(int x = 0; x < array.length; x++){
      System.out.print(array[x] + " "); 
    }
    System.out.println("");
  }
}


