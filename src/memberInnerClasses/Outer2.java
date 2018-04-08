package memberInnerClasses;

public class Outer2 {
	
	private int x = 10;
	
	public class Inner1{
		private int x = 20;
		public class Inner2{
			private int x = 30;
			public void print(){
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(Inner1.this.x);
				System.out.println(Outer2.this.x);
			}
		}
	}
	
	public void test(){
		Inner1 inner1 = new Outer2.Inner1();
		//Inner1 inner1= new Outer2().new Inner1();
//		Inner1.Inner2 inner2 = new Outer2.Inner1().new Inner2();
		Outer2.Inner1.Inner2 inner2 = inner1.new Inner2();
//		inner2.print();s
	}
	
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Inner1 i;
		outer2.test();
	}
}
