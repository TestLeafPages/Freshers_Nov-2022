package assignment;

public class Palindrome2 {
public static void main(String[] args) {
	//Declare a String input values as madam
	String input="madam";

	//Conver the String into Character
	char[] charArray=input.toCharArray(); 
	//Declare a empty String
	String rev="";
	//iterate character using reverse for loop
	for(int i=charArray.length-1;i>=0;i--){
	     rev=rev+charArray[i];
	     System.out.println(rev);
	}
	//To compare the both String
	if(input.equals(rev)){
	System.out.println("The given String is Palindrome");
	}
	else{
	System.out.println("The given String is not Palindrome");

	}
}
}
