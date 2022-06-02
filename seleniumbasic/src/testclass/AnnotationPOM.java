package testclass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aRJUNPractice.DashboardArjun;
import aRJUNPractice.pOM;

public class AnnotationPOM {
	WebDriver Driver;
	DashboardArjun ds ;
	@BeforeClass
	public void launchbrowser () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
	}
	@AfterClass
	public void closebrowser () {
		Driver.quit();
		
	}
	
	@BeforeMethod
	public void login () {
		Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		pOM pm = new pOM (Driver);
		pm.EnterCredentials();
		pm.hitbutton();	
	}
	
	@Test
	public void verifyingthebutton() {
		ds = new DashboardArjun (Driver);
		ds.admin();
		ds.PIM();
		String url = Driver.getCurrentUrl();
		String title = Driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers") && title.equals("OrangeHRM")) {
			
			System.out.println("this is correct title and url");
			
		}
		else {
			
			System.out.println("the url and the title of page is different");
		}
		
	}
	
}
