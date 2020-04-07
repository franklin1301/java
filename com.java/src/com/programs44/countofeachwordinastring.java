package com.programs44;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countofeachwordinastring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		
		Map<String,Integer> m = new HashMap<String, Integer>();
		
		String[] ss = s.split(" ");
		for (String key : ss) {
			if (m.containsKey(key)) {
				Integer integer = m.get(key);
				m.put(key, integer+1);
			}else {
				m.put(key, 1);
		}
	
		}
		
		System.out.println(m);
		
		sc.close();
	}
}
