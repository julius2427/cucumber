package modules;

import static org.junit.Assert.assertTrue;

import pageobjects.ContactForm;

public class VerifyContactForm{
	public static void VerifySubmission() throws InterruptedException {
		assertTrue(ContactForm.thankyou.isDisplayed());
		System.out.println("VERIFIED ");
	}
}