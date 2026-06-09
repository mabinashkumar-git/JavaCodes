package javaPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

public class PractiseSelenium {

    @FindBy(name = "q")
    WebElement username;

    @FindBy(name = "q")
    WebElement password;



    @Test
    public void practiseSeleniumTesting() {

        WebDriver driver = new ChromeDriver();
//        WebDriver driver1 = new FirefoxDriver();
//        WebDriver driver2 = new SafariDriver();

        Properties properties = new Properties();
        properties.setProperty("browser", properties.getProperty("chromeBrowser"));

        driver.get("https://www.google.com/");

        // code for fluent wait

        FluentWait fluentWait = new FluentWait(driver);
         fluentWait.withTimeout(java.time.Duration.ofSeconds(30))
                 .pollingEvery(java.time.Duration.ofSeconds(5));


         WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Selenium");

         username.sendKeys("Selenium");
         password.sendKeys("Selenium");

         List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
            for(WebElement row : rows){
                System.out.println(row.getText());
            }


    }
}
