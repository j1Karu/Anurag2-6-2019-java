package cROSS_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
	
	public static WebDriver chromebrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		return Driver;
	}
	
	public static WebDriver operabrowser() {
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\operadriver\\operadriver_win64\\operadriver.exe");
		WebDriver Driver = new OperaDriver(); 
		return Driver;
	}
	
//	public static void firefoxbrowser() {
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\firefox\\geckodriver.exe");
//		WebDriver Driver = new GeckoDriver();
//	}

}
