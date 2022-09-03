package POM_GM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailEmailIdPage 
{
	@FindBy(id = "identifierId") private WebElement emailId;
	@FindBy(xpath = "(//button[@type='button'])[3]") private WebElement nextClick;
	
	public gmailEmailIdPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void emailIdMethod(String emailId_BDD)
	{
		emailId.sendKeys(emailId_BDD);
	}
	
	public void nextMethod()
	{
		if (nextClick.isEnabled() && nextClick.isDisplayed())
		{
		nextClick.click();
		}
	}
}
