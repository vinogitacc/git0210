package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringSplit {
	public static void main(String[] args) {
		
		String s = "welcome to programming class";
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
		rev = rev + s.charAt(i);	
		}
		
		System.out.println(rev);
		
		String[] split = s.split(" ");
		for (String a : split) {
		char ca = a.charAt(0);
		char upperCase = Character.toUpperCase(ca);
		String substring = a.substring(1);
		String output = upperCase + substring + " ";
		System.out.print(output);	
		
		}
		System.out.println(" ");
		for (String b : split) {
		String rev1 = "";
		for (int i = b.length()-1; i >=0; i--) {
		rev1 = rev1 + b.charAt(i);			
			}
		System.out.print(rev1 + " "); 
			
		}
		System.out.println(" ");
		String s1 = "greens@123";
		
		Map<Character, Integer> mp = new LinkedHashMap<>();
		
		for (int i = 0; i < s1.length(); i++) {
			char ca1 = s1.charAt(i);
			if (mp.containsKey(ca1)) {
				
				Integer count = mp.get(ca1);
				mp.put(ca1, count+1);
			}
			else {
				mp.put(ca1, 1);
			}
		}
		
		System.out.println(mp);
		
		
		
		
		
		
		
		
		
		
	}

}
