package chapter3.generic.bound;

import java.util.ArrayList;

public class Declare {
	public static void main(String[] args) {
		ArrayList<?> list1 = new ArrayList<String>();
		//list1.add("String"); compiler error
		ArrayList<? extends String> list2 = new ArrayList<String>();
		for(String i : list2){
			System.out.println(i);
		}

		ArrayList<? extends Object> list3 = new ArrayList<Object>();
//		for(String i : list3){
//			System.out.println(i);
//		}
		
		//list2.add("STring"); compiler errors
		ArrayList<? super String> list4 = new ArrayList<String>();
		list4.add("String");
		ArrayList<? super String> list5 = new ArrayList<Object>();
		list5.add("String");
		for(Object i : list4 ){
			System.out.println(i);
		}
		for(Object i : list5 ){
			System.out.println(i);
		}
		
		ArrayList<String> list6 = new ArrayList<>();
		list6.add("one");
		for(String i : list6){
			System.out.println(i);
		}
		for(Object i : list6){
			System.out.println(i);
		}
	}
}
