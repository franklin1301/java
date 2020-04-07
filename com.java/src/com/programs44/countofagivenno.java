package com.programs44;

import java.util.Scanner;

public class countofagivenno {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	int count=0 ;
	while (n>0) {
		count=count+1;
		n=n/10;
	}
	System.out.println(count);
	sc.close();
}
}