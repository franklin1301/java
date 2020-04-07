package com.programs44;

import java.util.Scanner;

public class Swappingwithoutthirdvariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	int a = sc.nextInt();
	int b =sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("the swapped no are");
	System.out.println(a);
	System.out.println(b);
	sc.close();
}
}
