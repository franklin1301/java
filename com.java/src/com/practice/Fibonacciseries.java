package com.practice;

import java.util.Scanner;

public class Fibonacciseries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of terms");
	int terms = sc.nextInt();
	System.out.println("enter first value");
	int F1 = sc.nextInt();
	System.out.println("enter second value");
	int F2 = sc.nextInt();
	System.out.println(F1);
	System.out.println(F2);
	int F3;
	for (int i = 2; i < terms ; i++) {
		F3=F1+F2;
		System.out.println(F3);
		F1=F2;
		F2=F3;
		
	}sc.close();
}
}
