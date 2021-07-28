package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper_Function {
  
	
	/*
	 * method to set implicit wait
	 */
	public  void setImplicitwait(int intSecond){
		
 	   BaseTest.driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
	   }
  
   /*
   * method to check element displayed
   */
	public boolean checkElementDisplayed(By locator) {
		try {
			Utility.waitForElementPresence(BaseTest.driver, locator, 10);
			
			return BaseTest.driver.findElement(locator).isDisplayed();
		} catch (NotFoundException exception) {
			
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			return false;
		}
	}
	public void scrollToViewElement(By locator) { 
		try {                    
			JavascriptExecutor scroll = (JavascriptExecutor)BaseTest.driver;          
		WebElement Webelement = BaseTest.driver.findElement(locator);    
		scroll.executeScript("arguments[0].scrollIntoView(true);",Webelement);   
		}
		catch(Exception e) {
			e.printStackTrace();                 }}
	
	public void setWaitForElementToBeClickable(int intWait,By locator) { 
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.driver,intWait); 
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click(); 
			}catch(Exception e) {
				e.printStackTrace();                 }}
	
	/*
	 * Scroll element to view using javascript
	 */
	public boolean scrollToView(By locator) {
		try {
			Utility.waitForElementPresence(BaseTest.driver, locator, 10);
			WebElement webElement = BaseTest.driver.findElement(locator);
			((JavascriptExecutor) BaseTest.driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
}
