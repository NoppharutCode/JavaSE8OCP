package test;

public class Child extends Parent{
	public static void print(){
		System.out.println("Static Child");
	}
	public static void main(String[] args) {
		Child.print();
		Child c = new Child();
		Object o = c;
		String s = (String)o;
	}
}
