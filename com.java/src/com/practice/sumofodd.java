package com.practice;

import java.util.Scanner;

public class sumofodd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of terms");
	int terms = sc.nextInt();
	int count=0;
	int i=0;
	for ( i = 0; i < terms; i++) {
		if (i%2==1) {
			i=i+2;
		}
		System.out.println(i);

	}
	sc.close();
}
}
