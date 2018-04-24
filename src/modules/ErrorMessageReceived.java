package modules;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import helpers.Log;
import pageobjects.ContactForm;

public class ErrorMessageReceived{
	public static void Executer(WebDriver driver) {
		assertTrue(ContactForm.errormsg.isDisplayed());
//		Log.info("Error Message Shows Properly");
	}
}