package com.practice;

import java.util.Scanner;

public class Reverseofanumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = sc.nextInt();
	int n,i=0,j=0;
	n=a;
	while (n>0) {
		i=n%10;
		j=(j*10)+i;
		n=n/10;
	}
	System.out.println("the reversed no is "+j);
	sc.close();
}
}
