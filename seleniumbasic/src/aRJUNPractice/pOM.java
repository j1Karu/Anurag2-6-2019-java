package aRJUNPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOM {
	WebDriver Driver;
		
		@FindBy(xpath = "//*[@id='txtUsername']") private WebElement userid ;
		@FindBy(xpath = "//*[@id='txtPassword']")private WebElement password;
		@FindBy (xpath = "//*[@id='btnLogin']") private WebElement button;
	
	
public pOM (WebDriver Driver) {
	this.Driver = Driver;
	PageFactory.initElements(Driver, this);
}
public void EnterCredentials () {
	
	userid.sendKeys("Admin");
	password.sendKeys("admin123");
}

public void hitbutton () {
	
	button.click();
}
}


