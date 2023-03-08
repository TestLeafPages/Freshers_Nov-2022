package wek7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
	

      Actions buider=new Actions(driver); 
      
      buider.pause(20).moveToElement(ele).perform();
	
      driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']")).click();
}
}
