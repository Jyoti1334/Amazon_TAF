package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
	
    /*
     * method to set wait till element present
     */
	public static WebElement waitForElementPresence(WebDriver driver, By selector, int  waitinterval) {
			WebElement element = (new WebDriverWait(driver, waitinterval).until(ExpectedConditions.presenceOfElementLocated(selector)));
					return element;
	}
	
}
