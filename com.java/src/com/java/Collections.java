package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
	static List<String> li = new ArrayList<String>();
	public static void main(String[] args) {
	
		String s = "drangon ballzzz beyblade powerrangers shakalaka booomboom";
		String[] s1 = { "dragon", "pokemon", "ballzzz", "beyblade", "powerrangers", "shakalaka boomboom" };
		for (int i = 0; i < s1.length; i++) {
		li.add(s1[i])	;
		}
		//for sorting in array
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
//*****************************************************
		//for sorting an array using li;
		System.out.println(li);
		java.util.Collections.sort(li);
		System.out.println(li);
		
	}
	}
	
