package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class GetByIndex {
	// E get(int index)
	// Returns element at index
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); // ["one"]
		list.add("two"); // ["one", "two"]
		list.add("three"); // ["one", "two", "three"]
		
		System.out.println(list.get(0)); // one
		System.out.println(list.get(1)); // two
		System.out.println(list.get(2)); // three
		//System.out.println(list.get(-1)); error ArrayIndexOutOfBoundsException
		//System.out.println(list.get(3)); error ArrayIndexOutOfBoundsException
	}
}
