package com.jsp.strings;

public class CountWords {
	
	public static int countWords(String s) {
		int count=1;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ' &&  s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "My name is Jay";
		System.out.println("Given String contains "+countWords(s)+ " Words");
	}
}
