package week6.exception;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;

public class ExceptionHandling2 {

	public static void main(String[] args) throws InvalidSelectorException, ArrayIndexOutOfBoundsException {
		
		int a=10;
		int b=0;
		int c = 0;
		int[] num= {1,2,3,4,5,6,7};
		try {
		System.out.println(num[7]);
		}
		
		finally {
			System.out.println("Exception handling");
		}
		
	}
}
