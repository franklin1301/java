package com.programs44;

import java.util.Scanner;

public class splitandreversethestring {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter The String");
	String s = sc.nextLine();
	String[] split = s.split(" ");
	String reverse="";
	
	for (int i = 0; i < split.length; i++) {
		char[] ch = split[i].toCharArray();
	for (int j = ch.length-1; j >=0; j--) {
		reverse=reverse+ch[j];
	}
	reverse=reverse+" ";
	
	}
	System.out.print(reverse +" ");
	sc.close();
}
}
