package data;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyPayment {
public static void main(String[] args) {
	Payment pay=new Payment();
	
	pay.setCreditCardNumber("1111 1111 1111");
	System.out.println(pay.getCreditCardNumber());
	
}
}
