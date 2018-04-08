package anonymousInnerClasses;

public class AbstractTest {
	private abstract class Abstract1{
		public abstract void abstractTest();
	}
	
	public void test(){
		Abstract1  ab1 = new Abstract1(){
			@Override
			public void abstractTest() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public static void print(Abstract1 ab1){
		
	}
	
	public static void main(String[] args) {
		AbstractTest.print(new AbstractTest(). new Abstract1(){

			@Override
			public void abstractTest() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
