package week2.day1;

public class Calculator2 {
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public void sub(int total, int b) {
		int c=total-b;
		System.out.println(c);
	}
	

	
public static void main(String[] args) {
	
	  Calculator2 cal=new Calculator2(); 
	int total = cal.add(100,100); 
	 System.out.println(total);
	 cal.sub(total, 50);
}
}
