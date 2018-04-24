package step_definitions;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.LocationVerification;
import pageobjects.LocationFinder;
public class LocationFinderStepDefinitions extends AbstractPageStepDefinition{
	private String newURL;
	WebDriver driver = getDriver();
	
	
	@When("^you navigate to location finder$")
	public void you_navigate_to_location_finder() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		newURL = driver.getCurrentUrl().toString();
		newURL = newURL + "location-finder";
		System.out.println("CURRENT URL" + driver.getCurrentUrl().toString());
		driver.navigate().to(newURL);
	}

	@Then("^verified \"([^\"]*)\" Location Finder Shows Properly\\.$")
	public void verified_Location_Finder_Shows_Properly(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, LocationFinder.class);
		LocationVerification.LocationContainer();
	}
	@And("^search using \"([^\"]*)\"$")
	public void search_using(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, LocationFinder.class);
		LocationVerification.setSearch(arg1);
		LocationVerification.FinderSetLocation();
		LocationVerification.submitSearch();
		Thread.sleep(5000);
	}

/*	@Then("^Show No Locations Found$")
	public void show_No_Locations_Found() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("MADE IT TO VERIFICATION OF NO LOCATIONS FOUND");
		LocationVerification.nolocations();
		LocationVerification.Execute(driver, "locationscreenshot");
	}*/

	@And("^Show Proper Locations Found$")
	public void show_Proper_Locations_Found() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LocationVerification.locationsfound();
		
	}
	@Then("^Locations Found \"([^\"]*)\"$")
	public void locations_Found(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean locationresult = Boolean.parseBoolean(arg1);
		if(locationresult) {
			LocationVerification.locationsfound();
		}
		else {
			LocationVerification.nolocations();
		}
	}

}
