package com.mycompany.app;

public class App {
	public static void main(String[] args) {
		int input = 0;
		int result = 0;
		input = 10;
		result = fib(input);
		System.out.println("The " + input + "th term of the Fibonacci sequence is " + result + ".");
	}
	/**
	* Returns the nth value of the fibonnaci sequence
     	* @param nth
     	* @return
     	*/
	public static int fib(int nth) {
		int n = nth;
		if(n <= 1){
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
}
