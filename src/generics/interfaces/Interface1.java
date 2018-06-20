package generics.interfaces;

public interface Interface1 <T>{
	public void print(T in);
	
	public default T test(T in){
		//error can't use new operator
		//in = new T();
		return in;
	}
	
	public static  void testStatic(){
		
	}
	
	//error because can't use T (generic type) in static member
//	public static T testStatic(){
//		T in = null;
//	}
}
