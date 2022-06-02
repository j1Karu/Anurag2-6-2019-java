package testdiscussion;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seleniumbasic.Scrrenshot;

public class ListnerClass extends NormalForListner implements ITestListener {
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this is a listner" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("yeahh you are successfull" + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Scrrenshot.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	
	

}
