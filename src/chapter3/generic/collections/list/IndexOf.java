package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {
	// int indexOf(Object o)
	// Returns first matching index or -1 if not found
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); // ["one"]
		list.add("two"); // ["one", "two"]
		list.add("three"); // ["one", "two", "three"]
		
		System.out.println(list.indexOf("one")); // 0
		System.out.println(list.indexOf("three")); // 2
		System.out.println(list.indexOf("four")); // -1
		System.out.println(list.indexOf(1)); // -1
	}
}
