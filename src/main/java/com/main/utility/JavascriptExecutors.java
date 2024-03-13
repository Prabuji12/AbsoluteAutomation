package com.main.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutors {
	
	JavascriptExecutor js;
	
	public void jsElementClick(WebDriver driver, String element)
	{
		js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementByID(element).click();");	
	}
	
	public void jsArgumentClick(WebDriver driver, WebElement element)
	{
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);	
	}
	
	
	public void jsSendKeys(WebDriver driver, String element, String val)
	{
		js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementByID(element).value = val;");	
	}
	
	public void jsPageRefresh(WebDriver driver)
	{
		js= (JavascriptExecutor) driver;
		js.executeScript("location.reload()");	
	}

	//Navigate to new Page i.e to generate access page. (launch new url)
	public void jsNavigatePage(WebDriver driver, String url)
	{
		js= (JavascriptExecutor) driver;
		js.executeScript("window.location = url");	
	}
	
    //Method document.title fetch the Title name of the site. Tostring() change object to name		
	public String jsGetTitle(WebDriver driver)
	{
		js= (JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();
		
	}
	
    //Fetching the URL of the site. Tostring() change object to name		
	public void jsScrollByPixel(WebDriver driver, int start, int end)
	{
		js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(start,end)");				
	}
	
	
	public void jsScrollDownToBottom(WebDriver driver)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void jsScrollUpToTop(WebDriver driver)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	
	public void jsScrollIntoElement(WebDriver driver, WebElement element)
	{ 	
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
}
