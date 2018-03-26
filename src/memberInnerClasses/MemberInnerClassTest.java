package memberInnerClasses;
//noticed

import memberInnerClasses.Outer1;
import memberInnerClasses.Outer1.Inner1;


public class MemberInnerClassTest{
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Inner1 inner = outer.new Inner1();
	}


}
