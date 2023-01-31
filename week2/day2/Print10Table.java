package week2.day2;

public class Print10Table {
public static void main(String[] args) {
	//Declare the variable mul as 1
	int mul=1;
	//Declare the table length
	int input =10;
	
	for (int i = 1; i <=input; i++) {
		mul=i*input;
		//Print the 10th Table
		System.out.println(i+"*"+input+"="+mul);
	}
	
}
}
