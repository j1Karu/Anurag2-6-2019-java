package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Waits {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Driver.get("https://www.google.com/");
	  WebElement searchbox = Driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	  Actions act = new Actions (Driver);
	  act.sendKeys("India").sendKeys(Keys.ENTER).build().perform();
	  Driver.findElement(By.xpath("//*[text()='Union Bank of India']")).click();
	  
		
		
	}

}
