package com.main.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	
	Actions action;
	
	public void moveToElementClick(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.moveToElement(element).click();
	}
	
	public void contextClick(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.contextClick(element).click();
	}
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.doubleClick(element).click();
	}
	
	
	public void actionClick(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.click(element);
	}
	
	public void dragAndDrop(WebDriver driver, WebElement element1, WebElement element2)
	{
		action= new Actions(driver);
		action.dragAndDrop(element1, element2);
	}
	
	
	public void clickAndHold(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.clickAndHold(element);
	}
	
	public void release(WebDriver driver, WebElement element)
	{
		action= new Actions(driver);
		action.release(element);
	}

}
