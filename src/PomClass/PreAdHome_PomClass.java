package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestScript.LoginPage;

public class PreAdHome_PomClass
{
    @FindBy(xpath = "//span[text()='Preadmission']")
    private  WebElement Preadmission;
    
      
    public PreAdHome_PomClass(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getPreadmission() 
	{
		return Preadmission;
	}

	
    
	
} 
