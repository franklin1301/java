package com.practice;

import java.util.Scanner;

public class Printpalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of terms");
	int size = sc.nextInt();
	int count=0;
	for (int i = 0; i <=size; i++) {
		int a,x=0,y=0;
		a=i;
		while (a>0) {
			x=a%10;
			y=(y*10)+x;
			a=a/10;
		}if (y==i) {
		//	System.out.println(i);
			count++;
		}
	}System.out.println(count);
	sc.close();
}
}
