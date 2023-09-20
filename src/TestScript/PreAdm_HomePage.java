package TestScript;

import org.testng.annotations.Test;

import Generic.BaseClass;
import PomClass.PreAdHome_PomClass;

public class PreAdm_HomePage extends BaseClass
{
   @Test
   public static void Test() throws InterruptedException
   {
	   Thread.sleep(5000);
	   PreAdHome_PomClass pm = new PreAdHome_PomClass(driver);
	   pm.getPreadmission().click();
	   Thread.sleep(5000);
	  
	   
	   
   }
}
