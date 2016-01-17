package com.tech.doks;

public class Anonymous {
	/*Anonymous : simply means nameless.
	 * An object that have no reference is known as anonymous object.
	 * if you have to use an object only once, anonymous object is a good approach.*/
	
	int length, width;
	
	void calculateArea(int x, int y) {
		length = x;
		width = y;
		System.out.println(length * width);
	}
	
	public static void main(String[] args) {
		new Anonymous().calculateArea(10, 20);
	}
}