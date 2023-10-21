package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Form_POM 
{
	@FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/a")
    private WebElement Applicationform;
    
    @FindBy(xpath = "//ul[@class ='sidebar-menu styledisplay']/li[4]/ul/li[4]/ul")
    private WebElement applicationformsub;
    
    @FindBy(name="file1")
    private WebElement file1;
    
    @FindBy(xpath="//body/ui-view/div[@data-ng-init='GetRoleTypes()']/div/ui-view/section/div/md-content/md-tabs[@md-selected='myTabIndex']/md-tabs-content-wrapper/md-tab-content[@id='tab-content-1']/div[@md-tabs-template='::tab.template']/md-content/div[@ng-show='ProspectuseScreen']/form[@name='myForm']/div[@data-ng-init='regformfour()']/div[@ng-show='IsHidden']/div[1]/div[1]/div[1]/div[1]/input[1]") 
    private WebElement firstName;
    
    @FindBy(xpath="//div[@data-ng-init='regformfour()']//div[1]//div[1]//div[5]//div[1]//select[1]")
    private WebElement selectReligion;
   
    @FindBy(name="casteere")
    private WebElement selectCaste;
    
    @FindBy(name="hgender") 
    private WebElement gender;
    
    @FindBy(xpath="//body/ui-view/div[@data-ng-init='GetRoleTypes()']/div/ui-view/section/div/md-content/md-tabs[@md-selected='myTabIndex']/md-tabs-content-wrapper/md-tab-content[@id='tab-content-1']/div[@md-tabs-template='::tab.template']/md-content/div[@ng-show='ProspectuseScreen']/form[@name='myForm']/div[@data-ng-init='regformfour()']/div[@ng-show='IsHidden']/div/div/div/div/md-datepicker[@name='bdate']/button[1]")
    private WebElement bdate;
    
    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    private WebElement days;
    
    @FindBy(name="happlygg") 
    private WebElement selectClass;
    
    @FindBy(name="hnationality") 
    private WebElement select;
    
    @FindBy(name="hmothertongue")
    private WebElement hmothertongue;
    
    @FindBy(name="stubloodgrp") 
    private WebElement selectBloodGroup;
    
    @FindBy(name="hconstreet") 
    private WebElement hconstreet;
    
    @FindBy(name="hconarea")
    private WebElement hconarea;
    
    @FindBy(name="hconcountry")
    private WebElement selectCountry;
    
    @FindBy(name="hconstate")
    private WebElement selectState;
    
    @FindBy(name="City")
    private WebElement city;
    
    @FindBy(name="pincode") 
    private WebElement pincode;
    
    @FindBy(xpath="//input[@ng-model='reg.chkbox_address']")
    private WebElement permanentAddressSameAsResi;
    
    @FindBy(name="hfathername") 
    private WebElement hfathername;
    
    @FindBy(name="qual")
    private WebElement qual;
    
    @FindBy(xpath="//div[@data-ng-init='regformfour()']//div[1]//div[5]//div[1]//div[2]//div[2]//label[1]//span[1]")
    private WebElement others;
    
    @FindBy(name="serv")
    private WebElement serv;
    
    @FindBy(name="haadharfather")
    private WebElement haadharfather;
    
    @FindBy(name="hreligionfather")
    private WebElement selectReligion1;
    
    @FindBy(name="casteerefather")
    private WebElement select1;
    
    @FindBy(name="adasdfsd")
    private WebElement select2;
    
    @FindBy(name="hFpno")
    private WebElement hFpno;
    
    @FindBy(name="hmothername")
    private WebElement hmothername;
    
    @FindBy(name="motquali")
    private WebElement motquali;
    
    @FindBy(xpath="//div[@ng-show='IsHidden']//div[2]//div[5]//div[1]//div[2]//div[2]//label[1]//span[1]")
    private WebElement others1;
    
    @FindBy(name="motserbusi")
    private WebElement motserbusi;
    
    @FindBy(name="haadharmoth")
    private WebElement haadharmoth;
    
    @FindBy(name="hreligionmother")
    private WebElement selectReligion2;
    
    @FindBy(name="casteeremother")
    private WebElement select3;
    
    @FindBy(name="motnation")
    private WebElement select4;
    
    @FindBy(name="hMpno") 
    private WebElement hMpno;
    
    @FindBy(name="transffer") 
    private WebElement select5;
    
    @FindBy(name="hpno") 
    private WebElement hpno;
    
    @FindBy(name="hemail")
    private WebElement hemail;
    
    @FindBy(name="fathmoninco") 
    private WebElement fathmoninco;
    
    @FindBy(name="mothincome")
    private WebElement mothincome;
    
	@FindBy(xpath="//input[@id='74']") 
    private WebElement doc;
    
    @FindBy(xpath="//input[@id='10116']")
    private WebElement doc1;
    
    @FindBy(xpath="//input[@id='10119']")
    private WebElement doc2;
    
    @FindBy(xpath="//input[@id='10120']")
    private WebElement doc3;
    
    @FindBy(xpath="//input[@id='10121']")
    private WebElement doc4;
    
    @FindBy(xpath="//input[@id='10122']")
    private WebElement doc5;
    
    @FindBy(xpath="//input[@id='10126']") 
    private WebElement doc6;
    
    @FindBy(xpath="//div[@ng-show='IsHidden']//div//div//span[contains(text(),'Yes')]")
    private WebElement yes;
    
    @FindBy(xpath="//button[@ng-disabled='applastdatedisable']//span[contains(text(),'Submit')]") 
    private WebElement submit;
    
    @FindBy(xpath="//button[normalize-space()='Yes!']") 
    private WebElement button; 
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    private WebElement oK;
    
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
	public WebElement getFile1() 
	{
		return file1;
	}
	public WebElement getFirstName() 
	{
		return firstName;
	}
	public WebElement getSelectReligion() 
	{
		return selectReligion;
	}
	public WebElement getSelectCaste() 
	{
		return selectCaste;
	}
	public WebElement getGender()
	{
		return gender;
	}
	public WebElement getBdate() 
	{
		return bdate;
	}
	public WebElement getDays()
	{
		return days;
	}
	public WebElement getSelectClass()
	{
		return selectClass;
	}
	
	public WebElement getSelect()
	{
			return select;
	}
	public WebElement getHmothertongue()
	{
		return hmothertongue;
	}
	public WebElement getSelectBloodGroup() 
	{
		return selectBloodGroup;
	}
	public WebElement getHconstreet()
	{
		return hconstreet;
	}
	public WebElement getHconarea() 
	{
		return hconarea;
	}
	public WebElement getSelectCountry() 
	{
		return selectCountry;
	}
	public WebElement getSelectState() 
	{
		return selectState;
	}
	public WebElement getCity() 
	{
		return city;
	}
	public WebElement getPincode() 
	{
		return pincode;
	}
	public WebElement getPermanentAddressSameAsResi() 
	{
		return permanentAddressSameAsResi;
	}
	public WebElement getHfathername() 
	{
		return hfathername;
	}
	public WebElement getQual() 
	{
		return qual;
	}
	public WebElement getOthers() 
	{
		return others;
	}
	public WebElement getServ()
	{
		return serv;
	}
	public WebElement getHaadharfather() 
	{
		return haadharfather;
	}
	public WebElement getSelectReligion1()
	{
		return selectReligion1;
	}
	public WebElement getSelect1() 
	{
		return select1;
	}
	public WebElement getSelect2() 
	{
		return select2;
	}
	public WebElement gethFpno()
	{
		return hFpno;
	}
	public WebElement getHmothername() 
	{
		return hmothername;
	}
	public WebElement getMotquali() 
	{
		return motquali;
	}
	public WebElement getOthers1()
	{
		return others1;
	}
	public WebElement getMotserbusi()
	{
		return motserbusi;
	}
	public WebElement getHaadharmoth() 
	{
		return haadharmoth;
	}
	public WebElement getSelectReligion2() 
	{
		return selectReligion2;
	}
	 
    public WebElement getSelect3()
	{
			return select3;
	}
	public WebElement getSelect4() 
	{
		return select4;
	}
	public WebElement gethMpno()
	{
		return hMpno;
	}
	public WebElement getSelect5()
	{
		return select5;
	}
	public WebElement getHpno() 
	{
		return hpno;
	}
	public WebElement getHemail() 
	{
		return hemail;
	}
	public WebElement getFathmoninco() 
    {
		return fathmoninco;
	}
	
	public WebElement getMothincome() 
	{
		return mothincome;
	}
	public WebElement getDoc()
	{
		return doc;
	}
	public WebElement getDoc1()
	{
		return doc1;
	}
	public WebElement getDoc2() 
	{
		return doc2;
	}
	public WebElement getDoc3()
	{
		return doc3;
	}
	public WebElement getDoc4()
	{
		return doc4;
	}
	public WebElement getDoc5() 
	{
		return doc5;
	}
	
	public WebElement getDoc6()
	{
		return doc6;
	}
	public WebElement getYes() 
	{
		return yes;
	}
	public WebElement getSubmit() 
	{
		return submit;
	}
	public WebElement getButton()
	{
		return button;
	}
	public WebElement getoK() 
	{
		return oK;
	}
	
	
	
	
   
}
