package udemy.MavenJava;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import bsh.StringUtil;

public class SeleniumTest {
	
	
	@FindBy(id= "dropdown-class-example")
	private WebElement DropdownExample;
	
	@FindBy(id="alertbtn")
	WebElement alertButton;
	
	
	@Test
	public WebElement test12() {
		
		return DropdownExample;
	}
	
	@Test
	public void DemoSelenium1() throws InterruptedException {
		System.out.println("DemoSelenium1");
//		Assert.assertEquals(false, true);
		
		/* Declaration of an array*/
//		int A[] = new int[5];
//		String names[] = {"A","B","C"};
		
		/*Convert Array( i.e names[]) to arrayList*/
//		List nameOfList = Arrays.asList(names);
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Thread.sleep(3000);
		Select dropdown = new Select(DropdownExample);
		String tagName = DropdownExample.getTagName();
		System.out.println("Tagname :" + tagName);
//		dropdown.selectByValue("option2");
		dropdown.selectByVisibleText("Option1");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		alertButton.click();
//		wait.until(ExpectedConditions.elementToBeClickable(alertButton));
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		 /* Code is written to scroll to particular location in browser*/ 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		/* Code to scroll content in a table present in page*/
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(3)"));
		for(int i=1; i<values.size(); i++) {
			String city = values.get(i).getText();
			System.out.println(city);
		}
//		driver.close();
	}
	
	@Test
	public void DemoSelenium2() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@Test
	public void DemoSelenium3() {
		System.out.println("DemoSelenium3");
		
	}

}
