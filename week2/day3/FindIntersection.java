package week2.day3;

public class FindIntersection {
public static void main(String[] args) {
	int[]  num1= {1,2,4,5,6,7,8,2};
	int[]  num2= {3,12,11,5,6,7,9};
	//output 5,6,7
	//Iterate the values 0 to num1length
	for (int i = 0; i < num1.length; i++) {
		//Iterate the values 0 to num2 length
		for (int j = 0; j < num2.length; j++) {
			//Compare the values if both Arrays are match
			if(num1[i]==num2[j])
				//Print the Intersection Number
			System.out.println(num1[i]);
		}
		
	}
	
	
}
}
