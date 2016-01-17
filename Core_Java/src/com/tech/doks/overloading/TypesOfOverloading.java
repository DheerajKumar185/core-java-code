package com.tech.doks.overloading;

public class TypesOfOverloading {
	/*Two way to overload the method
	 * 1. by changing the no of arguments.
	 * 2. by changing the data type*/

	/*Here we using by changing the data type of argument*/
	
	/*void sum(int a, int b){
		System.out.println("sum = " + (a + b));
	}
	
	void sum(double a, double b, double c){
		System.out.println("sum = " + (a + b + c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfOverloading typesOfOverloading = new TypesOfOverloading();
		typesOfOverloading.sum(2, 3);
		typesOfOverloading.sum(2, 3, 5);
	}*/
	
	/*//	TypePromotion if matching found
	void sum(int a, long b){
		System.out.println("sum = " + (a + b));
	}
	
	void sum(int a, int b, int c){
		System.out.println("sum = " + (a + b + c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfOverloading typesOfOverloading = new TypesOfOverloading();
		typesOfOverloading.sum(2, 3);
		typesOfOverloading.sum(2, 3, 5);
	}*/
	
	/*//	TypePromotion if matching found
	void sum(int a, int b){
		System.out.println("sum = " + (a + b));
	}
	
	void sum(double a, double b){
		System.out.println("sum = " + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfOverloading typesOfOverloading = new TypesOfOverloading();
		typesOfOverloading.sum(2, 3);
		typesOfOverloading.sum(2l, 3l);
	}*/
	
//	TypePromotion in case ambiguity
	/*void sum(int a, long b){
		System.out.println("sum = " + (a + b));
	}
	
	void sum(long a, int b){
		System.out.println("sum = " + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfOverloading typesOfOverloading = new TypesOfOverloading();
		typesOfOverloading.sum(2, 3);
		typesOfOverloading.sum(2, 3);	//	The method sum(int, long) is ambiguous for the type TypesOfOverloading. * Sol : either replace 3 to 3l or change long to int
	}*/
}
