package anonymousInnerClasses;

public class StaticTest {
	public static class StaticInner{
		public void print(){
			System.out.println("Static Inner");
		}
	}
	
	public abstract static class StaticAbstractInner{
		public void print(){
			System.out.println("Static Abstract Inner");
		}
	}
	
	public static void print(StaticInner i){
		i.print();
	}
	
	public static void print(StaticAbstractInner i){
		i.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest.print(new StaticInner(){
			public void print(){
				System.out.println("Static Inner From main");
			}
		});
		
		
		StaticTest.print(new StaticAbstractInner(){
			public void print(){
				System.out.println("Static Abstract Inner From main");
			}		
		});
	}

}
