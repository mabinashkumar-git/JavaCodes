package udemy.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	
	
	ExtentReports report;
	
	@BeforeTest
	public void config() {
		/* The below line gives you the path of the project*/
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; 
		System.out.println("Path is :" + path);
		
		/* ExtentSparkReporter is responsible to create html file and do configurations*/
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		/* ExtentReports is the main class which will be used to drive all reporting executions */
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Abinash");
			
	}
	
	@Test
	public void ExtentreportDemo() {
		
		/* Whenever we call 'createTest' method a object is created which will be unique to the '@Test' method. 
		   Now 'test' is the object of 'ExtentTest' which is created and it reports all the happenings back to extent report.*/
		ExtentTest test = report.createTest("Extent Report Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
//		test.fail("Results do not match");
		/* This commands tells that test is done, so no more monitoring is required */
		report.flush();
		
	}

}
