package com.programs44;

import java.util.Scanner;

public class Mutiplicationtable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the table");
	int t = sc.nextInt();
	System.out.println("enter the terms");
	int n = sc.nextInt();
	int c = 0;
	for (int i = 1; i <=n; i++) {
		c=i*t;
		System.out.println(i+" * "+t+" =  "+c);
	}
	sc.close();
}
}
