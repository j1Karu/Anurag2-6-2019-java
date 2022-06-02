package cROSS_Browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import aRJUNPractice.DashboardArjun;
import aRJUNPractice.pOM;


public class CrossBrowserTestClass {
	WebDriver Driver;
	pOM pm;
	DashboardArjun ds;
	

	@Parameters("browser")
	@BeforeTest
	public void launchbrowser(String browser) {

		System.out.println(browser);
		if(browser.equals("Chrome")) {

			Driver = BaseClass.chromebrowser();
		}
		if(browser.equals("Opera")) {

			Driver = BaseClass.operabrowser();
		}

	}
	
	@BeforeClass
	public void orangeLogin () {
		
		Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		pm = new pOM (Driver);
		ds = new DashboardArjun (Driver);
	}
	
	@AfterClass
	public void objdistruction () {
		
		pm = null;
		ds=null;
	}
	
	@AfterTest
	public void browserclose () {
		Driver.quit();
		
	}
	@BeforeMethod
	public void loginorange() {
		
		pm.EnterCredentials();
		pm.hitbutton();
	}
	@Test
	public void dashboardorange() {
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
		
	

