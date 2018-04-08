package test;

import enumTest.Season;
import memberInnerClasses.Outer1;
import memberInnerClasses.Outer1.Inner1.Inner2;
import memberInnerClasses.Outer1.InnerInterface;

public class Test extends Outer1 implements InnerInterface {
	
	public void test(){
		Outer1 t1 = new Outer1();
		Test t2 = new Test();
	}
	
	public static void main(String[] args) {
		Outer1 t1 = new Outer1();
		Test t2 = new Test();
		Inner1 t3  = t1.new Inner1();
		Inner2 t4 = t3.new Inner2();
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
