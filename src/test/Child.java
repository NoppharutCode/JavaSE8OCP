package test;

public class Child extends Parent{
	public void print(){
		System.out.println("Child");
	}
	
	
	public Child(){	
		this(10);
	}
	
	public Child(int num){
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		Parent p1 = c;
		p1.print();
		
		Parent p2 =  new Parent();
		p2.print();
	}
}
