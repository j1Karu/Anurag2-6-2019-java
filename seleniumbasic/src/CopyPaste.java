import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/signup");
		Actions act = new Actions (Driver);
	WebElement Firstname = Driver.findElement(By.xpath("//*[@name='firstname']"));
	act.sendKeys(Firstname, "gaurav").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
