package com.programs44;

import java.util.Scanner;

public class tocheckArmstrongNo {
public static void main(String[] args) {
	Scanner sc = new Scanner( System.in);
	System.out.println("enter the number");
	int n =sc.nextInt();
	int a,i=0,j=0;
	a=n;
	while(a>0) {
		i=a%10;
		j=(i*i*i)+j;
		a=a/10;
	}
	if (j==n) {
		System.out.println(n +"            is a armstrong number");
	}else {
		System.out.println(n +"            is not a armstrong number");
	}
	sc.close();
}
}
