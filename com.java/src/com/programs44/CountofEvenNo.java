package com.programs44;
import java.util.Scanner;

public class CountofEvenNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of first terms");
	int f = sc.nextInt();
	System.out.println("enterm the last term");
	int l = sc.nextInt();
	int count=0;
	for (int i = f; i <=l; i++) {
		if (i%2==0) {
			count = count+1;
		}
	}
	System.out.println(count);
	sc.close();
}
}
