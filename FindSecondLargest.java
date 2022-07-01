package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] valueArr = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(valueArr); //ascending the numbers
		List<Integer> listArr = new ArrayList<Integer>(Arrays.asList(valueArr));//storing in to the list
		int secondLargestNumber = listArr.get(listArr.size()-2);//second largest number index should be listArr.size()-2
		System.out.println(secondLargestNumber);

	}

}
