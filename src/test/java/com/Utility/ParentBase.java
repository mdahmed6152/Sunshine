package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentBase {
	
	public static Properties propp;
	public static WebDriver driver;
	
	
	public ParentBase() {
		
	 propp = new Properties();
		
try {
	FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\config\\config.properties");
			
	propp.load(file);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	
	public void browserint() {
		
		String browsername = propp.getProperty("browser1");
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestData.implicitlyWait, TimeUnit.SECONDS);
		
		}
		
		else if(browsername.equalsIgnoreCase("FireFox"));
		
		
		}
		
	public static void launchURL(String URL) {
		
		driver.get(propp.getProperty("url1"));
		
		
	}
	
	
	

}
