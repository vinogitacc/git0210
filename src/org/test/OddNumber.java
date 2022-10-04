package org.test;

public class OddNumber {
	
public static void main(String[] args) {
	
	int oddnum =0;
	int evenum=0;
	
	for (int i = 1; i <=10; i++) {
		
		if (i%2==0) {
			System.out.println("EvenNumber: "+i);
			oddnum = oddnum + i;
		}
		else {
			System.out.println("OddNumber :"+i);
			evenum = evenum + i;
		}
		System.out.println(oddnum);
		System.out.println(evenum);
		
	}
			
			
}
	
}
