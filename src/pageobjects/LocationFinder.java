package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationFinder extends BaseClass {
	public LocationFinder(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.CSS, using=".lf-ZipSearchContainer")
	public static WebElement locmaincontainer;

	@FindBy(how=How.CSS, using=".filterHeader")
	public static WebElement filter;

	@FindBy(how=How.CSS, using=".lf-lb-lc-location")
	public static WebElement locationdetail;

	@FindBy(how=How.ID, using="radio200")
	public static WebElement distance200;
	
	@FindBy(how=How.ID, using="locationFinderFindALocationInputSearch")
	public static WebElement searchinput;

	@FindBy(how=How.CLASS_NAME, using="lf-lb-noResults")
	public static WebElement nolocation;
	
	@FindBy(how=How.CLASS_NAME, using="lf-lb-locationsContainer")
	public static WebElement locationfound;
}


//lf-lb-locationsContainer