package localInnerClassses;

public class ExampleInBook {
	private int length = 5;
	
	public void calculate(){
		int width = 20;
		class Inner{
			public void multiply(){
				System.out.println(length * width);
			}
		}
		// width = 30;  when don't comment  then complie error because width isn't effectively final
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		ExampleInBook e = new ExampleInBook();
		e.calculate();
	}
}
