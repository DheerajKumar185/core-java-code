package com.tech.doks.constructor;

public class CopyConstructor {
	
	/*	There r 3 way to copy the value of one object to another object.
	 * 	1. By Constructor
	 * 	2. By assigning the value of one object into another.
	 * 	3. By clone() method of object class*/
	
	int x, y;
	
	/*//	copy the value of one object to another object using constructor.
	CopyConstructor(int a, int b) {
		x = a;
		y = b;
	}
	
	CopyConstructor(CopyConstructor a) {
		x = a.x;
		y = a.y;
	}
	
	void display() {
		System.out.println("x = " + x + ",  y = " + y);
	}
	
	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(2, 3);
		CopyConstructor c2 = new CopyConstructor(c1);
		c1.display();
		c2.display();

	}*/
	
	//	Copying values without constructor
	CopyConstructor(int a, int b) {
		x = a;
		y = b;
	}
	
	CopyConstructor() {
		
	}
	
	void display() {
		System.out.println("x = " + x + ",  y = " + y);
	}
	
	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(2, 3);
		CopyConstructor c2 = new CopyConstructor();
		c2.x = c1.x;
		c2.y = c1.y;
		c1.display();
		c2.display();

	}
}
