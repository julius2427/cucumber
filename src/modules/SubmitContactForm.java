package modules;

//import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

//import helpers.Log;
import pageobjects.ContactForm;

public class SubmitContactForm{
		private static String Status;
		public static void UpdateStatus(String newStatus) {
			Status = newStatus;
			
			System.out.println("NEW STATUS SHOULD BE UPDATED PROPERLY" + Status);
		}
		public static void Execute(WebDriver driver) throws Exception{			
			System.out.println("PRINT OUT OF WHAT THE STATUS FIELD EQUALS!!!! " + Status);
			switch(Status) {
			case "main":
				ContactForm.submit.click();
				break;
			case "modaldeny":
				ContactForm.modaldeny.click();
				break;
			case "modalconfirm":
				ContactForm.modalconfirm.click();
				break;
			}

			Thread.sleep(10000);

		}
		
}

