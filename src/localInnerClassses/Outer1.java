package localInnerClassses;

public class Outer1 {
	enum Test{
		name, onare
	}
	
	private int num = 30;
	
	public void print20(){
		System.out.println(20);

	}
	
	public static void printStatic(){
		System.out.println("static");
	}
	
	public void testAccess(){
		class InnerLocal{
			private int num = 10;
			public void print(){
				System.out.println(num);
				System.out.println(Outer1.this.num);
				this.print20();
				printStatic();
			}
			
			public void print20(){
				System.out.println(20 + "inner");
			}
		}	

		InnerLocal in = new InnerLocal();
		in.print();	
	}
	
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
	}
}
