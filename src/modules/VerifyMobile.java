package modules;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import pageobjects.ContactForm;
import pageobjects.MobileObjects;


public class VerifyMobile{
	public static void Execute(WebDriver driver) {
			MobileObjects.menureveal.click();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	public VerifyMobile() {
		assertTrue(MobileObjects.contactuslink.isDisplayed());
		assertTrue(MobileObjects.findlocation.isDisplayed());
		assertTrue(MobileObjects.servicegrid.isDisplayed());
		assertTrue(MobileObjects.homegrid.isDisplayed());
	}
}