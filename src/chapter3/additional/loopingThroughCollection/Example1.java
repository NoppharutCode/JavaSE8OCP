package chapter3.additional.loopingThroughCollection;

import java.util.Arrays;
import java.util.List;

public class Example1 {
	
	public static <T>  T test(T test) {
		return test;
	}
	
	public static void main(String[] args) {
		// traditional way
		List<String> cats = Arrays.asList("Annie", "Ripley");
		for(String cat : cats) {
			System.out.println(cat);
		}
		
		//lambdas in one line
		cats.forEach( cat -> System.out.println(cat));
		
		//method ref
		cats.forEach(System.out::println);
	}
}	
