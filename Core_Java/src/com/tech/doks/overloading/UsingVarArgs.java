package com.tech.doks.overloading;

public class UsingVarArgs {

	/*Overloading : Same method name with different arguments is known as method overloading.*/
	
	int x, y, z, sum;
	
	void calculatedValud() {
		System.out.println("sum = " + sum);
	}
	
	void sum(int... val) {
		for(int x : val) {
			sum += x;
		}
		calculatedValud();
		sum = 0;
	}
	
	public static void main(String[] args) {
		UsingVarArgs usingVarArgs = new UsingVarArgs();
		usingVarArgs.sum(2);
		usingVarArgs.sum(2, 3);
		usingVarArgs.sum(2, 3, 5);
		usingVarArgs.sum(2, 3, 5, 10);
		usingVarArgs.sum(2, 3, 5, 10, 20);
		/*by default it's find that method which has matching parameter.
		 * if not found then it'll call var-args.*/
	}

}
