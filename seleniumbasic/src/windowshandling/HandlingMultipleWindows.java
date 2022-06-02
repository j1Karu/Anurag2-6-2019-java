package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleWindows {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		WebElement password = Driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
		Actions act = new Actions (Driver);
		act.keyDown(Keys.CONTROL).click(password).keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).click(password).keyUp(Keys.CONTROL).build().perform();
	Set<String> allid = Driver.getWindowHandles();
	int i = 0;
	int number = allid.size();
	String Array [] = new String [number];
		
		for (String Ar :allid) {
			
			Array[i]= Ar;
			i++;
		}
		
		Driver.switchTo().window(Array[1]);
		
		
	}

}
