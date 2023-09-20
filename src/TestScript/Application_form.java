package TestScript;

import org.testng.annotations.Test;

import Generic.BaseClass;
import PomClass.Application_Form_POM;
import PomClass.PreAdHome_PomClass;

public class Application_form extends BaseClass
{
	 @Test
	   public static void Test() throws InterruptedException
	   {
		   Thread.sleep(5000);
		   Application_Form_POM pm = new Application_Form_POM(driver);
		   Thread.sleep(5000);
		   pm.getApplicationform().click();
		   pm.getApplicationformsub().click();
		   
		   
	   }
}
