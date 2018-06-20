package chapter3.addtional.removeCondition;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		/*
		 	boolean removeIf( Predicate <? super E > filter)
		 */
		List<String> list = new ArrayList<>();
		list.add("Application");
		list.add("Hawk");
		System.out.println(list); // ["Application", "Hawk"]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // ["Hawk"]
	}
}
