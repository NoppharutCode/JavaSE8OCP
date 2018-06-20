package chapter3.methodReference._3.callInstanceMethodWithoutKnowInstance;

import java.util.function.Predicate;

public class Example1 {
	Predicate<String> lambda3 = s -> s.isEmpty();
	
	Predicate<String> methodRef3 = String::isEmpty;
	/*
		says the method that we want to call is declared in String. 
		It looks like a static method, but it isn’t. 
		Instead, Java knows that isEmpty is an instance method that does not take any parameters. 
		Java uses the parameter supplied at runtime as the instance on which the method is called.
	 */
}
