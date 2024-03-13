package com.main.utility;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	WebDriverWait wait;
	public void implicitWait(WebDriver driver, long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS) ;
	}
	
	
	public void webdriverWait(WebDriver driver, Duration duration, String xpathValue)
	{
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));		

	}
	
	public void fluentWait(WebDriver driver, Duration timeoutDuration, Duration pollingDuration,
			String xpathValue, final WebElement element)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(timeoutDuration) 			
				.pollingEvery(pollingDuration) 			
				.ignoring(NoSuchElementException.class);
				WebElement reqElement = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
					return element;
			}
		});
				
	}

}
