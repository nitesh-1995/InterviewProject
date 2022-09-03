package POM_GM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailPasswordPage 
{
	@FindBy(xpath = "//input[@type='password']") private WebElement password;
	@FindBy(xpath = "(//button[@type='button'])[2]") private WebElement nextClick;
	
	public gmailPasswordPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void passwordMethod(String password_BDD)
	{
		password.sendKeys(password_BDD);
	}
	
	public void nextMethod()
	{
		if (nextClick.isEnabled() && nextClick.isDisplayed())
		{
			nextClick.click();
		}
	}
}
