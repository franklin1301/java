package programs40;

import java.util.Scanner;

public class Pramid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of terms");
	int noofterms = sc.nextInt();
	System.out.println("the pyramid is");
	for (int i = noofterms; i > 0; i--) {
		for (int j = 0; j <i*2 ; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <noofterms ; j++) {
			System.out.print(j+" ");
		}
		for (int j = noofterms; j >=i ; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter no of terms u need"); int noofterms = sc.nextInt();
		 * int rowcount=1;
		 * 
		 * for (int i = noofterms; i >=1; i--) { // ecah iteration will happen once
		 * 5,4,3,2,1
		 * 
		 * for (int j = 1; j <i*2 ; j++) { System.out.print(" "); //will give space upto
		 * to the iteration }
		 * 
		 * for (int j = i; j <=noofterms ; j++) { // j=5 ------ 5<=5 6
		 * System.out.print(j+" "); }
		 * 
		 * for (int j = noofterms-1; j >=i ; j--) { //j=5-1=4 -------- 4>=5 condition
		 * fails System.out.print(j+" "); }
		 * 
		 * System.out.println(); rowcount++; } sc.close();
		 */
}
}
