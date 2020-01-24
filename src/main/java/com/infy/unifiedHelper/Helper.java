package com.infy.unifiedHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 *  @Author - Suchayan Biswas 
 *  Class contains all helper methods user in entire regression existing suite
 * 	1. Search
 * 	2. Select (Single instance)
 *  3. DropBox(iterate through row/col)
 *  4. Alerts
 * 	5. JS Executor
 *	6. Screenshot
 *	7. Windows
 *	Rest of the methods can be added as per need 
 * */

public class Helper {
	WebDriver driver=null;
	
	/*
	 * Search operations 
	 */
	public String SearchCSS( String elem) {
		return driver.findElement(By.cssSelector(elem)).getText();
				
	}
	
	
	public void SearchByAttr( WebElement elem, String attr) {
		elem.getAttribute(attr.trim());
		
		
	}
	
	
	
	public  void selectByIndex(WebElement elem,int index) {
		Select select = new Select(elem);
		select.selectByIndex(index);
		
		
	}
	
	public void selectByValue(WebElement elem,String identifier) {
		Select select = new Select(elem);
		select.selectByValue(identifier);
		
	}
	
	public void selectByText(WebElement elem,String identifier) {
		Select select = new Select(elem);
		select.selectByVisibleText(identifier);
		
	}
	
	
	
	
	
	
	

}
