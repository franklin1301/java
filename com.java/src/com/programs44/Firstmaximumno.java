package com.programs44;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Firstmaximumno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	List<Integer> li = new ArrayList<Integer>();
	while (sc.hasNextInt()) {
		li.add(sc.nextInt());
	}
	
	Collections.sort(li,Collections.reverseOrder());
	System.out.println(li.get(0));
	
	
	sc.close();
}
}
