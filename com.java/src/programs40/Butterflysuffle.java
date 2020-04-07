package programs40;

public class Butterflysuffle {
public static void main(String[] args) {
	int[] a = {0,1,2,3,4,5,6,7,8,9};
	int s =a.length/2;
	for (int i = s; i >=0 ; i--) {
		System.out.println(a[i]);
	}
	for (int i = a.length-1; i > s; i--) {
		System.out.println(a[i]);
	}
}
}
