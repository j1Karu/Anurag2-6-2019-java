package testdiscussion;

import org.testng.annotations.Test;

public class DependsOn1 {
	@Test(priority =4, dependsOnMethods = "testdiscussion.DependsOn.Browser")
	public void Userinfo () {
		
		System.out.println("this is user info");
		
	}
	
	@Test (priority = 5, dependsOnMethods = "testdiscussion.DependsOn.login")
	public void property () {
		
		System.out.println("this is a property");
	}
	
	@Test (priority = 6)
	public void id () {
		
		System.out.println("this is a id");
	}

}
