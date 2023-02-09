
package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	//Launch Chrome Browser
			ChromeDriver driver=new ChromeDriver();
			//EdgeDriver driver=new EdgeDriver();
			//Load the application url
			//https://www.facebook.com/
			driver.get("https://www.facebook.com/");
			//To maximize the screen
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Click on Create a new Account button
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//Enter first name
			driver.findElement(By.name("firstname")).sendKeys("Test");
			//Enter the surName
			driver.findElement(By.name("lastname")).sendKeys("Leaf");
			
			
			WebElement ele = driver.findElement(By.id("month"));
			
			Select selectMonth=new Select(ele);
			
			//selectMonth.selectByValue("5");
			
			//selectMonth.selectByVisibleText("Dec");
			
			selectMonth.selectByIndex(0);
			
}
}
