package assignment;

import java.util.Scanner;

public class ReverseAStringUsingScanner {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the input");
	String nextLine = scan.nextLine();
	//Convert the String into character
	char[] charArray = nextLine.toCharArray();
	//iterate the character using reverse for loop
	for (int i = charArray.length-1; i>=0; i--) {
		//Print the character
		System.out.println(charArray[i]);
	}
	
	
	
}
}
