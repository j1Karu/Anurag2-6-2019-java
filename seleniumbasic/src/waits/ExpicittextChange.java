package waits;
import java.time.Duration;
//import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicittextChange {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		Driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		WebElement Hiddentext = Driver.findElement(By.xpath("//*[@class='target-text']"));
		WebDriverWait wait = new WebDriverWait (Driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(Hiddentext, "Selenium Webdriver"));
		
	}

}
