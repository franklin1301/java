package programs40;

import java.util.Scanner;

public class Tochecknoispalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int x = sc.nextInt();
	int a,i=0,j=0;
	a=x;
	while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	if (j==x) {
		System.out.println("the given number is palindrome");
	}else {
		System.out.println("the given number is not a palindrome");
	}
	sc.close();
}
}
