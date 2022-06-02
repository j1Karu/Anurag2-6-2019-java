package testdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass2 {
	WebDriver Driver;
	
	@Test(priority = 10)
	public void google () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		Driver.findElement(By.xpath("//*[@type='text']"));
		Actions act = new Actions (Driver);
		act.sendKeys("velocity pune").sendKeys(Keys.ENTER).build().perform();
		
	}
	
	

}
