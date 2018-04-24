package modules;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;


public class VerifySSL{
	public static void Execute(WebDriver driver) {
		{
			assertThat(driver.getCurrentUrl(), containsString("https://www.cintas"));
		}

	}
}