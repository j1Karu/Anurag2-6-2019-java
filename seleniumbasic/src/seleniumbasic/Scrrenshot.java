package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrrenshot {
	static WebDriver Driver;
	
	public static void screenshot() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		//WebDriver Driver = new ChromeDriver ();
		//Driver.manage().window().maximize();
		//Driver.get("https://www.facebook.com/signup");
		
		TakesScreenshot screen = (TakesScreenshot)Driver;
	 File Source = screen.getScreenshotAs(OutputType.FILE);
	String location = "C:\\Users\\HP\\OneDrive\\Screenshot\\file51.png";
	 
	 File destination = new File (location);
	 org.openqa.selenium.io.FileHandler.copy(Source, destination);
	
	}
	
	public static void main(String[] args) throws IOException {
		
		screenshot();
	}

}
