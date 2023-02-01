package week2.day3;

import java.util.Arrays;

public class ToFindSenodLargestNumber {
public static void main(String[] args) {
	//Declare an Array
	int[] number= {4,5,6,7,8,1,2,3};
	//sort the Array
	Arrays.sort(number);
	//1,2,3,4,5,6,7,8
	//To get the Array length
	int len = number.length;
	
	//Print the Second Largest Number
	System.out.println(number[len-2]);
	
}
}
