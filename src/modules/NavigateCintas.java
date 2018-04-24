package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class NavigateCintas{
	private static String URL;
	public NavigateCintas() {
		URL = "staging";
	}
	public static void Execute(WebDriver driver) throws Exception{
		switch(URL) {
		case "stagingus":
			driver.navigate().to("https://cintas-stage.willin.gs");	
			break;
		case "stagingca":
			driver.navigate().to("https://cintas-stage-ca.willin.gs");
			break;
			
		case "stagingcafr":
			driver.navigate().to("https://cintas-stage-ca.willin.gs/fr");
			break;
		case "productionus":
			driver.navigate().to("http://cintas.com");
			break;
		case "productionca":
			driver.navigate().to("http://cintas.ca");
			break;
		case "productioncafr":
			driver.navigate().to("http://cintas.ca/fr");
			break;
		default: 
			throw new RuntimeException("No Environment Selected");
		}
		driver.manage().timeouts().implicitlyWait(2,  TimeUnit.SECONDS);
		System.out.println("Environment is " + URL);
	
	}
	public static void setURL(String URL){
		NavigateCintas.URL = URL;
	}
	
}