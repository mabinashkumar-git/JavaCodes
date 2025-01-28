package udemy.MavenJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SortTableByStream {
	
	/**
	 * @throws InterruptedException
	 * This method uses Stream method to pick values from table
	 * Section 15th and Video : 113
	 */
	@Test
	public void sorttable() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		/* ChromeDriver is a class which is basically implementing WebDriver interface */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[3]"));
		List<String> fieldvalue = values.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println("Field Value :" + fieldvalue);
		Stream<String> sortedfieldvalue = values.stream().map(s->s.getText()).sorted();
		List<String> sortedfieldvalues = sortedfieldvalue.collect(Collectors.toList());
		System.out.println("Sorted field Value :" + sortedfieldvalues);
		System.out.println(fieldvalue.get(5));
		
		List<String> price = values.stream().filter(s->s.getText().contains("Delhi")).map(s->getAmount(s))
				.collect(Collectors.toList());
		System.out.println("Price for " + price);
		driver.close();
		
	}

	private String getAmount(WebElement s) {
		// TODO Auto-generated method stub
		WebElement pricevalue = s.findElement(By.xpath("following-sibling::td"));
		String Price = pricevalue.getText();
		System.out.println(Price);
		return Price;
	}

}
