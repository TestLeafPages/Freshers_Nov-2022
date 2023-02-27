package week6.exception;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;

public class ExceptionHandling {

	public static void main(String[] args) throws InvalidSelectorException, ArrayIndexOutOfBoundsException {
		
		int a=10;
		int b=0;
		int c = 0;
		int[] num= {1,2,3,4,5,6,7};
		
		//index
		try {
			c = a/b;
			try {
				System.out.println(num[7]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
		
		
		
		System.out.println("Exception Handling");
	}
}
