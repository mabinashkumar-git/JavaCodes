package javaPackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.aspectj.util.FileUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class Selenium {

    //code for handling web elements using PageFactory
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBoxGlobal;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']/following-sibling::input[@type='submit']")
    WebElement testLocator;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']/parent::div/following-sibling::div//input[@type='submit']")
    WebElement testLocator1;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']/ancestor::div[@id='nav-search']/descendant::input[@type='submit']")
    WebElement testLocator2;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']/preceding-sibling::input[@type='submit']")
    WebElement testLocator3;

    // code for highlighting an element using JavaScriptExecutor
    public void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    @Test
    public void PractiseSelenium() throws IOException, AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");           // Run Chrome in headless mode
        WebDriver driver = new ChromeDriver(options);

        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.manage().window().maximize();
            driver.manage().window().fullscreen();

            //code for handling dynamic tables
            List<WebElement> rows = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr"));
            for(WebElement row : rows){
                List<WebElement> columns = row.findElements(By.tagName("td"));
                for(WebElement column : columns){
                    if(column.getText().equals("Dwayne")){
                        WebElement amount = row.findElement(By.xpath("./td[4]")); // Assuming the amount is in the 3rd column
                        highlightElement(driver, amount);
                        System.out.println("Amount for Dwayne: " + amount.getText());
                        Thread.sleep(5000);
                        break;
                    }
                }
            }

            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("Mobile");
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();


            // Take screenshot and save it in the project folder
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File("screenshot.png");
            FileUtil.copyFile(scrFile, destFile);


            //code for double click
            WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
            actions.doubleClick(element).perform();


            //code for right click
            WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
            actions.contextClick(element1).perform();


            //code for mouse hover
            WebElement element2 = driver.findElement(By.id("nav-link-accountList"));
            actions.moveToElement(element2).perform();


            //code for drag and drop
            WebElement source = driver.findElement(By.id("sourceElementId"));
            WebElement target = driver.findElement(By.id("targetElementId"));
            actions.dragAndDrop(source, target).perform();


            //code for keyboard actions
            WebElement inputField = driver.findElement(By.id("inputFieldId"));
            actions.sendKeys(inputField, "Hello").perform();


            //code for handling alerts
            driver.switchTo().alert().accept(); // To accept the alert
            driver.switchTo().alert().dismiss(); // To dismiss the alert


            //code for handling frames
            driver.switchTo().frame("frameNameOrId"); // Switch to frame by name or ID
            driver.switchTo().frame(0); // Switch to frame by index
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frameSource']"))); // Switch to frame by WebElement


            //code for handling multiple windows
            String parentWindow = driver.getWindowHandle(); // Get the current window handle
            driver.findElement(By.id("openNewWindowButton")).click(); // Open a new window
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(parentWindow)) {
                    driver.switchTo().window(windowHandle); // Switch to the new window
                    break;
                }
            }


            //code for handling dropdowns
            WebElement dropdown = driver.findElement(By.id("dropdownId"));
            dropdown.click(); // Click to open the dropdown
            WebElement option = driver.findElement(By.xpath("//option[@value='optionValue']"));
            option.click(); // Select the desired option


            Select select = new Select(dropdown);
            select.selectByVisibleText("Option Text"); // Select by visible text
            select.selectByValue("optionValue"); // Select by value
            select.selectByIndex(0); // Select by index


            //code for handling checkboxes and radio buttons
            WebElement checkbox = driver.findElement(By.id("checkboxId"));
            if (!checkbox.isSelected()) {
                checkbox.click(); // Select the checkbox if it's not already selected
            }


            //code for handling file uploads
            WebElement fileInput = driver.findElement(By.id("fileInputId"));
            fileInput.sendKeys("C:\\path\\to\\your\\file.txt"); // Provide the file path to upload


            //code for handling JavaScript alerts
//            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('This is a JavaScript alert!');"); // Trigger a JavaScript alert
            driver.switchTo().alert().accept(); // Accept the alert

            //code for handling JavaScript prompts
            js.executeScript("var userInput = prompt('Please enter your name:'); alert('Hello, ' + userInput + '!');"); // Trigger a JavaScript prompt
            driver.switchTo().alert().accept(); // Accept the prompt

            //code for handling JavaScript confirmations
            js.executeScript("if (confirm('Do you want to proceed?')) { alert('You chose to proceed!'); } else { alert('You chose to cancel!'); }"); // Trigger a JavaScript confirmation
            driver.switchTo().alert().accept(); // Accept the confirmation

            //code for handling JavaScript scrolling
            js.executeScript("window.scrollBy(0, 500);");                        // Scroll down by 500 pixels
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Scroll to the bottom of the page
            js.executeScript("window.scrollTo(0, 0);");                          // Scroll to the top of the page
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("elementId"))); // Scroll to a specific element

            //code for handling JavaScript interactions
            WebElement element3 = driver.findElement(By.id("elementId"));
            js.executeScript("arguments[0].click();", element3); // Click an element
            js.executeScript("arguments[0].value='New Value';", element3); // Set the value of an input field


            //code to close the browser
            driver.quit();


            // code for handling cookies
            driver.manage().addCookie(new org.openqa.selenium.Cookie("cookieName", "cookieValue"));
            Cookie cookie = driver.manage().getCookieNamed("cookieName");
            System.out.println("Cookie value: " + cookie.getValue());


            //code for handling implicit waits
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit

            //code for handling Explicit waits
            WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId"))); // Wait until the

            //code for Fluent wait
            FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);


            //code for reading data from Excel file using Apache POI
            FileInputStream file = new FileInputStream(new File("path/to/excel/file.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            sheet.getRow(0).getCell(0).getStringCellValue(); // Read data from the first cell of the first row
            workbook.close();

            //code for writing data to Excel file using Apache POI
            XSSFWorkbook workbook1 = new XSSFWorkbook();
            XSSFSheet sheet1 = workbook1.createSheet("Sheet1");
            sheet1.createRow(0).createCell(0).setCellValue("Hello, World!"); // Write data to the first cell of the first row
            FileOutputStream outputStream = new FileOutputStream(new File("path/to/excel/file.xlsx"));
            workbook1.write(outputStream);
            workbook1.close();


            //code for opening a new tab and switching to it
            js.executeScript("window.open();"); // Open a new tab
            String originalWindow = driver.getWindowHandle();
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle); // Switch to the new tab
                    break;
                }
            }
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println("Number of open windows/tabs: " + windowHandles.size());
            driver.switchTo().window(originalWindow); // Switch back to the original window/tab


            //code for handling SSL certificates
//            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            WebDriver driver1 = new ChromeDriver(options);


            //code for handling browser navigation
            driver.navigate().to("https://www.example.com"); // Navigate to a URL
            driver.navigate().back(); // Navigate back
            driver.navigate().forward(); // Navigate forward
            driver.navigate().refresh(); // Refresh the page


            //code for handling browser cookies
            driver.manage().deleteAllCookies(); // Delete all cookies
            driver.manage().deleteCookieNamed("cookieName"); // Delete a specific cookie by name


            //code for handling browser window management
            driver.manage().window().maximize(); // Maximize the browser window
            driver.manage().window().fullscreen(); // Set the browser window to fullscreen


            //code for handling browser timeouts
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Set page load timeout
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); // Set script timeout


            //code for handling browser alerts
            Alert alert = driver.switchTo().alert();
            alert.accept(); // Accept the alert
            alert.dismiss(); // Dismiss the alert
            alert.sendKeys("Input text"); // Send text to the alert (for prompts)


            //code for handling browser frames
            driver.switchTo().frame("frameNameOrId"); // Switch to a frame by name or ID
            driver.switchTo().frame(0); // Switch to a frame by index
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frameSource']"))); // Switch to a frame by WebElement
            driver.switchTo().defaultContent(); // Switch back to the main content from a frame


            // code for writing in capital letters using Actions class
            WebElement inputField1 = driver.findElement(By.id("inputFieldId"));
            actions.moveToElement(inputField1).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform(); // Type "HELLO" in capital letters


            //code for handling windows based pop-ups
            // Note: Selenium cannot directly handle OS-level pop-ups, but you can use third-party tools like AutoIt (for Windows) or Robot class (for Java) to interact with such pop-ups.
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER); // Simulate pressing the Enter key to handle a pop-up
            robot.keyRelease(KeyEvent.VK_ENTER); // Simulate releasing the Enter key


            // Handle basic authentication pop-up by including credentials in the URL
            driver.get("https://admin:admin@the.internet.com");


            //code for handling AJAX calls
//            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajaxElementId"))); // Wait until the AJAX element is visible before interacting with it


            //code for handling dynamic elements
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dynamicElement']"))); // Wait until the dynamic element is present in the DOM before interacting with it


            //code for using diff assertions
            String expectedTitle = "Expected Page Title";
            String actualTitle = driver.getTitle();
            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Test Passed: Page title is as expected.");
            } else {
                System.out.println("Test Failed: Expected title '" + expectedTitle + "' but got '" + actualTitle + "'.");
            }


            //code for using TestNG or JUnit assertions
            // Using JUnit assertions
            Assert.assertEquals(expectedTitle, actualTitle, "Page title does not match the expected value.");

            // Using TestNG assertions
            Assertions.assertEquals(expectedTitle, actualTitle, "Page title does not match the expected value.");


            //code for handling browser console logs
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            for (LogEntry entry : logEntries) {
                System.out.println("[" + entry.getLevel() + "] " + entry.getMessage());
            }


            //code for locating elements using different strategies
            WebElement elementById = driver.findElement(By.id("elementId"));
            WebElement elementByName = driver.findElement(By.name("elementName"));
            WebElement elementByClassName = driver.findElement(By.className("elementClass"));
            WebElement elementByTagName = driver.findElement(By.tagName("elementTag"));
            WebElement elementByLinkText = driver.findElement(By.linkText("Link Text"));
            WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Partial Link Text"));
            WebElement elementByCssSelector = driver.findElement(By.cssSelector(".elementClass #elementId"));
            WebElement elementByXPath = driver.findElement(By.xpath("//div[@class='elementClass']"));



        }
        catch (Exception e){
            System.out.println("Exception occured :" + e.getMessage());
        }
        finally {
            driver.quit();
        }

    }

}
