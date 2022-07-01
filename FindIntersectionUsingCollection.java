package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingCollection {

	public static void main(String[] args) {
		int[] arrayFirst = { 3, 2, 11, 4, 6, 7 }; // normal Array
		Integer[] arraySecond = { 1, 2, 8, 4, 9, 7 };// Wrapper class
		List<Integer> listfirst = new ArrayList<Integer>();
		List<Integer> listInterSection = new ArrayList<Integer>();
		for (int i = 0; i < arrayFirst.length; i++) {
			listfirst.add(arrayFirst[i]); // converting normal array in to list
		}
      //@here trying both concept for my learning (data type (int) and (Integer) wrapper class
		List<Integer> listSecond = new ArrayList<Integer>(Arrays.asList(arraySecond));// converting Integer wrapper class array in to list																				
		for (int i = 0; i < listfirst.size(); i++) {
			for (int j = 0; j < listSecond.size(); j++) {
				if (listfirst.get(i) == listSecond.get(j)) {
					listInterSection.add(listfirst.get(i));
				}
			}
		}
		System.out.println("Duplicate value based on first Array is " + listInterSection);
	}

}
