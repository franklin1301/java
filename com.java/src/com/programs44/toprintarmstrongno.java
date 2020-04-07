package com.programs44;

import java.util.Scanner;

public class toprintarmstrongno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first and last number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("the armstrong numbers are");
	for (int i = a; i <=b; i++) {
		int n,j=0,k=0;
		n=i;
		while (n>0) {
			k=n%10;
			j=(k*k*k)+j;
			n=n/10;
		}
		if (i==j) {
			System.out.println(i);
		}
	}
	sc.close();
}
}
