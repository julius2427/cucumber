package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPageStepDefinition {
	protected static WebDriver driver;
	private String environment;
	protected WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getEnvironment() {
		return environment;
	}
}
