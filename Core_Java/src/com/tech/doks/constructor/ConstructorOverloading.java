package com.tech.doks.constructor;

public class ConstructorOverloading {
	
	int x, y , z;
	
	ConstructorOverloading(int a) {
		x = a;		
	}
	
	ConstructorOverloading(int a, int b) {
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println("x = " + x + ",  y = " + y + " and z = " + z);
	}

	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading(2);
		ConstructorOverloading c2 = new ConstructorOverloading(2, 3);
		ConstructorOverloading c3 = new ConstructorOverloading(2, 3, 5);
		c1.display();
		c2.display();
	}
	
	ConstructorOverloading(int... val) {
		for(int x : val) {
			System.out.println("value = " + x);
		}
	}
}