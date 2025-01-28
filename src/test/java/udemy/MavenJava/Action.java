package udemy.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Action {
	
	
//	@FindBy(id="mousehover")
//	WebElement section_mousehover;(//button[@class='btn btn-primary'])[5]
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[5]")
	WebElement section_mousehover;
	
//	@FindBy(id="openwindow")
//	WebElement Button_OpenWindow;
	
	@FindBy(xpath="//button[@id='openwindow']")
	WebElement Button_OpenWindow;
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	WebElement text_FeaturedCourses;

	@Test
	public void demoaction() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		Actions action = new Actions(driver);
		
		WebElement searchNameField = driver.findElement(By.name("enter-name"));
		/* This clicks in particular field  by action class and then send letters to that field in Capital letter */
		action.moveToElement(searchNameField).click().keyDown(Keys.SHIFT).sendKeys("Abinash").perform();
		Thread.sleep(2000);
		searchNameField.clear();
		/* This clicks in particular field  by action class and then send letters to that field in Capital letter 
		   and doubleclicks in that field to select all letters*/
		action.moveToElement(searchNameField).click().keyDown(Keys.SHIFT).sendKeys("Abinash").doubleClick().perform();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		
		WebElement moveMouseHoverButton = driver.findElement((By.xpath("(//button[@class='btn btn-primary'])[5]")));
		action.moveToElement(moveMouseHoverButton).perform();
		Thread.sleep(2000);
		/* This right click in Mousehover field */
		action.moveToElement(moveMouseHoverButton).contextClick().perform();
		
		driver.close();
		
	}

}
