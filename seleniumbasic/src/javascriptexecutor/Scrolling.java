package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://zoom.us/signup");
Driver.findElement(By.xpath("//*[@id='select-0']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		Driver.findElement(By.xpath("//*[@id='select-0']")).click();
		WebElement decmonth = Driver.findElement(By.xpath("//*[@id='select-item-select-0-11']"));
	 JavascriptExecutor js = (JavascriptExecutor)Driver;
	 js.executeScript("argument[0].click();", decmonth);
		
	}

}
