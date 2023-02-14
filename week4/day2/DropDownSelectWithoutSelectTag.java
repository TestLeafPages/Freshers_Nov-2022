package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectWithoutSelectTag {
public static void main(String[] args) throws InterruptedException {
EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");

    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[text()='PostMan']")).click();
    
    

}
}
