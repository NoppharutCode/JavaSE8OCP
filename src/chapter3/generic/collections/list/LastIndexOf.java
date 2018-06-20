package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOf {
	// int lastIndexOf(Object o)
	// Returns last matching index or -1 if not found
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); // ["one"]
		list.add("two"); // ["one", "two"]
		list.add("three"); // ["one", "two", "three"]
		list.add("one"); // ["one", "two", "three", "one"]
		
		System.out.println(list.lastIndexOf("one")); // 3
		System.out.println(list.lastIndexOf("three")); // 2
		System.out.println(list.lastIndexOf("four")); // -1
		System.out.println(list.lastIndexOf(1)); // -1
	}
}
