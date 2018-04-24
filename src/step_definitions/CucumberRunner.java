package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber"},
		features = "classpath:cucumber/features/",
		tags = {"@stage_contact_form"}
		)

public class CucumberRunner{

}