package com.practice;

import java.util.Scanner;

public class Printarmstrongnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length");
	int length = sc.nextInt();
	int count=0;
	for (int i = 1; i < length; i++) {
		int a,j=0,k=0;
		a=i;
		while (a>0) {
			j=a%10;
			k=k+(j*j*j);
			a=a/10;
		}if (k==i) {
			System.out.println(k);
			count++;
		}
		}System.out.println(count);
		sc.close();
	}
}
