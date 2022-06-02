package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signup");
		WebElement abc = driver.findElement(By.xpath("//*[@id='select-0']"));
		abc.click();
		Thread.sleep(1000);
		abc.sendKeys("feb");
		
		//driver.findElement(By.xpath("//*[@class='citySelection destinationCitySelection'] ")).sendKeys("mumbai");
		//driver.findElement(By.xpath("//*[@id='airSubmitButtonId'] ")).click();
		
	
	}

}
