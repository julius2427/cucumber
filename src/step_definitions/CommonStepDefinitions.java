package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import modules.NavigateCintas;
import modules.OpenContactForm;
import pageobjects.ContactForm;

public class CommonStepDefinitions extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	
	@Given("^We are on cintas homepage in \"([^\"]*)\"$")
	public void cintas_environment(String Arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		NavigateCintas.setURL(Arg1);
		NavigateCintas.Execute(driver);
	}
	@When("^open the contact form$")
	public void open_contactform() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactForm.class);
		OpenContactForm.Execute(driver);
	}
	
	@Given("^We are in \"([^\"]*)\" on homepage$")
	public void we_are_in_on_homepage(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigateCintas.setURL(arg1);
		NavigateCintas.Execute(driver);
	}
	
}