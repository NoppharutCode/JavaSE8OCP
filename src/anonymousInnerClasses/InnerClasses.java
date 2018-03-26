package anonymousInnerClasses;

public class InnerClasses {
	public class Inner{
		public void print(){
			System.out.println("Inner");
		}
	}
	
	
	public void printOuter(){
		Inner i = new Inner(){
			public void print(){
				System.out.println("Change Inner");
			}
		};
		
		i.print();
	}
	
	public static void printOuter(Inner i){
		i.print();
	}
	
	
	public static void main(String[] args) {
		InnerClasses c = new InnerClasses();
		c.printOuter();
		InnerClasses.printOuter(new InnerClasses().new Inner(){
			public void print(){
				System.out.println("From main");
			}
		});
		
		
	}
}
