package chapter3.additional.computeIfPresent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Example1 {
	public static void main(String[] args) {
		/*
		 * computeIfPresent() calls the BiFunction
		 */
		/*
			If the mapping function is called and returns null, 
			the key is removed from the map for computeIfPresent().
		 */
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String, Integer, Integer> mapper
			= (k, v) -> v + 1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		System.out.println(counts); //{Jenny=2}
		System.out.println(jenny); // 2
		System.out.println(sam); // null
		
		
		BiFunction<String, Integer, Integer> mapper2
		= (k, v) -> null;
		counts.computeIfPresent("Jenny", mapper2);
		System.out.println(counts); // {}
		/*
		 * the return value is the result of what changed in the map 
		 * or null if that doesn’t apply. 
		 */
	}
}
