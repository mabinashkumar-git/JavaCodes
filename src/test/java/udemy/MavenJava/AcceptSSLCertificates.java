package udemy.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptSSLCertificates {
	
	public void acceptSSLCertificates() {
		
		/* Code to accept SSL Certifications */
		/* Examples of SSl Certificates : "https://www.google.com/search?q=chrome+ssl+certificates&sxsrf=ALeKk00tHRLnJKdyJq5gdQABFJR9xPrTlg:1621596423672&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjS3bS21drwAhU0zDgGHcqZCDkQ_AUoAnoECAEQBA&biw=1536&bih=722 " */
		
		/* DesiredCapabilities is a class which helps to customize chrome uses */
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions ch = new ChromeOptions();
		ch.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
}
