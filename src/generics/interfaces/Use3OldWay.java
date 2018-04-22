package generics.interfaces;

import java.util.List;

public class Use3OldWay implements Interface1{

	@Override
	public void print(Object in) {
		// TODO Auto-generated method stub
		
		//error can't use instanceof with generic type
//		System.out.println(null instanceof List<String>);
	}

}
