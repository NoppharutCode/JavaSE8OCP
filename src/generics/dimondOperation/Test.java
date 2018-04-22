package generics.dimondOperation;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> t1 = new ArrayList<>();
		List<String> t2 = new ArrayList();
		t1.add("ONE");
		System.out.println(t1.get(0).toLowerCase());
		t2.add("TWO");
		System.out.println(t2.get(0).toLowerCase());
	}
}
