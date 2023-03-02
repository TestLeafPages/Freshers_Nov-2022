package week6.day4;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] num= {5,6,8,9,1,4,5,2,2,4,};
	//5,2,4
	
	Set<Integer> values=new TreeSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		values.add(num[i]);
	}
	
	System.out.println(values);
	
}
}
