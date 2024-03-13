package com.main.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;

	public static WebDriver initializeDriver() throws IOException

	{
		// properties class
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "//src//main//java//com//main//properties//config.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		//chrome
		if (browserName.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
					+ "//drivers//chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			if(browserName.contains("headless")){
			options.addArguments("--headless--");
			}		
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1440,900));//full screen

		}
		// Firefox
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/rahulshetty//documents//geckodriver");
			driver = new FirefoxDriver();
			
		} 
		

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}
	
	public static void main(String args[]) throws IOException
	{
		initializeDriver();
	}
	
	

}
