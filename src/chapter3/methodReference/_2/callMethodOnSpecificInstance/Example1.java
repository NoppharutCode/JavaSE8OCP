package chapter3.methodReference._2.callMethodOnSpecificInstance;

import java.util.function.Predicate;

public class Example1 {
	String word = "Hello";
	Predicate<String> lambda2 = s -> word.startsWith(s);
	
	Predicate<String> methodRef2 = word::startsWith;
	
	/*
		shows that we want to call string.startsWith() and pass a single parameter to be supplied at runtime. 
		This would be a nice way of filtering the data in a list.
	*/
}
