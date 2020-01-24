package com.infy.unifiedHelper;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
    private final String propertyFilePath= "Configurations//config.properties";
	 
	 public ConfigReader(){
	 try {
		BufferedReader  reader = new BufferedReader(new FileReader(propertyFilePath));
	 //fis = new FileInputStream("/Users/sucbiswas/Desktop/suiteBuilding/Regression/RegressionSuite/src/config.properties");
	 properties = new Properties();
	 try {
	 properties.load(reader);
	 System.out.println(properties.getProperty("chrome"));
//	 reader.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
//	 throw new RuntimeException("Configuration.properties not found at " + "/Users/sucbiswas/Desktop/suiteBuilding/Regression/RegressionSuite/src/config.properties");
	 } 
	 }
	 
	 public String getChromeDriverPath(){
//		 ConfigFileReader();
	 String driverPath = properties.getProperty("chrome");
	 if(driverPath!= null) return driverPath;
	 else throw new RuntimeException("chrome not specified in the config.properties file."); 
	 }
	 
	 public String getFirefoxDriverPath(){
		 String driverPath = properties.getProperty("FireFox");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("firefox not specified in the config.properties file."); 
		 }
	 
	 public long getImplicitlyWait() { 
	 String implicitlyWait = properties.getProperty("implicitlyWait");
	 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
	 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	 }
	 
	 public String getApplicationUrl() {
	 String url = properties.getProperty("url");
	 if(url != null) return url;
	 else throw new RuntimeException("url not specified in the Configuration.properties file.");
	 }
	 public static void main(String[] args) {
		ConfigReader r= new ConfigReader();
		System.out.println(r.getChromeDriverPath());
	}
}
