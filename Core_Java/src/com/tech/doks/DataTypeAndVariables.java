package com.tech.doks;

public class DataTypeAndVariables {
	int v1;
	float v2;
	boolean v3;
	String v4;
	
	void display(){
		int v5, v6 = 6;
		v5 = v1;
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
	}
	public static void main(String... args) {
		// TODO Auto-generated method stub
		DataTypeAndVariables obj = new DataTypeAndVariables();
		obj.display();
		System.out.println("from main v1 = " + obj.v1);
	}

}
