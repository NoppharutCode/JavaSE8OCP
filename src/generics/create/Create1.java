package generics.create;

public class Create1<T, TFSD>{
	public T instanceVariable1;
	public TFSD instanceVariable2;
	public final T finalInstanceVariable1 = null;
	
	//Error can't use new operator
	//public final T finalInstanceVariable2 = new T();
	
	//Error because static
	//public static T staticInstanceVariable; 
	
	//Error because static
//	public static void print(T in){
//		
//	}
	
	public void print(T in){
		T localVariable;
	}
	
	public T returnT1(){
		T localVariable = null;
		return localVariable;
	}
}
