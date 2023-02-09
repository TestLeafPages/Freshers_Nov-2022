package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	
	//Launch Chrome Browser
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//Load the application url
	//https://www.facebook.com/
	driver.get("http://leaftaps.com/opentaps/control/main");
	//To maximize the screen
	driver.manage().window().maximize();
	//Enter the username as Demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Enter the password as CRMSFA
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//verify the page
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	//Click on crmsfa hyper link
	driver.findElement(By.linkText("CRM/SFA")).click();
	//click on leads tap
	driver.findElement(By.linkText("Leads")).click();
	//click on create lead
	driver.findElement(By.partialLinkText("Lead")).click();
	
	
	
	
}
}
