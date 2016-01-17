package com.tech.doks.overloading;

public class Overloading {
	/*Overloading : Same method name with different arguments is known as method overloading.*/	
	
	int x, y, z, sum;
	
	void sum(int a, int b){
		x = a;
		y = b;
		sum = x + y;
		calculatedValud();
	}
	
	void sum(int a, int b, int c){
		x = a;
		y = b;
		z = c;
		sum = x + y + c;
		calculatedValud();
	}
	
	void calculatedValud() {
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.sum(2, 3);
		overloading.sum(2, 3, 5);
	}
}