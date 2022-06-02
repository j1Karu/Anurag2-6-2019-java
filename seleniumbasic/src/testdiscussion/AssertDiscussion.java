package testdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDiscussion {
	WebDriver Driver;
	
	@Test
	public void verifyurl () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		 Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://iplace.talentlms.com/index");
		String url = Driver.getCurrentUrl();
		String expected = "iplace";
		boolean realone = url.contains(expected);
		Assert.assertTrue(realone, "this is the true message");
		
	}
	@Test (priority = 2)
	public void login () {
		
		Driver.findElement(By.xpath("//*[@id='tl-cms-nav-login']")).click();
		Driver.get("makemytrip.com");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
		
		

}
