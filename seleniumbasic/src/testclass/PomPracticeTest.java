package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import aRJUNPractice.DashboardArjun;
import aRJUNPractice.pOM;

public class PomPracticeTest {
	
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		 WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		pOM pm = new pOM (Driver);
		pm.EnterCredentials();
		pm.hitbutton();
		
	
	DashboardArjun ds = new DashboardArjun (Driver);
	ds.admin();
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
//this same if and else statement will go for rest of the others PIM and leave method	
	Driver.navigate().back();
	Thread.sleep(3000);
	ds.PIM();
	Driver.navigate().back();
	Thread.sleep(3000);
	ds.leave();
	Driver.quit();

}
}
