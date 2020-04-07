package com.programs44;

import java.util.Scanner;

public class OddorEvenNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	
	if (n%2==0) {
		System.out.println(n +"     is a even number");
	}else if (n%2==1) {
		System.out.println(n+"      is a odd number");
	}
	
	sc.close();
}
}
