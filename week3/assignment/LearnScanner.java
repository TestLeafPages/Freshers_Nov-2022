package assignment;

import java.util.Scanner;

public class LearnScanner {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a String ");
	//read the user input
	String nextLine = scan.nextLine();
	//print the input
	System.out.println(nextLine);
}
}
