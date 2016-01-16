package com.tech.doks;

public class Literals {

	public static void main(String[] args) {
		float v1 = 5.5f;	// if f will remove then compile throw error - Type mismatch: cannot convert from double to float
		double v2 = 20;
		int i = 10;			// no conversion required
		double j = 10;		// implicit conversion
		int k = (int) 2.5;	// explicit conversion
		/*int l = (int) true;*/	// incompatible (conversion not possible)
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}

}
