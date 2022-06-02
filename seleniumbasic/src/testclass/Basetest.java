package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclass.Login;

public class Basetest {
	static WebDriver Driver;
	Login lp;
	
	@BeforeSuite
	public void loginpage () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://kite.zerodha.com");
		
	}
	
	@AfterSuite
	public void logout () {
		
		Driver.quit();
	}
	
	@BeforeClass
	public void objectcreation () {
		
	 lp = new Login (Driver);
	}

}
