package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documentview_Pom
{
	@FindBy(xpath="//span[normalize-space()='Document View']")
    private WebElement documentView;
	
	@FindBy(xpath="//body//ui-view//ul//ul//ul//a[1]")
    private WebElement documentViewsub;
	
	@FindBy(name="acd")
    private WebElement Select;
	
	@FindBy(name="happlygg") 
    private WebElement SelectClass;
	
	@FindBy(xpath="//button[@type='submit']//i[@aria-hidden='true']")
    private WebElement report;
	
	public Documentview_Pom(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getDocumentView() 
	{
		return documentView;
	}

	public WebElement getDocumentViewsub()
	{
		return documentViewsub;
	}

	public WebElement getSelect() 
	{
		return Select;
	}

	public WebElement getSelectClass() 
	{
		return SelectClass;
	}

	public WebElement getReport() 
	{
		return report;
	}
	 
	
}
