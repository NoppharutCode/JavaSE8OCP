package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	// void remove(int index)
	// Removes element at index and moves the rest toward the front
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one"); // ["one"]
		list.add("two"); // ["one", "two"]
		list.add("three"); // ["one", "two", "three"]
		
		list.remove(0); // ["two", "three"]
		System.out.println(list);
		
		//list.remove(-1);  error ArrayIndexOutOfBoundsExceptio
		//list.remove(4);  error ArrayIndexOutOfBoundsExceptio
	}
}
