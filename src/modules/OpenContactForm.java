package modules;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ContactForm;

public class OpenContactForm{
	
	public static void Execute(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ContactForm.contactus));
		ContactForm.contactus.click();
//		ContactForm.firstname.sendKeys("FirstName");
//		ContactForm.lastname.sendKeys("LastName");
//		ContactForm.submit.click();
		assertTrue(ContactForm.topContactForm.isDisplayed());
		Log.info("Contact Us Has Been Added");
	}
}