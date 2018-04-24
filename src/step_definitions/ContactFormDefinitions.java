package step_definitions;

import java.util.Map;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

///import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.ErrorMessageReceived;
import modules.FillOutAddress;
import modules.FillOutContactForm;
import modules.SmartyStreetsValidation;
import modules.SubmitContactForm;
import modules.VerifyContactForm;
import pageobjects.ContactForm;

public class ContactFormDefinitions extends AbstractPageStepDefinition{
	private Map<String, String> contactInfo;
	WebDriver driver = getDriver();
	
	@And("^I submit the contact form$")
	public void submit_contactform() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SubmitContactForm.UpdateStatus("main");
		SubmitContactForm.Execute(driver);
	}
	
	@And("^enter required fields with exception to address$")
	public void filloutcontactform(Map<String, String> contactinfo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.contactInfo = contactinfo;
		System.out.println("THIS MAP CONTAINS THE FOLLOWING!!!! " + contactInfo.toString());
		
		for(String key: contactinfo.keySet()) {
			System.out.println("Key: " + key + " value: " + contactInfo.get(key).toString());
			switch(key) {
			case "InputFirstName":
				FillOutContactForm.setInputFirstName(contactInfo.get(key).toString());
				break;
			case "InputLastName":
				FillOutContactForm.setLastName(contactInfo.get(key).toString());
				break;
			case "InputPhone":
				FillOutContactForm.setInputPhone(contactInfo.get(key).toString());
				break;
//			case "InputPostalCode":
//				FillOutContactForm.setInputPostalCode(contactInfo.get(key).toString());
//				break;
			case "InputEmail":
				FillOutContactForm.setInputEmail(contactInfo.get(key).toString());
				break;
			case "InputComments":
				FillOutContactForm.setComments(contactInfo.get(key).toString());
				break;	
			}
		}
		FillOutContactForm.Executer(driver);
	}


	@And("^Enter Address \"([^\"]*)\" and Zip \"([^\"]*)\"$")
	public void enter_address(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FillOutAddress.Executor(driver, arg1, arg2);
		Thread.sleep(10000);
	}

	@And("^Submit Contact Form$")
	public void submit_Contact_Form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SubmitContactForm.UpdateStatus("main");
		SubmitContactForm.Execute(driver);
	}


	@Then("^Smarty Street Validation should not find address$")
	public void smarty_street_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactForm.class);
		SmartyStreetsValidation.setStatus("invalid_address");
		SmartyStreetsValidation.Executor(driver);
	}
	
	//UPDATED THIS TO SCENARIO OUTLINE
	@Then("^SmartyStreet Validation \"([^\"]*)\"$")
	public void smartystreet_Validation(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactForm.class);
		SmartyStreetsValidation.setStatus(arg1);
		SmartyStreetsValidation.Executor(driver);
	}

	@And("^Submit Original Address$")
	public void submit_original_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SubmitContactForm.UpdateStatus("modaldeny");
		SubmitContactForm.Execute(driver);
	}

	@Then("^Successful submission$")
	public void successful_submission() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		VerifyContactForm.VerifySubmission();
		
	}
	@Then("^receive error message$")
	public void error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
		PageFactory.initElements(driver, ContactForm.class);
		ErrorMessageReceived.Executer(driver);
	}
	
	@When("^Enter Valid Address \"([^\"]*)\" and Zip \"([^\"]*)\"$")
	public void enter_Valid_Address_and_Zip(String arg1, String arg2) throws Throwable {
		FillOutAddress.Executor(driver, arg1, arg2);
	}
}