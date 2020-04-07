package com.programs44;

import java.util.Scanner;

public class countofoddno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first no");
	int f = sc.nextInt();
	System.out.println("enter the last no");
	int l = sc.nextInt();
	int count=0;
	for (int i = f; i < l; i++) {
		if (i%2==1) {
			count = count+1;
		}
	}
	System.out.println(count);
	sc.close();
}
}
