package udemy.MavenJava;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabs {
	
	@Test
	public void saucelabtests() throws MalformedURLException {
		
		final String USERNAME = "mabinashkumar";
		final String ACCESS_KEY = "9c3af08e-da3c-4ea2-9ac2-cd85090666e8";
		final String URL = "http://" + USERNAME + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");
		
		/* To get this code got to link : https://wiki.saucelabs.com/display/DOCS/ -> Select "Platform Configurator" 
		 * under "THE SAUCELABS COOK BOOK" */
		MutableCapabilities sauceOptions = new MutableCapabilities();

//		ChromeOptions browserOptions = new ChromeOptions();
//		browserOptions.setExperimentalOption("w3c", true);
//		browserOptions.setCapability("platformName", "Windows 10");
//		browserOptions.setCapability("browserVersion", "76.0");
//		browserOptions.setCapability("sauce:options", sauceOptions);
		
//		WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
	}

}
