package testclass;

import org.testng.annotations.Test;

public class LoginTest extends Basetest {
	
	@Test
	public void testinglogin () {
		
		lp.enterCredentials();
		lp.clickOnLogin();
	}
	
	@Test
	public void pinoperating() {
		
		lp.enterPin();
	}

}
