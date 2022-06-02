package testdiscussion;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class AnnotationsInTest {
		
		@BeforeSuite
		public void firstpart () {
			System.out.println("this will print before as before suite");
		}
		
		@BeforeClass 
		public void beforeclass () {
			
			System.out.println("this will print before the class");
		}
		
		@AfterSuite 
		public void aftersuite () {
			
			System.out.println("this will print after suite");
		}
		
		@Test
		public void test() {
			System.out.println("this is a test case");
			
		}
		
		@AfterClass
		public void afterclass () {
			
			System.out.println("this will print after the class");
		}
		
		@BeforeTest 
		public void beforetest () {
			
			System.out.println("this will print before the test");
		}
		
		@AfterMethod
		public void aftermethod () {
			
			System.out.println("this will print after the method");
		}

		
		@AfterTest 
		public void aftertest () {
			
			System.out.println("this will print after the test");
		}
		
		@BeforeMethod
		public void beforemethod () {
			
			System.out.println("this will print before the method");
		}

	}



