package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	    public static  WebDriver driver=null;
	    private static  Properties objConfig;
	    
	   
	   /*
	    * to initialize Web Environment
	    */
	        
	        public  static void initialiseWebEnvironment() {
	        System.setProperty("webdriver.chrome.driver",
	                System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        loadConfig();
	        driver.get(objConfig.getProperty("AUT_URL"));
	         driver.manage().window().maximize();
	        }
	    
	    
	   /*
	    *  to load config file
	    */
	    public static void loadConfig() {
	          objConfig = new Properties();
	         
	            try {
	    InputStream input= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
	                objConfig.load(input);
	                
	            } catch (IOException e) {
	                System.out.println(e);
	            }
	  }

	 

	   /*
	    *  to close Browser
	    */
	public static void teardown() {
	       driver.close();
	        
	    }
}
