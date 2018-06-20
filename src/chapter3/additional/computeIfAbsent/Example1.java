package chapter3.additional.computeIfAbsent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Example1 {
	public static void main(String[] args) {
		/*
		 * computeIfAbsent(), 
		 * the functional interface runs only when the key isn’t present or is null
		 */
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		
		Function<String, Integer> mapper = k -> 1;
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);
		Integer sam = counts.computeIfAbsent("Sam", mapper);
		Integer tom = counts.computeIfAbsent("Tom", mapper);
		
		System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}
		System.out.println(jenny); // 15
		System.out.println(sam); // 1
		System.out.println(tom);
	}
}
