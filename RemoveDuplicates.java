package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String strText="We learn java basics as part of java sessions in java week1";
		String[] strArray=strText.split(" ");
		String strIdenticalText="";
		Set<String> setObject= new LinkedHashSet<String>();//it will add the string as FCFS ,so will be adding string in without duplicate in as we gave
		for(int i=0;i<strArray.length;i++)
		{
			setObject.add(strArray[i]);//set will add only unique values 
		}
		for(String eachWord:setObject)
		{
			strIdenticalText= strIdenticalText+eachWord+" ";//appending each text in the set in to string value
		}
		System.out.println(setObject);
		System.out.println(strIdenticalText);

	}

}
