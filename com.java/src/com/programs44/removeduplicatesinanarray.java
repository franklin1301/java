package com.programs44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeduplicatesinanarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of list");
	int n = sc.nextInt();
	System.out.println("enter the array values");
	List<String> li = new ArrayList<String>();
	while (sc.hasNextLine()&&li.size()<n) {
		li.add(sc.nextLine());
		}
	for (int i = 0; i < li.size(); i++) {
		for (int j = i+1; j < li.size(); j++) {
			if (li.get(i).equals(li.get(j))) {
				li.remove(j);
			}
		}
		
	}
	for (String x : li) {
		System.out.println(x);
	}
	sc.close();
}}


//set++++++++++++++++++++++++++++++++++++++++++++
