package testdiscussion;

import org.testng.annotations.Test;

public class Basicfirstone {
	
	@Test(priority=500)
	public void testcase1 () {
		System.out.println("this is the first test");
		
		
	}
	@Test (priority = 50)
	public void testcae2 () {
		System.out.println("this is the second test");
	}
	
	@Test (priority = -1)
	public void abhram () {
		
		System.out.println("this testcase start from keyword A");
	}
  @Test (invocationCount = 03,priority = 2)
public void zebra () {
	  
	  System.out.println("this testcase if for Z");
  }
  
  @Test 
  public void monkey() {
	  
	  System.out.println("this is a monkey test case");
  }
}
