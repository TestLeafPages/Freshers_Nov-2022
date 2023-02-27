package week6.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException, FileNotFoundException    {
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//Load the application url
	//https://www.facebook.com/
	driver.get("https://www.facebook.com/");
	//To maximize the screen
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
FileInputStream st=new FileInputStream("./data");
	//Click on Create a new Account button
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	//Enter first name
	try {
		driver.findElement(By.name("firstname12233453")).sendKeys("Test");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	//Enter the surName
	driver.findElement(By.name("lastname")).sendKeys("Leaf");
	
	
	WebElement ele = driver.findElement(By.id("month"));
	
	Select selectMonth=new Select(ele);
	//Best practice: using multilingual project , value is preferred 
	//selectMonth.selectByValue("5");
	
	//Best Practice: if you are Automate plaine English projects
	//selectMonth.selectByVisibleText("Dec");
	
	//Best Practice: while selecting random test data
	
	selectMonth.selectByIndex(0);
	
}
}
