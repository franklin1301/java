package com.programs44;

import java.util.Scanner;

public class Fibonacciseries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first two no");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("enter the no of terms");
	int terms = sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	int c=0;
	
	
	for (int i = 2; i <terms ; i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	sc.close();
}
}
