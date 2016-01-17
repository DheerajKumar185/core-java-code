package com.tech.doks.constructor;

public class Constructor {
	/*	Constructor name must be same as it's class name.
	 *	Constructor must have no explicit return type*/
	
	/*	2 Types of constructor
	 *	1. Default constructor
	 *	2. Parameterized constructor*/
	
	/*	Default constructor : Default constructor provides the default value to the object depending of the data type.*/
	
	/*	no-arg or zero argument constructor calling
	 * 	if there is not available any constructor on that time compiler create default constructor.
	 * 	in the below case there is a no-arg constructor that's why compiler not generate any default constructor and automatically call zero argument constructor.*/
	
	/*Constructor() {
		System.out.println("no argument constructor calling");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor constructor = new Constructor();
	}*/
	
	
	/*	in the below program compiler automatically create a default constructor*/
	
	int x, y;
	
	void display() {
		System.out.println("x = " + x + " and y = " + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor constructor = new Constructor();	// here i didn't create any constructor. that's why compiler automatically crate a default constructor and assign the default value of it's member veriable.
		constructor.display();
	}
}
