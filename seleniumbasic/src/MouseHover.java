import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Notes\\selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		Driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		Driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Actions act = new Actions (Driver);
	   WebElement admintab = Driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		act.moveToElement(admintab).perform();
		WebElement admintab1 = Driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		act.moveToElement(admintab1).perform();
	
	}

}
