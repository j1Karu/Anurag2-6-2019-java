package testdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestPractice
{
	WebDriver Driver;
	@Test (priority = 1)
	public void browser () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		//Driver.get("https://www.google.com");
		//Reporter.log("this is a google page", true);
	}
	
	@Test (priority = 2)
	public void search () {
		Actions act = new Actions (Driver);
		
		Driver.get("https://www.flipkart.com/");
	WebElement path = Driver.findElement(By.xpath("//*[@type='text']"));
		path.sendKeys("mobile");
		path.click();
		
		
		
	}	
	
}
	
 

