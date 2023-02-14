package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");

    driver.manage().window().maximize();
    
    
    WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
    Select selectOptions=new Select(ele);
    
    List<WebElement> options = selectOptions.getOptions();
    
    for (int i = 0; i < options.size(); i++) {
		String text = options.get(i).getText();
		System.out.println(text);
	}
    
    
    

}
}
