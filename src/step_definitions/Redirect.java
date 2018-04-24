package step_definitions;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.NavigateCintas;
import modules.VerifySSL;

public class Redirect extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@Given("^We navigate to homepage for '(.*)'")
	public void mobilenavigation(String BaseURL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigateCintas.setURL(BaseURL);
		NavigateCintas.Execute(driver);
	}
	
	@When("^I navigate to homepage$")
	public void Navigate_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify that I have been redirected to SSL pages$")
	public void Verify_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		VerifySSL.Execute(driver);
	}

	
}