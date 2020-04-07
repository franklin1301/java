package com.programs44;

import java.util.Scanner;

public class SwappingusingThirVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("the swapped numbers");
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}
}
