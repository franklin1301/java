package com.practice;

import java.util.Scanner;

public class Swappingwiththirdvariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c ;
	c=a;
	a=b;
	b=c;
	System.out.println("the swapped numbers are");
	System.out.println(a);
	System.out.println(b);
	sc.close();
}
}
