package com.programs44;

import java.util.Scanner;

public class descendingorderusinganarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	
	int[] a = new int[5];
	int temp=0;
	
	for (int i = 0; i < a.length; i++) {
		 a[i] = sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	sc.close();
}
}
