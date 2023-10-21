package TestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Select_DropDown_Options;
import PomClass.Documentview_Pom;

public class Documentview  extends BaseClass
{    
    @Test
    public void documentview() throws InterruptedException
    { 
    	Documentview_Pom dp = new Documentview_Pom(driver);
    	dp.getDocumentView().click();
    	Thread.sleep(3000);
    	dp.getDocumentViewsub().click();
    	Thread.sleep(3000);
    	WebElement academicyear = dp.getSelect();
    	Select_DropDown_Options.select_By_VisibleText(academicyear, "2019-2020");
    	Thread.sleep(3000);
    	WebElement selectclass = dp.getSelectClass();
    	Select_DropDown_Options.select_By_VisibleText(selectclass, "I");
    	dp.getReport().click();
    	
    }
}
