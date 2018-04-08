package staticInnerClasses;

public class Outer1 {
	static class Inner{
		public void print(){
			System.out.println("Hello Inner");
		}
	}
	
	public static void main(String[] args) {
		Inner in = new Inner();
		
	}
}
