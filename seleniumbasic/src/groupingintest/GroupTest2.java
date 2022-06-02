package groupingintest;

import org.testng.annotations.Test;

public class GroupTest2 {
	
	@Test (groups = "regression")
	public void login () {
		
		System.out.println("this is a login test of regression group");
	}
	
	@Test (groups = "sanity")
	public void info () {
		System.out.println("this is a test case of user information from sanity group");
	}

	@Test (groups = "sanity")
	public void currenturl () {
		System.out.println("this is a currenturl test case from sanity groups");
		
	}
}
