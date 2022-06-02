package testdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NormalForListner {
	static  WebDriver Driver ;
	@Test
	public void verifyurl () {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver ();
			Driver.manage().window().maximize();
			Driver.get("https://iplace.talentlms.com/index");
			String url = Driver.getCurrentUrl();
			String expected = "iplace";
			boolean realone = url.contains(expected);
			Assert.assertTrue(realone, "this is the true message");
			Assert.assertEquals(false, true);
			
			
		
	}

	@Test 
	public void login () {
		
		
		System.out.println("this is login");
		Assert.assertEquals(false, false);
	}
	
}
