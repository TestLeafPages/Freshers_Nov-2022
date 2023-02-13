package javapgm;

import java.util.Scanner;

public class ReverseString{

public static void main(String[] args){

//Declare a String
 //String text="Mani";
//Expected Output
// i,n,a,M
Scanner scan=new Scanner(System.in);
System.out.println("Enter your input");
String val = scan.nextLine();
//Conver the String into Character
char[] reverse= val.toCharArray();

//reverse[0]=M;
//reverse[1]=a;
//reverse[2]=n;
//reverse[3]=i;

//Itearte the character  using reverse for loop
for(int i=reverse.length-1;i>=0;i--){

//Print the character
System.out.println(reverse[i]);

}
}
}