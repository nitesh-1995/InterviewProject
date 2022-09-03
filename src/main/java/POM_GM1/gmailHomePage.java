package POM_GM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailHomePage 
{
	@FindBy(xpath = "//div[text()='Compose']") private WebElement composeButtonClick;
	@FindBy(xpath = "(//input[@class='agP aFw']") private WebElement receipentEmail;
	@FindBy(xpath = "//input[@class='aoT']") private WebElement subjectEmail;
	@FindBy(xpath = "//div[contains(@class,'Am Al editable')]") private WebElement bodyEmail;
	@FindBy(xpath = "//div[text()='Send']") private WebElement sendClick;
	
	
	public gmailHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void composeClickMethod()
	{
		if (composeButtonClick.isEnabled() && composeButtonClick.isDisplayed())
		{
			composeButtonClick.click();
		}
		
	}
	
	public void addReceipentEmail(String receipentEmail_BDD)
	{
		receipentEmail.sendKeys(receipentEmail_BDD);
	}
	
	public void addSubjectEmail(String subjectEmail_BDD)
	{
		subjectEmail.sendKeys(subjectEmail_BDD);
	}
	
	public void addbodyEmail(String bodyEmail_BDD)
	{
		bodyEmail.sendKeys(bodyEmail_BDD);
	}
	
	public void sendEmail()
	{
		if (sendClick.isEnabled() && sendClick.isDisplayed())
		{
			sendClick.click();
		}
	}
	
}
