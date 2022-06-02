package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 @FindBy(xpath="//*[@id='userid']") private WebElement username;
	 @FindBy(xpath="//*[@id='password']") private WebElement password;
	 @FindBy(xpath="//*[@class='button-orange wide']") private WebElement enter;
	 @FindBy(xpath="//*[@id='pin']") private WebElement pin;
	 @FindBy(xpath ="//*[@type='button']")WebElement button;
	 
	 WebDriver Driver;
	 
	 public Login (WebDriver Driver) {
		 
		 this.Driver = Driver;
		 PageFactory.initElements(Driver, this);
	 }

	 public void enterCredentials() {
			
			username.sendKeys("DAA677");
			password.sendKeys("Velocity@123");

		}
	 public void clickOnLogin() {
			enter.click();
		}

	 public void enterPin() {
			Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			pin.sendKeys("866918");
			button.click();
		}


}
