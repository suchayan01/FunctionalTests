package com.infy.home.test.helpers.apparels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchBoxHelper {
	WebDriver driver;
	
	
	@FindBy(id="twotabsearchtextbox")
    WebElement SearchBoxID;
	
	@FindBy(id="searchDropdownBox")
	WebElement SearchBoxDropdown;
	
	
	public SearchBoxHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterSearchObj(String searchtext) {
		SearchBoxID.sendKeys(searchtext);
	}
	
	public void DropdownAllBtn() {
		Select select= new Select(SearchBoxDropdown);
		select.selectByValue("search-alias=todays-deals");
	}

	
}
