package com.programs44;

import java.util.Scanner;

public class VowelsAndNonvowels {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	int vowels=0;
	int nonvowels=0;
	char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		char a =ch[i];
		if (a=='a'||a=='A'||a=='e'||a=='E'||a=='i'
				||a=='I'||a=='o'||a=='O'||a=='u'||a=='U') {
			vowels++;
		}else {
			nonvowels++;
		}
	}
	System.out.println("vowels in a string      :            "+vowels);
	System.out.println("non voweels in a string :            "+nonvowels);
	sc.close();
}
}
