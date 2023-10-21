package TestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Select_DropDown_Options;

public class PreadmissionStatus extends BaseClass
{
    @Test
    public void Preadmissionstatus_Pom() throws InterruptedException
    {
    	PomClass.Preadmissionstatus_Pom pp = new PomClass.Preadmissionstatus_Pom(driver);
    	pp.getPreAdmissionStatus().click();
    	pp.getStatus().click();
    	Thread.sleep(3000);
    	WebElement year = pp.getSelect();
    	Select_DropDown_Options.select_By_VisibleText(year, "2019-2020");
    	Thread.sleep(3000);
     	WebElement classdropdown = pp.getSelect1();
     	Select_DropDown_Options.select_By_VisibleText(classdropdown, "I");
     	Thread.sleep(3000);
     	WebElement Statusdropdown = pp.getSelect2();
     	Select_DropDown_Options.select_By_VisibleText(Statusdropdown, "APP ACCEPTED");
     	pp.getSearch().click();
     	Thread.sleep(3000);
     	pp.getStudnet().click();
     	WebElement update = pp.getaPPWAITINGAPPREJECTEDAPPACC();
     	Select_DropDown_Options.select_By_VisibleText(update, "APP ACCEPTED");
     	pp.getaPPACCEPTED().sendKeys("Acceted");
     	pp.getUpdateStatus().click();
     	pp.getUpdateStatus1().click();
     	pp.getYes().click();
     	pp.getAst1().click();
     	WebElement academic = pp.getSelect3();
     	Select_DropDown_Options.select_By_VisibleText(academic, "2019-2020");
     	WebElement selectclass = pp.getSelect4();
     	Select_DropDown_Options.select_By_VisibleText(selectclass, "I");
        WebElement section = pp.getSelect5();
        Select_DropDown_Options.select_By_VisibleText(section, "INPROGRESS");
     	pp.getSearch1().click();
     	Thread.sleep(3000);
     	pp.getSelectstudent().click();
     	WebElement inprogress = pp.getiNPROGRESSSELECTEDANDSEATBO();
     	Select_DropDown_Options.select_By_VisibleText(inprogress, "CONFIRM");
     	Thread.sleep(5000);
     	pp.getUpdateStatus2().click();
     	pp.getUpdateStatus3().click();
     	pp.getYes1().click();
     	Thread.sleep(5000);
     	pp.getoK().click();
     	
     	
     	
    }
    
}
