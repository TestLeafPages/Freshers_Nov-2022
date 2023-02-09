package assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,4,7,6,8,2,3};

		// Sort the array	
        Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
   for (int i = 0; i < arr.length; i++) {
	// check if the iterator variable is not equal to the array values respectively
    if(arr[i]!=i+1) {
    	// print the number
    	System.out.println(i+1);
    	// once printed break the iteration
    	break;
    }
}
		
		

		

	}
}
