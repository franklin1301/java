package com.programs44;
import java.util.Scanner;
public class Kthlargestandsmallestinanarray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of terms");
		int tems = sc.nextInt();
		int[] a = new int[tems];
		System.out.println("enter the numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("term of the largest no u need");
		int l = sc.nextInt();
		System.out.println("enter the terms of smallest no u need");
		int s = sc.nextInt();
		
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {                                                      //ascendingorder
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		//to get the smallest term entered
		System.out.println("the  "+l+" smallest term          "+a[l-1]);
		//to get the largest term entered
		System.out.println("the  "+s+" largest term            "+a[a.length-s]);
        
		sc.close();
	}
}