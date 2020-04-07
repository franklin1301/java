package com.programs44;

import java.util.Scanner;

public class Studentsgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String[] n = new String[5];
		int[] m = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i]=sc.nextLine();
		}	
		System.out.println("enter the marks");
		for (int i = 0; i < m.length; i++) {
			m[i]=sc.nextInt();
		}
		
		for (int i = 0; i < m.length; i++) {
		if (m[i]>89 && 100>=m[i]) {
			System.out.println(n[i]+ "       s grade");
		}else if(m[i]>79&&89>=m[i]){
			System.out.println(n[i]+"        a grade");
		}else if(m[i]>69 && 79>=m[i]){
			 System.out.println(n[i]+"        b grade");
		}else {
			System.out.println(n[i]+"          fail");
		}
		}
		sc.close();
	}

}
