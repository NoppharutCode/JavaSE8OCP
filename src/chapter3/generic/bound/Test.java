package chapter3.generic.bound;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	
	public static void test(ArrayList< ? extends ClassTestParent> var){
		var.remove(0);
	}
	
	public static void main(String[] args) {
//		ArrayList<ClassTest> t = new ArrayList<>();
//		t.add(new ClassTest());
//		test(t);
		String name = new String("rewareaw");
		System.out.println(name);
		LinkedList<String> list = new LinkedList<>();
	}
}
 