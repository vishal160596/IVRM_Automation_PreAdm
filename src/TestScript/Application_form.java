package TestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Select_DropDown_Options;
import PomClass.Application_Form_POM;
import PomClass.PreAdHome_PomClass;

public class Application_form extends BaseClass
{
	 @Test
	   public static void Test() throws InterruptedException
	   {
		   Thread.sleep(3000);
		   Application_Form_POM pm = new Application_Form_POM(driver);
		   pm.getApplicationform().click();
		   pm.getApplicationformsub().click();
		   Thread.sleep(3000);
		   WebElement photo = pm.getFile1();
		   photo.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   pm.getFirstName().sendKeys("Rockstar");
		   WebElement religiondropdown = pm.getSelectReligion();
		   Select_DropDown_Options.select_By_Value(religiondropdown, "64");
		   WebElement castedropdown = pm.getSelectCaste();
		   Select_DropDown_Options.select_By_Value(castedropdown, "86");
		   WebElement genderdropdown = pm.getGender();
		   Select_DropDown_Options.select_By_Value(genderdropdown, "Female");
		   Thread.sleep(3000);
		   pm.getBdate().click();
		   pm.getDays().click();
		   Thread.sleep(3000);
		   WebElement applying = pm.getSelectClass();
		   Select_DropDown_Options.select_By_Value(applying, "4");
		   WebElement nation = pm.getSelect();
		   Thread.sleep(5000);
		   Select_DropDown_Options.select_By_VisibleText(nation, "Indian");
		   pm.getHmothertongue().sendKeys("Kannada");
		   WebElement blood = pm.getSelectBloodGroup();
		   Select_DropDown_Options.select_By_VisibleText(blood, "A+");
		   pm.getHconstreet().sendKeys("Belgaum");
		   pm.getHconarea().sendKeys("Belgaum");
		   WebElement country = pm.getSelectCountry();
		   Select_DropDown_Options.select_By_VisibleText(country, "India");
		   WebElement state = pm.getSelectState();
		   Select_DropDown_Options.select_By_VisibleText(state, "Karnataka");
		   pm.getCity().sendKeys("Belgaum");
		   pm.getPincode().sendKeys("591304");
		   pm.getPermanentAddressSameAsResi().click();
		   pm.getHfathername().sendKeys("CCCC");
		   pm.getQual().sendKeys("BE");
		   pm.getOthers().click();
		   pm.getServ().sendKeys("BE");
		   pm.getHaadharfather().sendKeys("974838571466");
		   WebElement religiondropdown1 = pm.getSelectReligion1();
		   Select_DropDown_Options.select_By_VisibleText(religiondropdown1, "Hindu");
		   WebElement castedropdown1 = pm.getSelect1();
		   Select_DropDown_Options.select_By_VisibleText(castedropdown1, "General");
		   WebElement nationdropdown = pm.getSelect2();
		   Select_DropDown_Options.select_By_VisibleText(nationdropdown, "Indian");
		   pm.gethFpno().sendKeys("9036436259");
		   pm.getHmothername().sendKeys("CC");
		   pm.getMotquali().sendKeys("BE");
		   pm.getOthers1().click();
		   pm.getMotserbusi().sendKeys("BE");
		   pm.getHaadharmoth().sendKeys("974838571466");
		   WebElement religin = pm.getSelectReligion2();
		   Select_DropDown_Options.select_By_VisibleText(religin, "Hindu");
		   WebElement catase = pm.getSelect3();
		   Select_DropDown_Options.select_By_VisibleText(catase, "General");
		   WebElement nationdropdown1 = pm.getSelect4();
		   Select_DropDown_Options.select_By_VisibleText(nationdropdown1, "Indian");
		   pm.gethMpno().sendKeys("9036436259");
		   WebElement transfer = pm.getSelect5();
		   Select_DropDown_Options.select_By_VisibleText(transfer, "No");
		   pm.getHpno().sendKeys("9036436259");
		   pm.getHemail().sendKeys("chetan123@gmail.com");
		   pm.getFathmoninco().sendKeys("10000");
		   pm.getMothincome().sendKeys("10000");
		   WebElement doc = pm.getDoc();
		   doc.sendKeys("C:\\\\Users\\\\chetan\\\\Desktop\\\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc1 = pm.getDoc1();
		   doc1.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc2 = pm.getDoc2();
		   doc2.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc3 = pm.getDoc3();
		   doc3.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc4 = pm.getDoc4();
		   doc4.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc5 = pm.getDoc5();
		   doc5.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   WebElement doc6 = pm.getDoc6();
		   doc6.sendKeys("C:\\Users\\chetan\\Desktop\\staff logo.jpg");
		   Thread.sleep(3000);
		   pm.getYes().click();
		   Thread.sleep(3000);
		   pm.getSubmit().click();
		   Thread.sleep(3000);
		   pm.getButton().click();
		   Thread.sleep(4000);
		   pm.getoK().click();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
}
