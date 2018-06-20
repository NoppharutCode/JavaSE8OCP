package chapter3.generic.collections.list;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add(null);
		
		Queue<String> queue = new ArrayDeque<>();
//		queue.add(null);
		Collections.sort(list);
		TreeMap<String, String> map = new TreeMap<>();
		
	}
}
