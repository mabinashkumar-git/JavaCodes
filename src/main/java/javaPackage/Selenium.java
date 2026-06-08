package javaPackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium {

    @Test
    public void PractiseSelenium() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mobile");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        // Take screenshot and save it in the project folder
        File src = ((ChromeDriver) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        System.out.println(src.getAbsolutePath());

        //code for double click
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();

        //code for right click
        WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions1 = new Actions(driver);
        actions1.contextClick(element1).perform();

        //code for mouse hover
        WebElement element2 = driver.findElement(By.id("nav-link-accountList"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(element2).perform();

        //code for drag and drop
        WebElement source = driver.findElement(By.id("sourceElementId"));
        WebElement target = driver.findElement(By.id("targetElementId"));
        Actions actions3 = new Actions(driver);
        actions3.dragAndDrop(source, target).perform();

        //code for keyboard actions
        WebElement inputField = driver.findElement(By.id("inputFieldId"));
        Actions actions4 = new Actions(driver);
        actions4.sendKeys(inputField, "Hello").perform();

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('This is a JavaScript alert!');"); // Trigger a JavaScript alert
        driver.switchTo().alert().accept(); // Accept the alert

        //code for handling JavaScript prompts
        js.executeScript("var userInput = prompt('Please enter your name:'); alert('Hello, ' + userInput + '!');"); // Trigger a JavaScript prompt
        driver.switchTo().alert().accept(); // Accept the prompt

        //code for handling JavaScript confirmations
        js.executeScript("if (confirm('Do you want to proceed?')) { alert('You chose to proceed!'); } else { alert('You chose to cancel!'); }"); // Trigger a JavaScript confirmation
        driver.switchTo().alert().accept(); // Accept the confirmation

        //code for handling JavaScript scrolling
        js.executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Scroll to the bottom of the page

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
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver1 = new ChromeDriver(options);


    }
}
