package programs40;

import java.util.Scanner;

public class swapingnowithoutusingthirdvariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The Numbers are");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("the swapped numbers are");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	sc.close();
}
}
