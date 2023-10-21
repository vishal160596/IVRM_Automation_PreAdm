package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Preadmissionstatus_Pom
{
	@FindBy(xpath="//span[normalize-space()='Pre admission Status']") 
    private WebElement preAdmissionStatus;
	
	@FindBy(xpath="//body//ui-view//ul//ul//ul//a[1]") 
    private WebElement status;
	
	@FindBy(xpath="//input[@value='Appsts']")
    private WebElement ast;
	
	@FindBy(name="year") 
    private WebElement select;  
	
	@FindBy(name="clas")
    private WebElement select1;
	
	@FindBy(name="stat") 
	private WebElement select2;
	
	@FindBy(xpath="//div[@ng-show='IsHidden']//div//div//button[@id='save-btn']")
	private WebElement search;
	
	@FindBy(xpath="//input[@value='11646']")
    private WebElement Studnet;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/select[1]")
    private WebElement aPPWAITINGAPPREJECTEDAPPACC;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/select[1]/option[3]") 
    private WebElement aPPACCEPTED;
	
	@FindBy(xpath="//form[@name='myFormSM']//span[contains(text(),'Update Status')]") 
    private WebElement updateStatus;
	
	@FindBy(xpath="//div[@id='myModalswal']//div//div//div//div//span[contains(text(),'Update Status')]")
    private WebElement updateStatus1;
	
	@FindBy(xpath="//button[normalize-space()='Yes!']")
    private WebElement yes;
	
	
	@FindBy(xpath="//input[@value='admsts']") 
    private WebElement ast1;
	
	@FindBy(name="year") 
    private WebElement select3;
	
	@FindBy(xpath="//div[@ng-show='IsHidden']//div[2]//div[1]//select[1]") 
    private WebElement select4;
	
	@FindBy(xpath="//div[@ng-show='IsHidden']//div[3]//div[1]//select[1]") 
	private WebElement select5;
	
	@FindBy(xpath="//span[normalize-space()='Search']")
    private WebElement search1;
	
	@FindBy(xpath="//input[@value='11645']")
    private WebElement selectstudent;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/select[1]") 
    private WebElement iNPROGRESSSELECTEDANDSEATBO;
	
	@FindBy(xpath="//div[@class='text-center']//span[@class='ng-scope'][normalize-space()='Update Status']")
    private WebElement updateStatus2;
	
	@FindBy(xpath="//div[@class='modal-content']//div//div//span[@class='ng-scope'][normalize-space()='Update Status']")
    private WebElement updateStatus3;
	
	@FindBy(xpath="//button[normalize-space()='Yes!']")
    private WebElement yes1;
	
	@FindBy(xpath="//button[normalize-space()='OK']") 
    private WebElement oK;
	
	public Preadmissionstatus_Pom(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getPreAdmissionStatus()
	{
		return preAdmissionStatus;
	}

	public WebElement getStatus() 
	{
		return status;
	}

	public WebElement getAst() 
	{
		return ast;
	}

	public WebElement getSelect()
	{
		return select;
	}

	public WebElement getSelect1()
	{
		return select1;
	}

	public WebElement getSelect2() 
	{
		return select2;
	}

	public WebElement getSearch() 
	{
		return search;
	}

	public WebElement getStudnet()
	{
		return Studnet;
	}

	public WebElement getaPPWAITINGAPPREJECTEDAPPACC()
	{
		return aPPWAITINGAPPREJECTEDAPPACC;
	}

	public WebElement getaPPACCEPTED() 
	{
		return aPPACCEPTED;
	}

	public WebElement getUpdateStatus()
	{
		return updateStatus;
	}

	public WebElement getUpdateStatus1() 
	{
		return updateStatus1;
	}

	public WebElement getYes()
	{
		return yes;
	}

	public WebElement getAst1() 
	{
		return ast1;
	}

	public WebElement getSelect3() 
	{
		return select3;
	}

	public WebElement getSelect4() 
	{
		return select4;
	}

	public WebElement getSelect5() 
	{
		return select5;
	}

	public WebElement getSearch1() 
	{
		return search1;
	}

	public WebElement getSelectstudent() 
	{
		return selectstudent;
	}

	public WebElement getiNPROGRESSSELECTEDANDSEATBO() 
	{
		return iNPROGRESSSELECTEDANDSEATBO;
	}

	public WebElement getUpdateStatus2() 
	{
		return updateStatus2;
	}

	public WebElement getUpdateStatus3() 
	{
		return updateStatus3;
	}

	public WebElement getYes1() 
	{
		return yes1;
	}

	public WebElement getoK() 
	{
		return oK;
	}
	
	
}
