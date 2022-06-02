package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/signup");
	List<WebElement> d2 = d1.findElements(By.xpath("//select[@id='day']//option"));
		for (WebElement d3 : d2) {
			
			String a1 = d3.getText();
			
			System.out.println(a1);
			
			if (a1.equals("11")) {
				d3.click();
			
			}
			
			
		}
		
		List<WebElement> d5 = d1.findElements(By.xpath("//select[@id='month']//option"));
		for (WebElement d6 : d5) {
			
			String a2 = d6.getText();
			
			System.out.println(a2);
			
	}

	}
}
