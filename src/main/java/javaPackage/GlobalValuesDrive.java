package javaPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.getProperty("browser");
		System.out.println(System.getProperty("browser"));
		
		Properties property = new Properties();
		
		FileInputStream fis = new FileInputStream("F:\\Selenium\\UdemyWorkspace\\CoreJava\\src\\data.properties");
		property.load(fis);
		System.out.println(property.getProperty("browser"));
		
		//Changing the browser value in property file explicitly
		property.setProperty("browser", "firefox");
		System.out.println(property.getProperty("browser"));
		
		//Update the value in properties file 
		FileOutputStream fos = new FileOutputStream("F:\\Selenium\\UdemyWorkspace\\CoreJava\\src\\data.properties");
		property.store(fos, "Update the values in property file");

	}

}
