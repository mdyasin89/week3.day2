package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMostduplicateNumber {

	public static void main(String[] args) {
		String strInput = "abbaba";
		int count = 0;
		char strChar = strInput.charAt(0);
		Map<Character, Integer> mapObj = new HashMap<Character, Integer>();
		char[] strArray = strInput.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			mapObj.put(strArray[i], mapObj.getOrDefault(strArray[i], 0) + 1);
			if (mapObj.get(strArray[i]) > count) {
				count = mapObj.get(strArray[i]);
				strChar = strInput.charAt(i);
			}
		}
		System.out.println("Most Duplicate Character is " + strChar + " and its occurance " + count + "  times");

	}

}
