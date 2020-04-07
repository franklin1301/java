package com.programs44;

import java.util.Scanner;

public class tocountPalindromeNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first and last Numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int count=0;
	for (int i = a; i <= b; i++) {
		int n=i,j=0,k=0;
		while (n>0) {
			j=n%10;
			k=(k*10)+j;
			n=n/10;
		}
		if (i==k) {
			count++;
		}
	}
	System.out.println(count);
	sc.close();
}
}
