package genirics.method;

public class Example2 {
	public <T> void  print1(T in){
		
	}
	
	public final <T> void  print2(T in){
		
	}
	
	public static <T> void  print3(T in){
		System.out.println("print3");
	}
	
	public final static <T> void  print4(T in){
		
	}
	
	//eror becase can't use abstract on class
	
//	public  abstract <T> void  print5(T in){
//		
//	}
	
	public static void main(String[] args) {
		Example2.print3(new Object());
		Example2.<String>print3("String");
		
		//error invalid type
		//Example2.<String>print3(new Integer(10));
	}
}
