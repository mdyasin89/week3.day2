package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrinitDuplicatesInList {

	public static void main(String[] args) {
		Integer[] arrDuplicateValues = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20, 14 };
		List<Integer> listObj = new ArrayList<Integer>(Arrays.asList(arrDuplicateValues)); // storing values in to list
		Set<Integer> duplicateValues = new TreeSet<Integer>(); // declaring set object
		Set<Integer> setObj = new LinkedHashSet<Integer>();// declaring set object
		for (int i = 0; i < listObj.size(); i++) {
			boolean isDuplicate = setObj.add(listObj.get(i)); // adding in to set and get the boolean true value its
																// added
			if (!isDuplicate) {// if the boolean value false add to another set
				duplicateValues.add(listObj.get(i)); // adding duplicate in to the set
			}
		}
		System.out.println("Duplicate Values are " + duplicateValues);
		// below is the code explained in doubt clear session
		/*
		 * Set<Integer> setObj2 = new LinkedHashSet<Integer>(); for(Integer
		 * eachNumber:listObj) {
		 * if((listObj.indexOf(eachNumber))!=(listObj.lastIndexOf(eachNumber))) {
		 * setObj2.add(eachNumber); } }
		 * 
		 * System.out.println("Duplicate Values are " + setObj2);
		 */

	}

}
