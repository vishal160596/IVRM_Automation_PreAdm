package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom 
{
    @FindBy(id = "login-username")
    private WebElement username;
    
    @FindBy(id ="login-password")
    private WebElement password;
    
    @FindBy(xpath = "//div[@class ='col-xs-4 jumbotron1']/span/button")
    private WebElement signbuuton;
    
    public LoginPom(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword()
	{
		return password;
	}

	public WebElement getSignbuuton() 
	{
		return signbuuton;
	}
	
	
    
   
    
}
