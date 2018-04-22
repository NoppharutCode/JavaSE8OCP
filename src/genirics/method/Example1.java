package genirics.method;

public class Example1<T>{
	
	public <U> void print(U t){
		System.out.println(t);
	}
	
	public void t(Object s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Example1<String> e = new Example1<>();
		e.<String>print("Hello");
		e.print(32131231);
		e.print(null);
		e.t(12312);
		e.t(new Integer(23));
	}
}
