package com.programs44;

import java.util.Scanner;

public class SumofevenNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no first and last no ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum=0;
	for (int i = a; i <= b; i++) {
		if (i%2==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
	sc.close();
}
}
