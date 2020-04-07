package com.java;

public class fibonacciseries {
	public static void main(String[] args) {

		int i;
		int a = 0;
		int b = 10;
		System.out.println(a);
		System.out.println(b);
		for (i = 0; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

		/*
		 * Scanner sc = new Scanner(System.in); int nxtint = sc.nextInt();
		 */
	}
}