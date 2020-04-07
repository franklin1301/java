package programs40;

import java.util.Arrays;

public class Largestandsmallestelement {
	public static void main(String[] args) {
		int[] s= {0,1,5,3};
		/*
		 * Arrays.sort(s); System.out.println(Arrays.toString(s));
		 */
		int a ;
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i]<s[j]) {      // for ascending >
//					System.out.println(s[i]);
//					System.out.println(s[j]);
					a=s[j];
//		System.out.println(a);
					s[j]=s[i];
					s[i]=a;
				}
			}//System.out.println(s[i]);
			
		}
for (int i = 0; i < s.length; i++) {
	System.out.println(s[i]);
}


//alter

Arrays.sort(s);
//for (int j = 0; j < s.length; j++) {----ascending 
//System.out.println(s[j]);}
for (int i = s.length-1; i >=0; i--) {
	System.out.println(s[i]);
}
System.out.println(s[s.length-2]);
	}
}
