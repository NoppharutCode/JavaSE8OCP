package chapter3.methodReference._4.constructorReference;


import java.util.function.Supplier;

public class Example1 {
	Supplier<String> lambda4 = () -> new String("Hello");
	
	Supplier<String> methodRef4 = String::new; 
	
	/*
	 A constructor reference is a special type of method reference that uses new instead of a method, 
	 and it creates a new object.
	 */
}
