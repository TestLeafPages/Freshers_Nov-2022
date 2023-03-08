package wek7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drappable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

        driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));


		Actions buider=new Actions(driver); 

		buider.dragAndDrop(source, destination).perform();
       
		String cssValue = destination.getCssValue("background");
		System.out.println(cssValue);
		
	
	}
}
