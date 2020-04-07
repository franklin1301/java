package programs40;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no. of terms");
	int n  = sc.nextInt();
	System.out.println("enter the first no");
	int f1= sc.nextInt();
	System.out.println("enter the second no ");
	int f2 = sc.nextInt();
	int f3 ;
	System.out.println(f1);
	System.out.println(f2);
	for (int i = 2; i < n; i++) {
		f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
	}
	sc.close();
}
}
