package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {
	public static void main(String[] args) {
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//Load the application url
		
		driver.get("https://www.facebook.com/");
		//To maximize the screen
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Click on Create a new Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		By locator = By.name("firstname");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Test");
		//Enter the surName
		driver.findElement(By.name("lastname")).sendKeys("Leaf");

	}
}
