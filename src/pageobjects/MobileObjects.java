package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobileObjects extends BaseClass{
	public MobileObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.ID, using="service_grid-mobile")
	public static WebElement servicegrid;
	
	@FindBy(how=How.ID, using="CareersLink")
	public static WebElement careerslink;
	
	@FindBy(how=How.ID, using="ContactUsLink")
	public static WebElement contactuslink;
	
	@FindBy(how=How.CSS, using =".meanmenu-reveal")
	public static WebElement menureveal;
	
	@FindBy(how=How.ID, using="MobileHeaderPlaceHolder_T981C7CEC020_LocationFinderLink")
	public static WebElement findlocation;
	
	@FindBy(how=How.ID, using="accordion")
	public static WebElement homegrid;
	
	
}