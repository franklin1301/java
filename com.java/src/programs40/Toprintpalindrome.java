package programs40;

import java.util.Scanner;


public class Toprintpalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enterthe lenthy");
	int l = sc.nextInt();
	int count=0;
	int a,n=0;
	for (int i = 1; i < l; i++) {
		int j=0;

		a=i;
		while (a>0) {
			n=a%10;
			j=(j*10)+n;
			a=a/10;
		}if (j==i) {
			count=count+1;
			
		}
	}System.out.println("count     "+count);
	sc.close();
}
}
