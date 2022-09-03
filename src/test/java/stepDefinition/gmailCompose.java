package stepDefinition;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import Base.baseClass;
import POM_GM1.gmailEmailIdPage;
import POM_GM1.gmailHomePage;
import POM_GM1.gmailPasswordPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmailCompose extends baseClass
{
	@Given("^I open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url) throws IOException 
	{
		open_App_in_browser("chrome", url);
	}
	
	@Given("^I do login to gmail with emailID \"([^\"]*)\"$")
	public void i_do_login_to_gmail_with_emailID(String emailId)
	{
	   gmailEmailIdPage emailLogin= new gmailEmailIdPage(driver);
	   
	   		emailLogin.emailIdMethod(emailId);
	   		emailLogin.nextMethod();
	}

	@Given("^password \"([^\"]*)\"$")
	public void password(String password)
	{
		gmailPasswordPage passwordLogin = new gmailPasswordPage(driver);
		
		Util.utilityClass.implicitWait(driver, 100);
		
			passwordLogin.passwordMethod(password);
			passwordLogin.nextMethod();
	}
	
	@Then("^I should see gmail homepage$")
	public void i_should_see_gmail_homepage()
	{
			driver.findElement(By.partialLinkText("Inbox"));
			Reporter.log("Homepage Validation Successful");
	}

	@When("^I click on compose button$")
	public void i_click_on_compose_button()
	{
	    gmailHomePage gmailComposeEmail = new gmailHomePage(driver);
	    
	    Util.utilityClass.implicitWait(driver, 100);
	    	gmailComposeEmail.composeClickMethod();
	}

	@Then("^I should see new message popup$")
	public void i_should_see_new_message_popup()
	{
			driver.findElement(By.xpath("//span[text()='New Message']")).getText();
			Reporter.log("New Message Popup opened Sucessful");
	}

	@When("^I enter the email id of receipents as \"([^\"]*)\"$")
	public void i_enter_the_email_id_of_receipents_as(String emailId)
	{
	    gmailHomePage gmailComposeEmail= new gmailHomePage(driver);
	    
	    	gmailComposeEmail.addReceipentEmail(emailId);
	}

	@When("^I enter subject as \"([^\"]*)\"$")
	public void i_enter_subject_as(String subject)
	{
		 gmailHomePage gmailComposeEmail= new gmailHomePage(driver);
		    
		    gmailComposeEmail.addSubjectEmail(subject);
	}

	@When("^I enter body as \"([^\"]*)\"$")
	public void i_enter_body_as(String body)
	{
		 gmailHomePage gmailComposeEmail= new gmailHomePage(driver);
		 	
		 	gmailComposeEmail.addbodyEmail(body);
	}

	@When("^I click on send button$")
	public void i_click_on_send_button()
	{
	    
	}

	@Then("^I should get confirmation")
	public void i_should_get_confirmation_as()
	{
		Util.utilityClass.implicitWait(driver, 2000);
			driver.findElement(By.xpath("//span[text()='Message sent']"));
			Reporter.log("Message Sent Popup shown Sucessfully");
	}

	@When("^I close browser$")
	public void i_close_browser()
	{
		driver.close();
	}
	
}
