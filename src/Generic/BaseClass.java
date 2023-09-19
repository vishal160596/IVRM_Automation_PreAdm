package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{    
	public static WebDriver driver;
	
	 @BeforeTest
	 public void Openapplication() throws InterruptedException
	 {
		 System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://ivrmstaging.vapssmartecampus.com/#/login/");
		  Thread.sleep(3000);
	 }
	 
	 
	/* @AfterTest
	 public void CloseApp()
	 {
		 driver.quit();
	 }*/
	 
	
	 
} 
