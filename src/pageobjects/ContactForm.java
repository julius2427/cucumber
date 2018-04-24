package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactForm extends BaseClass{
	public ContactForm(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.ID, using="ContactUsLinkBanner")
	public static WebElement mobilecontactus;
	
	@FindBy(how=How.CSS, using=".contact_box.contactNavClick")
	public static WebElement contactus;
	
	@FindBy(how=How.ID, using="InputComments")
	public static WebElement comments;
	
	@FindBy(how=How.ID, using="InputFirstName")
	public static WebElement firstname;
	
	@FindBy(how=How.ID, using="InputLastName")
	public static WebElement lastname;
	
	@FindBy(how=How.ID, using="InputCompany")
	public static WebElement company;

	@FindBy(how=How.ID, using="InputAddress")
	public static WebElement address;

	@FindBy(how=How.ID, using="InputPostalCode")
	public static WebElement postalcode;
	
	@FindBy(how=How.ID, using="InputPhone")
	public static WebElement phone;

	@FindBy(how=How.ID, using="InputEmail")
	public static WebElement email;

	@FindBy(how=How.ID, using="ContactInterestOptions_0")
	public static WebElement option0;

	@FindBy(how=How.ID, using="ContactInterestOptions_1")
	public static WebElement option1;
	
	@FindBy(how=How.ID, using="ContactInterestOptions_2")
	public static WebElement option2;
	
	@FindBy(how=How.ID, using="ContactInterestOptions_3")
	public static WebElement option3;

	@FindBy(how=How.ID, using="ContactInterestOptions_4")
	public static WebElement option4;
	
	@FindBy(how=How.ID, using="ContactInterestOptions_5")
	public static WebElement option5;
	
	@FindBy(how=How.ID, using="InputSubmitButton")
	public static WebElement submit;
	
	@FindBy(how=How.ID, using="ContactInterestErrorMsg")
	public static WebElement errormsg;
	
	@FindBy(how=How.ID, using="topContactForm")
	public static WebElement topContactForm;
	
	@FindBy(how=How.CSS, using=".modal-content.modalWindow")
	public static WebElement smartystreetmodal;
	
	@FindBy(how=How.ID, using="modal-msg")
	public static WebElement modalmessage;
	
	@FindBy(how=How.ID, using="modal-deny")
	public static WebElement modaldeny;
	
	@FindBy(how=How.ID, using="modal-confirm")
	public static WebElement modalconfirm;
	
	@FindBy(how=How.ID, using="ThankYouContainer")
	public static WebElement thankyou;
	
	
	
}