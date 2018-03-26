package anonymousInnerClasses;

public class InterfaceTest {
	private interface Interface1{
		void print();
	}
	
	public void print(){
		Interface1 t = new Interface1(){
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
	public static void print(Interface1 i){
		
	}
	
	public static void main(String[] args) {
		InterfaceTest.print(new Interface1(){
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
