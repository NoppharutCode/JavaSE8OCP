package chapter3.addtional.updatingAllElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("T@1");
		list.add("T@2");
		list.add("T@3");
		System.out.println(list); // ["T@1", "T@2", "T@3"]
		list.replaceAll( s -> s.replace("@", "H"));
		System.out.println(list); //["TH1", "TH2", "TH3"]
		
		List<Integer> listNum = Arrays.asList(1, 2, 3);
		System.out.println(listNum); // [1, 2, 3]
		listNum.replaceAll(x -> x*2);
		System.out.println(listNum); // [2, 4, 6]
	}
}
