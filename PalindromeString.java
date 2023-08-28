package com.jsp.strings;

public class PalindromeString {
	public static boolean isPalindrome(String s) {
		int low=0;
		int high=s.length()-1;
	
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}else {
				low++;
				high--;			
				}
			}
		return true;
		}
	
	public static void main(String[] args) {
		String s = "racecar";
		boolean flag=(isPalindrome(s));
		
		if(flag==true) {
			System.out.println(s +" is a Palindrome String");
		}else {
			System.out.println(s +" is not a Palindrome String");
		}
		
	}
}
