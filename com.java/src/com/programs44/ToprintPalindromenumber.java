package com.programs44;

import java.util.Scanner;

public class ToprintPalindromenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first and last number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("the Armstrong Numbers are ");
	for (int i = a; i <= b; i++) {
		int n,k=0,j=0;
		n=i;
		while (n>0) {
		   j=n%10;
		   k=(k*10)+j;
		   n=n/10;
		}
		if (i==k) {
			System.out.println(i);
		}
	}
	sc.close();
}
}
