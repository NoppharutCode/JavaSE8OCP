package chapter3.generic.collections.navihableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AllMethod {
	/* E lower (E e)
	 Returns greatest element that is < e,
	 or null if no such element
	*/
	
	/* E floor (E e)
	 Returns greatest element that is <= e,
	 or null if no such element
	*/
	
	/* E ceiling (E e)
	 Returns smallest element this is >= e,
	 or null if no such element  
	*/
	
	/* E higher (E e)
	 Returns smallest element this is > e,
	 or null if no such element  
	*/
	
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i <= 20; i++) {
			set.add(i);
		}
		
		System.out.println(set.lower(10)); // 9
		System.out.println(set.floor(10)); // 10
		System.out.println(set.ceiling(20)); // 20
		System.out.println(set.higher(20)); // null
		
	}
}
