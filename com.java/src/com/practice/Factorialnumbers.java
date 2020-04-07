package com.practice;

import java.util.Scanner;

public class Factorialnumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int x = sc.nextInt();
	int count=1;
	for (int i = 1; i <=x; i++) {
		count = count*i;
	}System.out.println(count);
	sc.close();
}
}
