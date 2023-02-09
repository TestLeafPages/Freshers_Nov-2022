package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadXpath {
public static void main(String[] args) {
	//Launch Chrome Browser
	ChromeDriver driver=new ChromeDriver();
	//Load the Application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//Maximize the Browser
	driver.manage().window().maximize();
	//Enter the username as Demosalesmanager
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	//Enter the password as crmsfa
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Crmsfa");
	//Click on Login Button
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//Click on CRMSFA  hyper link
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	
	
}
}
