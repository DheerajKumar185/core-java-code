package com.tech.doks;

public class MainClass {

	static int i;			// i is a class variable.
	final int k = 5;		// k is a instance variable. we cant't change the value of final variable.
	void display(){	//	not static method can directly use instance and class variable.
		System.out.println("i = " + i);
		System.out.println("k = " + k);
	}
	public static void main(String[] args) { // static method only access class variable but not access instance variable.
		int j = 5;
		System.out.println("i = " + i);		// Default value of i is it's data type 
		System.out.println("j = " + j);		// j is a local variable. it's must be initialized.
		/*System.out.println("k = " + k);*/	// k is a instance variable. without using object we cant's use it.
		MainClass mainClass = new MainClass();
		mainClass.display();
		System.out.println("k = " + mainClass.k); // k is a instance variable. it's only use by object.
	}

}
