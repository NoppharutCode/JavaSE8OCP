package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayASListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = { 1, 2, 3, 4, 5};
		List<Integer> numList = Arrays.asList(nums);
		System.out.println(numList);
		nums[0] = 10;
		System.out.println(numList);
	}

}
