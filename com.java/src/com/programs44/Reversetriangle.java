package com.programs44;

import java.util.Scanner;

public class Reversetriangle {
public static void main(String[] args) {
	System.out.println("enter no of rows");
	Scanner sc = new Scanner(System.in);
	int noofrows = sc.nextInt();
	
	for (int i = 0; i < noofrows; i++) {
		for (int j = noofrows; j >i ; j--) {
			System.out.print("*");
		}System.out.println();
	}
	sc.close();
}
}
