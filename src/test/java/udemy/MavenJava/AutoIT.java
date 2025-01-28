package udemy.MavenJava;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoIT {
	
	WebDriver driver;
	
	
	@Test
	public void autoIT() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(3000);
		
		/* This is code of auto IT to handle web based pop-up.
		 * This automatically puts Username and Password in the required field and clicks on Ok/Submit/login button 
		 * Syntax for Auto IT : "http://Username:Password@Url" 
		 * By providing the above syntax This automatically puts Username and Password in the required field and 
		   clicks on Ok/Submit/login button after executing code "driver.findElement(By.linkText("Basic Auth")).click();" */
		
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
	
	
	@Test
	public void FileUploadByAutoIT() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		String downloadpath = System.getProperty("user.dir");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://altoconvertpdftojpg.com/");
		
//		driver.findElement(By.id("dropzoneInput-label")).click();
		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();
		Thread.sleep(3000);
		
		/* These are java codes which is use to get files from desired location - Follow video:340 */
		Runtime.getRuntime().exec("F:\\Selenium\\RandomExecutionFiles\\FileUpload.exe");
//		Thread.sleep(15000);
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		
		// Code to click on 'Convert Now' button 
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[class*='btn--medium']"))));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='btn--medium']")));
		driver.findElement(By.cssSelector("[class*='btn--medium']")).click();
		
		// Code to click on 'Download' button 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='btn-auto-width']")));
		driver.findElement(By.cssSelector("[class*='btn-auto-width']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
//		driver.findElement(By.linkText("Download")).click();
		
		WebElement popup = driver.findElement(By.cssSelector("[class*='review-sites-popup__window']"));
		if(popup.isDisplayed()) {
			System.out.println("Pop-up displayed");
			driver.findElement(By.cssSelector("[class*='review-sites-popup__close']")).click();
		}
		else {
			System.out.println("Pop-up do not display");
		}
		
		Thread.sleep(5000);
		
		/* Checking if the file got download in local */
//		File file = new File("C:\\Users\\Abinash\\Downloads\\1.jpg");
		
		/* Checking if the file got download in our project */
		File file = new File(downloadpath + "/1.jpg");
		if(file.exists()) {
			System.out.println("File found");
			/* Checks if File is present or not, if not it will fail the script */
//			Assert.assertTrue(file.exists());
			
			/* Deletes the file */
			file.delete();
			System.out.println("File deleted");
		}
		else {
			System.out.println("File not Found");
		}
		
		driver.close();
		
	}
	

}
