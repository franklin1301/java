package com.programs44;

import java.util.Scanner;

public class sumofagivenno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Number");
	int n = sc.nextInt();
	int sum=0,i=0;
	while (n>0) {
		i=n%10;
		sum=sum+i;
		n=n/10;
	}
	System.out.println(sum);
	sc.close();
}
}
