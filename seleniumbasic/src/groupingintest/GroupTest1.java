package groupingintest;

import org.testng.annotations.Test;

public class GroupTest1 {
	
	@Test(groups = "Build" )
	public void login () {
		
		System.out.println("this is a Login from build");
	}

	@Test (groups = "Build")
	public void buildtest () {
		
		System.out.println("this is a build test");
	}
	
	@Test (groups = "regression")
	public void dashboard () {
		
		System.out.println("this is a regression group dashboard test");
		System.out.println("he faqt git sati ahe samxl kay ? ");
	}
	

	
}
