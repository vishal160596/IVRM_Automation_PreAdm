package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{    
	public WebDriver driver;
	 @BeforeMethod
	 public void Openapplication() throws InterruptedException
	 {
		 System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://ivrmstaging.vapssmartecampus.com/#/login/");
		  Thread.sleep(3000);
	 }
} 
