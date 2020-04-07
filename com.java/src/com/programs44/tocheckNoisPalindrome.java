package com.programs44;

import java.util.Scanner;

public class tocheckNoisPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Number");
	int n = sc.nextInt();
	int a,i=0,j=0;
	a=n;
	while (a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	if (j==n) {
		System.out.println(n +"        is a palindrome no");
	}else {
		System.out.println(n+"         is not a palindrome no");
	}
	sc.close();
}
}
