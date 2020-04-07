package com.programs44;

import java.util.Scanner;

public class toprintprimeno {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the last no");
	int n = sc.nextInt();
	System.out.println("the prime no are");
	for (int i = 1; i < n; i++) {
		int count =0;
		for (int j = 2; j <=i ; j++) {
			if (i%j==0) {
				count++;
			}
		}if (count==1) {
			System.out.println(i);
		}
	}
	sc.close();
}
}
