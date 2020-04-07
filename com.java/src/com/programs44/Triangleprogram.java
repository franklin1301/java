package com.programs44;

import java.util.Scanner;

public class Triangleprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int noOfRows = sc.nextInt();
		for (int i = 0; i < noOfRows; i++) {
			/*
			 * for (int j = i; j<noOfRows; j++) { System.out.print(" "); }
			 */ for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
