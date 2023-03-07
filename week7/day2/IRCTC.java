package week7.day2;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IRCTC {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./snap/001.png");
	
	//FileUtils.copyFile(source, dest);
	FileHandler.copy(source, dest);
	WebElement ele = driver.findElement(By.xpath("//a[text()=' BUSES ']"));
File source1 = ele.getScreenshotAs(OutputType.FILE);
	
	File dest1=new File("./snap/002.png");
	
	//FileUtils.copyFile(source1, dest1);
	
}
}
