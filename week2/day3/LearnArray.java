package week2.day3;

public class LearnArray {
	public static void main (String[] args){
         //Declare an Array
		int[] number={1,2,3,4,5,6,7,8};
        // to find size of an Array
		int length = number.length;
		//iterate the values from o to Array length
		for(int i=0;i<length;i++){
         //Print the number
		System.out.println(number[i]);
		}
		for (int i = number.length-1;i>=0; i--) {
			System.out.println(number[i]);
		}
		
		}
}
