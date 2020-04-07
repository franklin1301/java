package com.programs44;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class butterflyshuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		List<Integer> li = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
			li.add(sc.nextInt());
		}
		int n = li.size() / 2;
		for (int i = n; i > 0; i--) {
			System.out.println(li.get(i));
		}
		for (int i = li.size()-1; i >= n; i--) {
			System.out.println(li.get(i));
		}
		sc.close();
	}
}
