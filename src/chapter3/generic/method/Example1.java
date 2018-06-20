package chapter3.generic.method;

public class Example1 {
	
	public static <T> void staticMethod(){
		System.out.println("static method");
	}
	
	public <T> void instanceMethod(){
		System.out.println("instance method");
	}
	
	
	public static <T> T staticReturn(T object){
		return object;
	}
	
	public static void main(String[] args) {
		Example1.<String>staticMethod();
		Example1 e = new Example1();
		e.instanceMethod();
	}
}
