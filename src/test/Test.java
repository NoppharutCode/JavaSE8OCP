package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import enumTest.Season;
import memberInnerClasses.Outer1;
import memberInnerClasses.Outer1.Inner1.Inner2;
import memberInnerClasses.Outer1.InnerInterface;

public class Test extends Outer1 implements InnerInterface {
	
	class Temp {
		String s;
		
		Temp(String a) {
			s = a;
		}
	}
	
	public static void testAnonymouse(Abstract1 t){
		t.print();
	}
	
	public void test(){
		Outer1 t1 = new Outer1();
		Test t2 = new Test();
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		UnaryOperator<String> test;
//		Outer1 t1 = new Outer1();
//		Test t2 = new Test();
//		Inner1 t3  = t1.new Inner1();
//		Inner2 t4 = t3.new Inner2();
//		Abstract1 t = new Abstract1(){
//			public void print(){
//				System.out.println("test 1");
//			}
//		};
//		t.print();
//		testAnonymouse(new Abstract1() {
//			
//			@Override
//			public void print() {
//				// TODO Auto-generated method stub
//				System.out.println("test  send parameter");
//			}
//		});
		
		
		
		List<Temp> list = new ArrayList<>();
		list.add( new Test().new Temp("STring"));
		list.add(new Test().new Temp("One"));
		
		for(Temp s : list) {
			s.s = "Hello World";
		}
		System.out.println(list.size());
	}
	
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
