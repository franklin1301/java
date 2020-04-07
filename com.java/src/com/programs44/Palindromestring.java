package com.programs44;

import java.util.Scanner;

public class Palindromestring {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.nextLine();
	String reverse="";
	for (int i = s.length()-1; i >=0; i--) {
		char ch = s.charAt(i);
		reverse =reverse+ch;
	}
	if (s==reverse) {
		System.out.println(s+ "        is a palindrome");
	}else {
		System.out.println(s+"           is not a palindrome");
	}
	sc.close();
}
}
