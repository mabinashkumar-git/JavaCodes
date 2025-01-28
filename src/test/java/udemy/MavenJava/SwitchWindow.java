package udemy.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchWindow {
	
	@Test
	public void switchwindow() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		

		/* Opening a new window*/
		WebElement openwindowbutton = driver.findElement(By.id("openwindow"));
		openwindowbutton.click();
//		Button_OpenWindow.click();
		String WindowHandel = driver.getWindowHandle();
		for(String WindowHandels : driver.getWindowHandles()) {
			driver.switchTo().window(WindowHandels);
		}
		Thread.sleep(3000);
		driver.switchTo().window(WindowHandel);
		
//		Thread.sleep(10000);
//		WebElement link_nothanks = driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]"));
//		link_nothanks.click();
//		String Featuretext = text_FeaturedCourses.getText();
//		System.out.println(Featuretext);
		
		driver.close();
	}

}
