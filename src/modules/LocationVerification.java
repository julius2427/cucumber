package modules;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pageobjects.LocationFinder;

public class LocationVerification {
	private static String location = "Find a Location";
	private static String Search;
	public static void Execute(WebDriver driver, String Arg1) {
		
		
		System.out.println("Made it into Execute section");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("/Users/julius/eclipse-workspace/Cintas/screenshots/" + Arg1));
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void LocationContainer() {
		assertTrue(LocationFinder.locmaincontainer.isDisplayed());
		assertThat(LocationFinder.locmaincontainer.getText(), containsString(LocationVerification.location));

	}
	public static void FinderSetLocation() {
		System.out.println("Search equals the following " + LocationVerification.Search);
		LocationFinder.searchinput.sendKeys(LocationVerification.Search);
	}
	public static String getSearch() {
		return Search;
	}
	public static void setSearch(String search) {
		Search = search;
	}
	public static void submitSearch() {
		LocationFinder.searchinput.sendKeys(Keys.ENTER);
	}
	public static void nolocations() {
		System.out.println("RESULTS ARE " + LocationFinder.nolocation.isDisplayed());
		assertTrue(LocationFinder.nolocation.isDisplayed());
	}
	public static void locationsfound() {
		assertTrue(LocationFinder.locationfound.isDisplayed());
		
	}
}