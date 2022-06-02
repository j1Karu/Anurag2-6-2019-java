package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver D = new ChromeDriver ();
		D.manage().window().maximize();
		D.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		D.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	String Parent	= D.getWindowHandle();
	System.out.println(Parent);
Set<String> child	= D.getWindowHandles();
 for (String id:child) {
	 
	 if (!id.equals(Parent)) {
		 
		 D.switchTo().window(id);
	 }
 }
		
		
		
	}

}
