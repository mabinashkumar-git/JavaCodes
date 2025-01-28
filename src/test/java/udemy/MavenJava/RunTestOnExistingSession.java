package udemy.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RunTestOnExistingSession {
	
	
	/**
	 * For details follow -> https://www.youtube.com/watch?v=Rrkj4tdXngY&t=447s
	 */
	@Test
	public void reunTestOnEsistingBrowserSession() {
		
		/* This line checks for chromedriver in local, if not found, it downloads the driver automatically starts browser */
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		/* ChromeOptions is a class in Selenium which is used to configure user setting */
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.setExperimentalOption("debuggerAddress", "localhost:8080");
		
		WebDriver driver = new ChromeDriver();
		
	}

}
