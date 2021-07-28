package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Wrapper_Function;

public class HomePage {
	Wrapper_Function objWrapper_Function =new Wrapper_Function();
	
	
	By loc_logoAmazon=By.xpath("//div[@id='nav-logo']");
	By loc_txtAmazonBasics=By.xpath("//h2[text()='AmazonBasics']");
	By loc_lnk_seeMoreLink=By.xpath("//a[@href='/s?k=amazonbasics'  and text()='See more'] ");
	
	
	/*
	 * Method to verify logo
	 */
	public void verifyAmazonLogoOnHomePage(){
		System.out.println("Verify Amazon logo");
		Boolean verifyLogo=BaseTest.driver.findElement(loc_logoAmazon).isDisplayed();
		
		Assert.assertTrue(verifyLogo);
		objWrapper_Function.setImplicitwait(5);
	}
	
	/*
	 * Method to verify amazon basics 
	 */
	public void verifyAmazonBasicsOnHomePage(){
		System.out.println("Verify Amazon Basis on home page");
		Boolean verifyAmazonBasics=BaseTest.driver.findElement(loc_txtAmazonBasics).isDisplayed();
		Assert.assertTrue(verifyAmazonBasics);
		objWrapper_Function.setImplicitwait(5);
	}
	
	/*
	 * Method to click on see more link
	 */
	public void clickAmazonBasicsSeeMoreLink(){
		System.out.println("Click on see more link");
	    BaseTest.driver.findElement(loc_lnk_seeMoreLink).click();
	    objWrapper_Function.setImplicitwait(5);
	}
}
