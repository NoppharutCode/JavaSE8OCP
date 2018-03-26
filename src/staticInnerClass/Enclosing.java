package staticInnerClass;

public class Enclosing {
	
	public int enclosing = 10;
	
	static class Nested{
		private int price = 6;
		private static int test = 10;
		
	
	}
	
	public void print(){
	
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
}
