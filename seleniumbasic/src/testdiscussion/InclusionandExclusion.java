package testdiscussion;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class InclusionandExclusion {
	
	@Test(priority =1)
	public void Browser () {
		
		System.out.println("this is browser");	
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


