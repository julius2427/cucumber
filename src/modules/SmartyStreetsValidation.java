package modules;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import pageobjects.ContactForm;

public class SmartyStreetsValidation{
	private static String Status;
	public static void Executor(WebDriver driver) throws InterruptedException {
		switch (Status) {
			case "invalid_address":
				Thread.sleep(10000);
				assertTrue(ContactForm.smartystreetmodal.isDisplayed());
				System.out.println(ContactForm.modalmessage.getText());
				assertEquals(ContactForm.modalmessage.getText(),"We found an address that is close to yours, use this one instead?");
				break;
			case "invalid_addressfr":
				Thread.sleep(2000);
				assertTrue(ContactForm.smartystreetmodal.isDisplayed());
				assertEquals(ContactForm.modalmessage.getText(),"Nous avons trouvé une adresse à proximité de la vôtre; voulez-vous l’utiliser?");
				break;
			default:
				Thread.sleep(2000);
		}
	}
	public static String getStatus() {
		return Status;
	}
	public static void setStatus(String arg1) {
		Status = arg1;
	}
	
}