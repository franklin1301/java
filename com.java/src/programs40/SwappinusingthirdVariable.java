package programs40;

import java.util.Scanner;

public class SwappinusingthirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Numbers are");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c ;
		System.out.println("numbers after swapping");
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
