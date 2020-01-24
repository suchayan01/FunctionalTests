package com.infy.home.test.helpers.apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApparelsOrderHelper {
	WebDriver driver;
	By mobiidentity= By.xpath("//img[@alt='Vivo U10']");
	public ApparelsOrderHelper( WebDriver driver) {
		this.driver=driver;
	}
	
	// clicking the item to b e purchased
	
	public void click_purchase(WebDriver driver) {
		driver.findElement(mobiidentity);
		
	}

}
