package InstanceVariable;

public class Lion extends Animal{
	String name = "Leo";
	
	public void printName(){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Animal l = new Lion();
		l.printName();
	}
}
