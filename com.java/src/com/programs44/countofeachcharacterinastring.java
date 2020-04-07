package com.programs44;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countofeachcharacterinastring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		//char[] ch = s.toCharArray();
		//foreach(char c:ch)______________containskey_______get_____put
		
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
			if (m.containsKey(ch)) {
				Integer x = m.get(ch);
				m.put(ch, x+1);
				
			}else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
	
	sc.close();
		}
		
	}

