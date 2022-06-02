package actionclass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelenium {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		Actions act = new Actions (Driver);
		WebElement Searchbox = Driver.findElement(By.xpath("//*[@title='Search']"));
		act.click(Searchbox).sendKeys("selenium").build().perform();
		Thread.sleep(2000);
	List<WebElement> MultipleResult = Driver.findElements(By.xpath("//*[@class='erkvQe']//li"));
		
		for (WebElement result:MultipleResult) {
			
		String a1	= result.getText();
		System.out.println(a1);
		
		if (a1.equals("selenium webdriver"))
				{
			
			result.click();
			break;
			
		}
		
			

}
}
}
