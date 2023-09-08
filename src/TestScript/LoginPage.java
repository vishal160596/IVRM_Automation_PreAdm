package TestScript;

import org.testng.annotations.Test;

import Generic.BaseClass;

public class LoginPage extends BaseClass
{
   @Test
   public void Testapplication()
   {
	   PomClass Pm = new PomClass(driver);
	   Pm.getUsername().sendKeys("radha");
	   Pm.getPassword().sendKeys("Password@1234");
	   Pm.getSignbuuton().click();
   }
}
