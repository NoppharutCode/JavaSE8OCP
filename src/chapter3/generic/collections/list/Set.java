package chapter3.generic.collections.list;

import java.util.ArrayList;

public class Set {
	// E set (int index, E e)
	// Replaces element at index and returns original
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one"); // ["one"]
		list.add("two"); // ["one", "two"]
		list.add("three"); // ["one", "two", "three"]
		
		System.out.println(list.set(0, "four")); // one"
		System.out.println(list);//["four", "two", "three"]
		//list.set(-1, "zero"); error ArrayIndexOutOfBoundsException
		//list.set(3, "zero"); error IndexOutOfBoundsException
	}
}
