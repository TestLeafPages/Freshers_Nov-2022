package assignment;

public class Palindrome {
public static void main(String[] args) {
	
	 //Pseudo Code
	
	 // a) Declare A String value as"madam"
	String txt="madam";
	 
	 // b) Declare another String rev value as ""
	String rev="";
	 // c) Iterate over the String in reverse order
	for(int i=txt.length()-1;i>=0;i--) {
		// d) Add the char into rev
		rev=rev+txt.charAt(i);
	}
	 
	 // e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 if(txt.equals(rev))System.out.println("Palindrom");
	 else System.out.println("Not a palindrom");
	 
}
}
