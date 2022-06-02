package aRJUNPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardArjun {
	
	@FindBy (xpath = "//*[text()='Admin']") private WebElement Admintab;
	@FindBy (xpath = "//*[text()='PIM']") private WebElement PIMtab;
	@FindBy (xpath = "//*[text()='Leave']") private WebElement leavetab;

	public DashboardArjun (WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
	}
	
	public void admin () {
		
		Admintab.click();
		
	}
	
	public void PIM () {
		
		PIMtab.click();
	}
	
	public void leave() {
		
		leavetab.click();
	}
	
}
