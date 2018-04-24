package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.ContactForm;

public class FillOutAddress{
	public static void Executor(WebDriver driver, String address, String zip) {
			ContactForm.address.sendKeys(address);
			ContactForm.postalcode.sendKeys(zip);
			
			System.out.println("ADDRESS EQUALS " + address + " Zip EQUALS " + zip);
	}
}