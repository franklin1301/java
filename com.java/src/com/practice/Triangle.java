package com.practice;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length of triangle");
	int length = sc.nextInt();
	for (int i = 0; i < length; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 0; i <= length; i++) {
		for (int j = length ; j >i; j--) {
			System.out.print("*");
		}System.out.println();
}sc.close();
}
}