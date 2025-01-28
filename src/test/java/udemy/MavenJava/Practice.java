package udemy.MavenJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	
	@Test
	public void practice() {
		
//		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Project\\Chrome Driver\\chromedriver.exe");
//		/* ChromeDriver is a class which is basically implementing WebDriver interface */
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		WebElement node = driver.findElement(By.xpath(""));
//		List<WebElement> nodes = driver.findElements(By.cssSelector(""));
//		
//		Stream<String> nodevalue = nodes.stream().map(s->s.getText()).sorted();
//		Stream<String> value = nodes.stream().map(s->s.getText());
//		List <String> cal = value.collect(Collectors.toList());
		
	}
	
	@Test
	public void removeDuplicateString() {
		System.out.println("**********************************************");
		String Array1[] = {"AB","AB","ABI"};
		String Array2[] = {"MA","MAL","MA"};
		
		List<String> name1 = Arrays.asList(Array1);
		List<String> name2 = Arrays.asList(Array2);
		Stream<String> disname = name1.stream().distinct();
		disname.forEach(s->System.out.println(s));
		
		System.out.println("**********************************************");
		
		Stream<String> sortname = name2.stream().filter(s->s.equalsIgnoreCase("MA"));
		sortname.forEach(s->System.out.println(s));
		
		System.out.println("**********************************************");
	}
	
	
	@Test
	public void removeDuplicateInteger() {
		System.out.println("*********** Starting removeDuplicateInteger() ********************");
		
		int Array1[] = {1,1,2,3,3,4,5,6,6};
		int Array3[] = {1,1,2,3,3,4,5,6,6};
		
		List<int[]> number1 = Arrays.asList(Array1);
		
		Stream<int[]> renum = number1.stream().distinct();
//		List<int[]> renum = number1.stream().distinct().collect(Collectors.toList());
		renum.forEach(s->System.out.println(s));
		Stream<int[]> rnum = number1.stream().filter(s->s.equals(7));
		rnum.forEach(s->System.out.println(s));
		
		System.out.println("************ Ending removeDuplicateInteger() **************");
	}
	
	@Test
	public void reverseString() {
		
		StringBuffer namestring = new StringBuffer("abcdefgh");
		System.out.println(namestring.reverse());
		
		/***************** OR **************/
		
		String name = "Abcdefgh";
		char[] charname = name.toCharArray();
		int charlength = charname.length;
		System.out.println(charlength);
		
		for(int i=charlength-1; i>0; i--) {
			System.out.println(charname[i]);
		}
		
		System.out.println("**********************************************");
	
	}
	
	
	@Test
	public void reverseinteger() {
		
		int A[] = {10,20,30,40,50};
		
		int sizeofA = A.length;
		System.out.println(sizeofA);
		
		int B[] = new int[sizeofA];
		int j =sizeofA;
		for(int i=0; i<sizeofA; i++) {
			
			 B[j-1] = A[i];
			 j= j-1 ;
		}
		
		for(int k=0;k<sizeofA; k++) {
			
			System.out.println("Array reverse : " + B[k] + " "); 
			
		}
		
		System.out.println("**********************************************");
		
	}
	
}
