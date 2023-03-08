package wek7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnChromeOptions {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	//options.setHeadless(true);
	options.addArguments("--disable-notifications","---start--Maximized","--incognito");
	ChromeDriver driver=new ChromeDriver(options);
	//ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	
	System.out.println("Running Successfully");
	
}
}
