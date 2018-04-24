package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.ContactForm;

public class FillOutContactForm{
	private static String FirstName;
	private static String LastName;
	private static String Phone;
//	private static String PostalCode;
	private static String Email;
	private static String Company;
	private static String Comments;
	public FillOutContactForm() {
		
		}

	public static void Executer(WebDriver driver) {
		ContactForm.firstname.clear();
		ContactForm.lastname.clear();
		ContactForm.postalcode.clear();
		ContactForm.phone.clear();
		ContactForm.email.clear();
		ContactForm.company.clear();
		ContactForm.comments.clear();
		
		System.out.println("CONTACT FORM FIRST NAME = " + FillOutContactForm.FirstName);
		ContactForm.firstname.sendKeys(FillOutContactForm.FirstName);
		ContactForm.lastname.sendKeys(FillOutContactForm.LastName);
		ContactForm.phone.sendKeys(FillOutContactForm.Phone);
		ContactForm.email.sendKeys(FillOutContactForm.Email);
		ContactForm.company.sendKeys(FillOutContactForm.Company);
		ContactForm.comments.sendKeys(FillOutContactForm.Comments);
		ContactForm.option0.click();
		ContactForm.option1.click();
		ContactForm.option2.click();
		ContactForm.option3.click();
		ContactForm.option4.click();
		ContactForm.option5.click();
		
	}
	public static void setInputFirstName(String inputFirstName) {
		FillOutContactForm.FirstName = inputFirstName;
	}
	public static void setLastName(String inputLastName) {
		FillOutContactForm.LastName = inputLastName;
	}
	public static void setInputPhone(String InputPhone) {
		FillOutContactForm.Phone = InputPhone;
	}
/*	public static void setInputPostalCode(String InputPostalCode) {
		FillOutContactForm.PostalCode = InputPostalCode;
	}*/
	public static void setInputEmail(String inputEmail) {
		FillOutContactForm.Email = inputEmail;
	}

	public static void setCompany(String company) {
		FillOutContactForm.Company = company;
	}
	public static void setComments(String comments) {
		FillOutContactForm.Comments = comments;
	}
}
