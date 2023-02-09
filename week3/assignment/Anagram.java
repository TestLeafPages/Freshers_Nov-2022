package assignment;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	 //*Declare a String 
		String text1 = "stops"; 
	// *Declare another String
		String text2 = "potss"; 
	// * a) Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length()) {
			System.out.println("String length are equal");
		}else {
			System.out.println("String length are not equal");
		}
		
	 //* b) Convert both Strings in to characters
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text1.toCharArray();
	 //* c) Sort Both the arrays
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
	// * d) Check both the arrays has same value


		//compare both arrays
	if(Arrays.equals(charArray, charArray2)) {
		System.out.println("Anagram");
	}else {
		System.out.println(" not Anagram");
	}
}
}
