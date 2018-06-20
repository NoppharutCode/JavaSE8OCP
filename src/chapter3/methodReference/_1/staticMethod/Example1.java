package chapter3.methodReference._1.staticMethod;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
		Consumer<List<String>> lambda1 = list -> Collections.sort(list);
		
		Consumer<List<String>> methodRef1 = Collections::sort;
		
		/*
		 We know that the sort method is overloaded. 
		 How does Java know that we want to call the version that omits the comparator? 
		 With both lambdas and method references, Java is inferring information from the context. 
		 In this case, we said that we were declaring a Consumer, which takes only one parameter. 
		 Java looks for a method that matches that description
		 */
	}
}
