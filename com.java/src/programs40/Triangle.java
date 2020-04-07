package programs40;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size ");
	int size = sc.nextInt();
	for (int i = 0; i <size ; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
for (int i = 0; i < size; i++) {
	for (int j = size; j >= i; j--) {
		System.out.print("*");
	}System.out.println();
}
sc.close();
}
}
