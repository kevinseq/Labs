/****************
Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 14 (Generics)
Professor Name: Dr.Wenji Li
Student Name: Kevin Sequeira
Date: 05/08/2018
****************/


public class GenericBox<Type> {
	
	private Type item;
	
	public GenericBox(Type item) {
		this.item = item;
	}
	
	public Type getItem() {
		return item;
	}
	
	public void setItem(Type item) {
		this.item = item;
	}
	
	
	public static void main(String[] args) {
		
		GenericBox<String> box1 = new GenericBox<String>("Flash");
		GenericBox<Integer> box2 = new GenericBox<Integer>(2);
		GenericBox<Double> box3 = new GenericBox<Double>(1.5);
		
		System.out.println(box1.getItem());
		System.out.println(box2.getItem());
		System.out.println(box3.getItem());
		
		

	}
}
