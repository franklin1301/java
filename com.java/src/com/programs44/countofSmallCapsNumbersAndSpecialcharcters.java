package com.programs44;

import java.util.Scanner;

public class countofSmallCapsNumbersAndSpecialcharcters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.nextLine();
	int small=0;
	int caps=0;
	int numbers=0;
	int specialchar=0;
	for (int i = 0; i < s.length(); i++) {
		char n = s.charAt(i);
	if (n>='a'&&n<='z') {
		small++;
	}else if ('A'<=n&&n<='Z') {
		caps++;
	}else if ('0'<=n&&n<='9') {
		numbers=numbers+1;
	}else {
		specialchar++;
	}
	}
	System.out.println("small letters       "+small);
	System.out.println("caps letters       "+caps);
	System.out.println("numbers letters       "+numbers);
	System.out.println("specialchar letters       "+specialchar);
	sc.close();
}
}
