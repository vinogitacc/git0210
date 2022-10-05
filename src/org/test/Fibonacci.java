package org.test;

public class Fibonacci {
	public static void main(String[] args) {
		
		int f =0, s = 1;
		//0 1 1 2 3 5 8
		for (int i = 0; i <=10; i++) {
			
			System.out.println(f);
			int t = f+s;
			f=s;
			s=t;
			
		}
		System.out.println("completed Fibonacci series");
	}
	

}
