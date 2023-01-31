package week2.day1;

public class Calculator {
	public void add(int a, int b) {
		//int  a=10;
		//int b=20;
		int c=a+b;
		System.out.println(c);

	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);

		
	}
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a, int b) {
		int c=a/b;
		System.out.println(c);
	}
	

	
public static void main(String[] args) {
	
	  Calculator cal=new Calculator(); 
	  cal.add(10,10); 
	  cal.sub(20,50);
	  cal.mul(50,100);
	  
	  cal.div(100,100);
	 
}
}
