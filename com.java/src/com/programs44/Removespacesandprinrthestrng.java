package com.programs44;

import java.util.Scanner;

public class Removespacesandprinrthestrng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		String replace = s.replace(" ", "");
		System.out.println(replace);
		sc.close();
	}
}
