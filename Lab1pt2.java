/****************

  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 1 (Part-2) 
  Professor Name: 
  Student Name: 
  Date: 01/30/2018

****************/

/* 
  This program does the following: 
    - Calculates the area of the first rectangle.
    - Calculates the perimeter of the second rectangle.
*/

class Rectangle {
  
  //The default value for the width and height of the rectangle.
  double width = 1.0;
  double height = 1.0;
  
  //A no-arg constructor that creates a default rectangle.
  public Rectangle(){
  }
  
  //A constructor that creates a rectangle with a specified width and height.
  public Rectangle(double w, double h){
    width = w;
    height = h;
  }
  
  //This method returns the area of a rectangle
  public double getArea(){
    return width * height;
  }
  
   //This method returns the perimeter of a rectangle
  public double getPerimeter(){
    return 2 * (width + height);
  }
}

public class Lab1pt2{
  public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(4.0,40.0);
    System.out.println("The Area of the rectangle r1 is: " + r1.getArea());
    System.out.println("The Perimeter of the rectangle r2 is: " + r2.getPerimeter());
  }
}
