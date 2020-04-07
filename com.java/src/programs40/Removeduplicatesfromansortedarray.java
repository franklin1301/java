package programs40;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicatesfromansortedarray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 5, 6, 7, 4, 5 };
		Set<Integer> s = new TreeSet<Integer>();

		List<Object> li = new ArrayList<Object>();
		for (int i = 0; i < a.length; i++) {
			li.add(a[i]);// to add elements to list
			s.add(a[i]);  /// to add in set
		}
		System.out.println(li);
		
		for (int i = 0; i < li.size(); i++) {
			for (int j = i+1; j < li.size(); j++) {
				if (li.get(i).equals(li.get(j))) {
					li.remove(j);
					j--;
				}
			}
		}
		System.out.println(li);
		
		//by using set---------------------------
		System.out.println(s);
		
		
		
	}
}
