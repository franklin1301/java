package com.programs44;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nymber");
		int n = sc.nextInt();
		int factorial=1;
		for (int i = 1; i <=n ; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
