/****************

Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 1 (Part-1) (Java Basics 101)
Professor Name: 
Student Name: 
Date: 01/25/2018

****************/

/* 
  This program does the following: 
    - Calculates the area of a circle. 
*/

class Circle {
  
  //The radius of this circle
  double radius = 1.0;
  
  //Default constructor named Circle
  public Circle(){
  }
  
  //Constructor with 1 parameter
  public Circle(double newRadius){
    radius = newRadius;
  }
  
  //This method returns the area of a circle
  public double getArea(){
    return radius * radius * 3.14159;
  }
}

public class Lab1pt1{
  public static void main(String[] args){
    Circle c1 = new Circle();
    Circle c2 = new Circle(5.5);
    // double c1Area = c1.getArea();
    // double c2Area = c2.getArea();
    System.out.println("The Area of circle c1 is: " + c1.getArea());
    System.out.println("The Area of circle c2 is: " + c2.getArea());
  }
}
