package com.practice;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count =0;
	System.out.println("enter the no");
	int n = sc.nextInt();
	for (int i = 2; i < n ; i++) {
		count = 0;
		for (int j = 2; j <= i/2; j++) {
			if (i%j==0) {
			count = count+1;
		}
	}if (count==0) {
		System.out.println(i);
	}
	}sc.close();
}
}
