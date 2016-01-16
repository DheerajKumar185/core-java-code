package com.tech.doks;

/*--------------------------My Logic--------------------------*/
/*public class FibonacciSeries {
	static int i, o, n, sum;
	public static void main(String[] args) {
		int no = 10;
		while (i < no) {
			System.out.println(sum);
			if(n == 0) {
				n++;
				sum = o + n;
			}
			else {
				sum = o + n;
				o = n;
				n = sum;
			}
			i++;
		}
	}
}*/

/*--------------------------Without recursion--------------------------*/

/*public class FibonacciSeries {
	public static void main(String[] args) {
		int i = 0, o = 0, n = 0, sum = 0, no = 10;
		System.out.println(sum);
		sum = ++n;
		System.out.println(sum);
		i += 2;
		while (i < no) {
			sum = o + n;
			o = n;
			n = sum;
			System.out.println(sum);
			i++;
		}
	}
}*/

/*--------------------------Using recursion--------------------------*/

public class FibonacciSeries {
	static int i, o, n, sum; 
	public static void main(String[] args) {
		int no = 10;
		System.out.println(sum);
		sum = ++n;
		System.out.println(sum);
		fibonacci(no - 2);
	}
	static void fibonacci(int no) {
		while (i < no) {
			sum = o + n;
			o = n;
			n = sum;
			System.out.println(sum);
			i++;
		}
	}
}