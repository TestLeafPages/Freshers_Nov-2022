package wek7.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpath {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-Maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://erail.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);
	
	WebElement destination = driver.findElement(By.id("txtStationTo"));
	destination.clear();
	destination.sendKeys("MDU",Keys.ENTER);
	
	//uncheck the sort on date
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	
	List<WebElement> trainNumber = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]"));
	
	
	for (int i = 2; i <=trainNumber.size()-1; i++) {
	
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[1]/a")).getText();

	   System.out.println(text);
	}
	
	
	
	
	
}
}
