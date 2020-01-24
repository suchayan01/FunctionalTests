package com.infy.home.test.helpers.apparels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.infy.unifiedHelper.ConfigReader;

public class DriverInitialization {
	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	//@Parameters("browser")
	public void setup(String browser) throws Exception{
		System.out.println("setup");
		ConfigReader cg= new ConfigReader();
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver",cg.getFirefoxDriverPath() );
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",cg.getChromeDriverPath());
			//create chrome instance
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
//				else if(browser.equalsIgnoreCase("Edge")){
//					//set path to Edge.exe
//					System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
//					//create Edge instance
//					driver = new EdgeDriver();
//				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 public WebDriver getinstance() {
		 
		return driver;
		 
	 }
	

}
