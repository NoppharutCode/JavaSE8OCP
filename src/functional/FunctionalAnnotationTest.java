package functional;

@FunctionalInterface
public interface FunctionalAnnotationTest {
	public abstract void test();
	
	default void print(){
		System.out.println("Default");
	}
	
	public static void testStatic(){
		System.out.println("test");
	}
}
