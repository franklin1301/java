package programs40;

import java.util.Scanner;

public class PrimenoCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int x = sc.nextInt();
	int count;
	for (int i = 2; i < x; i++) {
		count=0;
	 for (int j = 2; j < i; j++) {
		if (i%j==0) {
			count++;
			break;
		}
	}if (count==0) {
		System.out.println(i);
	}
			
		
	}
	sc.close();
}
}
