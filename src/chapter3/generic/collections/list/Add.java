package chapter3.generic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Add {
	// void add (E element)
	// Adds element to end
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("one"); //["one"]
		list.add("two"); //["one", "two"]
		list.add("three"); //["one", "two", "three"]
		System.out.println(list);
	}
}
