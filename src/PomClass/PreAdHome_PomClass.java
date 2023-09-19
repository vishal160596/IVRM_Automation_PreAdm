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
    
    @FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/a")
    private WebElement Applicationform;
    
    @FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/ul")
    private WebElement applicationformsub;
    
    public PreAdHome_PomClass(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getPreadmission() 
	{
		return Preadmission;
	}

	public WebElement getApplicationform()
	{
		return Applicationform;
	}

	public WebElement getApplicationformsub()
	{
		return applicationformsub;
	}
	
    
	
} 
