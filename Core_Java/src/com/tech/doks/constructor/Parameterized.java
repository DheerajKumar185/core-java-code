package com.tech.doks.constructor;

public class Parameterized {
	int x, y;
	
	Parameterized(int a, int b) {
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println("x = " + x + " and y = " + y);
	}
	public static void main(String[] args) {
		Parameterized p1 = new Parameterized(2, 3);
		Parameterized p2 = new Parameterized(3, 5);
		p1.display();
		p2.display();

	}

}
