package wek7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

        driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));


		Actions buider=new Actions(driver); 

		buider.dragAndDropBy(ele, 100, 100).perform();

		
	
	}
}
