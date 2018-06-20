package chapter3.additional.computeIfPresent;

import java.util.HashMap;
import java.util.Map;

public class FunctionReturnNull {
	
	public void print() {

	}
	public static void main(String[] args) {
		Map < String, Integer > counts = new HashMap < >(); 
		counts.put("Jenny", 1); 
		counts.computeIfAbsent(" Sam", k -> null);
		System.out.println(counts); // {Jenny=1}
	}
}
