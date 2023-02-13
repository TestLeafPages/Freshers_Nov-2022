package javapgm;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] num= {1,2,4,7,6,3};
		//missing element
		
		Arrays.sort(num);
		
		int n = num.length+1;
		
		int sum=n*(n+1)/2;
		
		
		for (int i = 0; i < num.length; i++) {
			sum=sum-num[i];
		}
		System.out.println(sum);
	}
}
