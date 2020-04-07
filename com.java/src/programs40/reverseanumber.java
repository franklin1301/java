package programs40;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int a,i=0,j = 0;
		a=number;
		while(a>0) {
			i=a%10;
			System.out.println(i);
			j=(j*10)+i;
			System.out.println(j);
			a=a/10;
			System.out.println(a);
		}
		
		System.out.println("reverse no"+j);
		sc.close();
	}
}
