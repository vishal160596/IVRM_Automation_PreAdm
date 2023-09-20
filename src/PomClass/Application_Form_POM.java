package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Form_POM 
{
	@FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/a")
    private WebElement Applicationform;
    
    @FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/ul")
    private WebElement applicationformsub;
    
    public Application_Form_POM(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
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
