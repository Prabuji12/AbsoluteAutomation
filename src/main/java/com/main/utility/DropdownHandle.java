package com.main.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	
	
	Select sel;
	
	public void selectbyText(WebElement element, String text)
	{
		sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyIndex(WebElement element, int index)
	{
		sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectbyValue(WebElement element, String val)
	{
		sel= new Select(element);
		sel.selectByValue(val);
	}
	
	
	
	public void deselectbyText(WebElement element, String text)
	{
		sel= new Select(element);
		sel.deselectByVisibleText(text);
	}
	
	public void deselectbyIndex(WebElement element, int index)
	{
		sel= new Select(element);
		sel.deselectByIndex(index);
	}
	
	public void deselectbyValue(WebElement element, String val)
	{
		sel= new Select(element);
		sel.deselectByValue(val);
		
	}
	
	
	public void deselectAll(WebElement element, String val)
	{
		sel= new Select(element);
		sel.deselectAll();
		
	}
	
	public List<WebElement> getOptions(WebElement element, String val)
	{
		sel= new Select(element);
		return sel.getOptions();
		
	}
	
	public List<WebElement> getSelectedOptions(WebElement element, String val)
	{
		sel= new Select(element);
		return sel.getAllSelectedOptions();
		
	}
	
		
	

}
