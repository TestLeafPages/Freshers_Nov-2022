package week7.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml;jsessionid=node02yj6qd29ioto13mzbpee4dlf9144459.node0");
	driver.manage().window().maximize();
	
	
	String parentWindow = driver.getWindowHandle();
	String title = driver.getTitle();
	System.out.println("Parent Window "+title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Parent url "+currentUrl);
	//System.out.println(windowHandle);
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	Set<String> openWindow = driver.getWindowHandles();
	System.out.println(openWindow.size());
	List<String> childWindow=new ArrayList<String>(openWindow);
	driver.switchTo().window(childWindow.get(1));
	String title2 = driver.getTitle();
	System.out.println("child Window "+title2);
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println("child url "+currentUrl2);
	
	//driver.switchTo().window(parentWindow)
	
	
	
}
}
