package assignment;

import java.util.Arrays;

public class MissingElement2 {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,4,7,6,8,2,3};
        //Initialize the sum1 as 0
		int sum1=0;
		//To iterate the loop 1 to  maximum number in above Array 
		for (int i = 1; i <=8; i++) {
			sum1=sum1+i;
		}
	System.out.println(sum1);
	int sum2=0;
	//
	for (int i = 0; i < arr.length; i++) {
		
		sum2=sum2+arr[i];
	}
		System.out.println(sum2);
		
		int sum3=sum1-sum2;
		System.out.println("Missing element is "+sum3);

	}
}
