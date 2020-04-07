package com.programs44;
import java.util.Scanner;

public class Thirdmaximumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of terms");
		int terms = sc.nextInt();
		System.out.println("which maximum value is req?????");
		int n = sc.nextInt();
		System.out.println("enter the numbers");
		int[] a = new int[terms];
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("The"+n+"largest value is    "+a[n - 1]);
		sc.close();
	}
}
