package com.infy.home.test.search;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.infy.home.test.helpers.apparels.DriverInitialization;
import com.infy.home.test.helpers.apparels.SearchBoxHelper;
import com.infy.unifiedHelper.ConfigReader;


public class SearchBox {
	 WebDriver driver;
	 ConfigReader cg = new ConfigReader();
  @BeforeTest
  public void setup() throws Exception {
	  
	  DriverInitialization d= new DriverInitialization();
	  d.setup("firefox");
	  driver=d.getinstance();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void ApparelSelection() {
	  SearchBoxHelper sbox= new SearchBoxHelper(driver);
	  System.out.println(cg.getApplicationUrl());
	  driver.get(cg.getApplicationUrl());
	  sbox.DropdownAllBtn();
	  System.out.println("1111");
  }
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
