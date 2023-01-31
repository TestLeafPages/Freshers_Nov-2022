package week2.day2;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		a=a+b;
		//10+20   30
		//30-20
		b=a-b;
		//b=10
		//30-10
		a=a-b;
		
		
		System.out.println("a is "+a);
		System.out.println("b is "+b);

	}

}
