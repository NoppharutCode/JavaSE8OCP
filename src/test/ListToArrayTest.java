package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrayOlds = {"one", "two"}; 
//		
		List<String> list = Arrays.asList("one");
//		list.add("one");
//		list.add("two");
//		System.out.println(list);
		String[] arrays = (String[])list.toArray();
		
	}	

}
