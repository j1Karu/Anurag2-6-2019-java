package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver D = new ChromeDriver ();
		D.manage().window().maximize();
		Thread.sleep(5000);
		D.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	WebElement abc	= D.findElement(By.id("txtUsername"));
	
	abc.sendKeys("Admin");
	D.findElement(By.name("txtPassword")).sendKeys("admin123");
	D.findElement(By.id("btnLogin")).click();
	D.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	
	for (int i = 1; i<48; i++) {
		D.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
	}
	
	
	
	
		

		
	
		
	  
	}

}



