package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownOptions {
public static void main(String[] args) {
	//Launch Chrome Browser
			ChromeDriver driver=new ChromeDriver();
			//EdgeDriver driver=new EdgeDriver();
			//Load the application url
			//https://www.facebook.com/
			driver.get("http://leaftaps.com/opentaps/control/main");
			//To maximize the screen
			driver.manage().window().maximize();
			//Enter the username as Demosalesmanager
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//Enter the password as CRMSFA
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Click login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//verify the page
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			//Click on crmsfa hyper link
			driver.findElement(By.linkText("CRM/SFA")).click();
			//click on leads tap
			driver.findElement(By.linkText("Leads")).click();
			//click on create lead
			driver.findElement(By.partialLinkText("Create")).click();
			//enter the company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kratos");
			//enter the first name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujan");
			//enter the last name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Darwin");
			//enter the salutation
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
			
			
			WebElement dropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select industry=new Select(dropDown);
			
			List<WebElement> options = industry.getOptions();
			
			for (int i = 0; i < options.size(); i++) {
				String text2 = options.get(i).getText();
				System.out.println(text2);
			}
			
			
			
			
			//click the class lead submit button
			driver.findElement(By.className("smallSubmit")).click();
			
}
}
