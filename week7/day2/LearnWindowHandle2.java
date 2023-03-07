package week7.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle2 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml;jsessionid=node02yj6qd29ioto13mzbpee4dlf9144459.node0");
	driver.manage().window().maximize();
	
	String parentWindow = driver.getWindowHandle();
	String title2 = driver.getTitle();
	System.out.println(title2);	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	Set<String> openedWindow = driver.getWindowHandles();
	
	List<String> childWindow=new ArrayList<String>(openedWindow);
	
	driver.switchTo().window(childWindow.get(1));
	
	String title = driver.getTitle();
	System.out.println(title);	
	
	driver.close();
	
	
}
}
