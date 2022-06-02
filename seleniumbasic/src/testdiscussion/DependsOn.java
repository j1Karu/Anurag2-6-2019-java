package testdiscussion;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsOn {

	@Test(priority =1, enabled= true)
	public void Browser () {
		
		System.out.println("this is browser");
		//assertEquals(true, false);
		
		
	}
	
	@Test (priority = 2)
	public void login () {
		
		System.out.println("this is a login test");
	}
	
	@Test (dependsOnMethods = "login",priority = 3)
	public void dashboard () {
		
		System.out.println("this is a dashboard");
	}
}
