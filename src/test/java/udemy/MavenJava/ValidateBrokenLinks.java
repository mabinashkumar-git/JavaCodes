package udemy.MavenJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateBrokenLinks {
	
	@Test
	public void framesTest() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		/* Gives the count of the no of frames present in UI*/
		System.out.println("No of frames :"+driver.findElements(By.tagName("iframe")).size());
		
		/* Gives the count of no of links present in UI*/
		// NOTE : If a link is present then for sure it will have 'a' as it's tag name
		System.out.println("No of links present :" + driver.findElements(By.tagName("a")).size());
		
		/* Finding all links in Footer sections only */
		WebElement FooterSection =  driver.findElement(By.id("gf-BIG"));
		System.out.println("No of links present in Footer section :" + FooterSection.findElements(By.tagName("a")).size());
		
		
	}
	
	
	/**
	 * This method gives the no of broken links in a page.
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void brokeLinkTest() throws  IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
//		WebElement url = driver.findElement(By.cssSelector("a[href*='brokenlink']"));
//		String URL = url.getAttribute("href");
//		System.out.println(URL);
//		/* openConnection() is a method in URL class*/
//		HttpURLConnection connection = (HttpURLConnection)new URL(URL).openConnection();
//		connection.setRequestMethod("HEAD");
//		connection.connect();
//		int responsecode = connection.getResponseCode();
//		System.out.println(responsecode);
		
		
		List<WebElement> urls = driver.findElements(By.cssSelector("li[class='gf-li']"));
		int urlsize = urls.size();
		System.out.println("No of URL's present : "+ urlsize);
		Thread.sleep(2000);
		SoftAssert softassert = new SoftAssert();
		for(WebElement url :urls) {
//		for(int i=1; i<=urlsize; i++) {
//			String beforexpath = "(//li[@class='gf-li'])[";
//			String afterxpath = "]";
//			WebElement UrL = driver.findElement(By.xpath(beforexpath +i +afterxpath ));
//			System.out.println(UrL);
//			String URL = UrL.getAttribute("href");
			String URL = url.getAttribute("href");
			System.out.println("URL is :"+URL);
			/* openConnection() is a method in URL class*/
			HttpURLConnection connection = (HttpURLConnection)new URL(URL).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responsecode = connection.getResponseCode();
			System.out.println("Response code :"+responsecode);
			
			softassert.assertTrue(responsecode<400, "The link : " + url.getText() +" is failed with error code :" + responsecode);
//			if(responsecode>=400) {
//				System.out.println("The link : " + url.getText() +" is failed with error code :" + response code);
//			}
		}
		/* Stores all condition and fails at last, stops script to fail in middle if certain condition are not meant 
		 * Follow Section.14 and 119th Lecture */
		softassert.assertAll();
		
		driver.close();
		
	}

}
