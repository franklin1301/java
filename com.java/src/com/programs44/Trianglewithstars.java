package com.programs44;

import java.util.Scanner;

public class Trianglewithstars {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter No Of Rows");
	int noofrows = sc.nextInt();
	
	for (int i = noofrows; i >0 ; i--) {
		for (int j = 0; j < i*2; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <=noofrows ; j++) {
			System.out.print(j+" ");
		}
		for (int j = noofrows; j >i ; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	sc.close();
}
}
