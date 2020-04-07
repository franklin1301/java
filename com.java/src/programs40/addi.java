package programs40;

import java.util.Scanner;

public class addi {
public static void main(String[] args) {
	int count = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int nextInt = sc.nextInt();
	
	
//*************************************************odd and even*****************************************************************************
	
	if(nextInt%2==1) {
		System.out.println("no is odd");
	}else {
		System.out.println("the given no is even ");
	}
//***********************************************odd and even number addition for a given set of numbers*************************************
	for (int i = 0; i < nextInt; i++) {
		if (i%2==1) {                                                  //i%2==0     for a even condition
			count=count+i;
		}
	}System.out.println(count);
//*********************************************to get count of a odd even number*************************************************************
	for (int i = 0; i < nextInt; i++) {
		if (i%2==1) {
			count=count +1;
			
		}
	}System.out.println(count);
//*****************************************************************************************************************************************
	sc.close();
}

}