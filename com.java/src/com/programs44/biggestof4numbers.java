package com.programs44;

import java.util.Scanner;

public class biggestof4numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("enter the numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		//Arrays.toString(a);
if (a[0]>a[1]&&a[0]>a[2]&&a[0]>a[3]&&a[0]>a[4]) {
	System.out.println(a[0]+ "                 greatest no");
}else if (a[1]>a[0]&&a[1]>a[0]&&a[1]>a[3]&&a[1]>a[4]) {
	System.out.println(a[1]+ "                 greatest no");
}else if (a[2]>a[0]&&a[2]>a[1]&&a[2]>a[3]&&a[2]>a[4]) {
	System.out.println(a[2]+ "                 greatest no");
}else if (a[3]>a[0]&&a[3]>a[2]&&a[3]>a[0]&&a[3]>a[4]) {
}else {
	System.out.println(a[4]+ "                 greatest no");
	}
sc.close();
	}
}
