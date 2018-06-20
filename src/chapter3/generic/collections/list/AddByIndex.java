package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class AddByIndex {
	// void add(int index, E element)
	// Adds element at index and moves the rest toward the end
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(0, "cat"); // ["cat"]
		list.add(1, "dog"); // ["cat" , "dog"]
		list.add(0, "bird"); // ["bird", "cat", "dog"]
		//list.add(-1, "Hello");  error IndexOutOfBoundsException
		//list.add(4, "Hello"); error IndexOutOfBoundsException
		System.out.println(list);
	}
}
