package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodFacebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		String s = Driver.getCurrentUrl();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/signup");
	WebElement birthdate = Driver.findElement(By.xpath("//*[@id='day']"));
	Select s1 = new Select (birthdate);
	
	s1.selectByVisibleText("25");
	Thread.sleep(5000);
	s1.selectByValue("4");
	Thread.sleep(2000);
	s1.selectByIndex(10);
  String ra	= Driver.getCurrentUrl();
	System.out.println(ra);
String	ab=Driver.getTitle();
System.out.println(ab);
String abc = birthdate.getAttribute("value");
System.out.println(abc);
	
		
	}

}

