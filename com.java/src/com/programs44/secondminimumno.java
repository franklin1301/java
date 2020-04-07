package com.programs44;
import java.util.Arrays;
import java.util.Scanner;

public class secondminimumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the term smallest no u need");
		int n = sc.nextInt();
		Arrays.sort(a);
		System.out.println(a[n - 1]);
		sc.close();
	}
}
