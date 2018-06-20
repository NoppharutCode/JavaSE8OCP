package test;

public class Parent {
		public static void print(){
			System.out.println("Static Parent");
		}
		
		private void printPrivate(){
			System.out.println("Print Private");
		}
		
		public static void main(String[] args) {
			Child c = new Child();
			Parent p  = c;
			p.printPrivate();
		}
}
