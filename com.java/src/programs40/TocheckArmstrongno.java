package programs40;

import java.util.Scanner;

public class TocheckArmstrongno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the input");
	int terms = sc.nextInt();
	int count=0;
	for (int n = 1; n < terms ; n++) {
		
	int a,i=0,j=0;
	a=n;
	while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if (j==n) {
		System.out.println(j);
		count++;
	}
		/*
	}	 * if (n==j) { System.out.println("the no is armstrong number"); }else {
		 * System.out.println("the no is not a armstrong no"); }
		 */
	

}System.out.println(count);
	sc.close();
}}
