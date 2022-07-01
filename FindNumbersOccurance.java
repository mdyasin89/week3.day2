package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurance {

	public static void main(String[] args) {
		Integer[] values = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		Map<Integer, Integer> mapObj = new TreeMap<Integer, Integer>(); // Declaring Map
		for (Integer eachNumber : values) { // iterating each values from the array
			if (mapObj.containsKey(eachNumber)) { // check its already exists in the map by passing the array values as Key
				mapObj.put(eachNumber, mapObj.get(eachNumber) + 1);// adding the array value (from Integer array) as map key and map value as iterate value by finding each time
			} else {
				mapObj.put(eachNumber, 1);// adding the array value (from Integer array) as map key and map value as one(1) value by first time
			}
		}

		System.out.println("Number of Occurance of each integer is " + mapObj);
	}

}
