package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		Integer[] valueArr = { 1, 2, 3, 4, 7, 6, 8 }; // declare in Integer class array
		Arrays.sort(valueArr); // sorting the array
		List<Integer> listArr = new ArrayList<Integer>(Arrays.asList(valueArr));// converting in to list
		for (int i = 0; i < listArr.size(); i++) {
			int j=i+1;//index start with 0 , array value start from 1,so assigning i+1 
			if (listArr.get(i) != j) { // if iterator variable not equal with the array value print it
				System.out.println("Missing Element is " + j);
				break;
			}
		}

	}

}
