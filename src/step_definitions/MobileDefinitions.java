package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import modules.VerifyMobile;
import pageobjects.ContactForm;
import pageobjects.MobileObjects;

public class MobileDefinitions extends AbstractPageStepDefinition{
		WebDriver driver = getDriver();

		@Given("^We resize the window$")
		public void resize_window() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.manage().window().setSize(new Dimension(500,961));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@Then("^I verify mobile contacts the proper items$")
		public void verifymobile() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			PageFactory.initElements(driver, ContactForm.class);
			PageFactory.initElements(driver, MobileObjects.class);
			VerifyMobile.Execute(driver);
		}	
}