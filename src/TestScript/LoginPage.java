package TestScript;

import org.testng.annotations.Test;

import Generic.BaseClass;
import PomClass.LoginPom;
import PomClass.PreAdHome_PomClass;


public class LoginPage extends BaseClass
{
   @Test
   public static void Testapplication()
   {
	   LoginPom Pm = new LoginPom(driver);
	   Pm.getUsername().sendKeys("radha");
	   Pm.getPassword().sendKeys("Password@1234");
	   Pm.getSignbuuton().click();
   }
   


}
