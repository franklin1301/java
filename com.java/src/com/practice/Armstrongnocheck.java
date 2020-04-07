package com.practice;

import java.util.Scanner;

public class Armstrongnocheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}if (j==n) {
			System.out.println("armstrong no ");
		}else {
			System.out.println("not a armstrong no");
		}
		sc.close();
}
}