package com.jsp.strings;

public class ReverseWordOrder {
	
	public static void reverseWordOrder(String str) {
		String s[] = str.split(" ");
		
		for(int i = s.length-1; i>=0; i--) {
			System.out.print(s[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		String str = "Sohani Anil Jay";
		reverseWordOrder(str);
	}

}