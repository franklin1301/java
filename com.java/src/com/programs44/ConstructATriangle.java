package com.programs44;

import java.util.Scanner;

public class ConstructATriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int rowcount = sc.nextInt();
		for (int i = rowcount; i > 0; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rowcount; j++) {
				System.out.print(j + " ");
			}
			for (int j = rowcount - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		sc.close();
	}
}
