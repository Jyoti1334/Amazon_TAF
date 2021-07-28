package com.pageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Wrapper_Function;

public class AmazonBasicsPage {


 Wrapper_Function objWrapper_Function =new Wrapper_Function();
	
	By loc_hdr_amazonBasics=By.xpath("//div[@id='search']//following-sibling::span[@cel_widget_id='UPPER-RESULT_INFO_BAR-0']//following-sibling::h1//following-sibling::span[3]");
	By loc_hdr_fromOurBrand=By.xpath("//div[@id='p_n_feature_forty-seven_browse-bin-title']//following-sibling::span[contains(.,'From Our Brands')]");
	By loc_ckb_ourBrandsCheckBox=By.xpath("//li[@id='p_n_feature_forty-seven_browse-bin/21180942011']//following-sibling::i");
	By loc_btn_nextButton=By.xpath("//ul[@class='a-pagination']//following::li//child::a[contains(.,'Next')]");
	By loc_hdr_productHeader=By.xpath("//span[@id='productTitle']/text()");
	By loc_txt_8SheetsUnderSize=By.xpath("//p[text()='8 Sheet']");
	By loc_btn_addToCart=By.xpath("//input[@id='add-to-cart-button']");
	By loc_btn_cartButton=By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']");
	By loc_hdr_addedToCart=By.xpath("//div[@id='attachAddBaseItemSuccessAlert']//child::div//child::h4");
	By loc_listProducts=By.xpath("//div[@class='a-section a-spacing-medium']//h2//span");
	By loc_hdrProductName=By.xpath("//span[@id='productTitle']/parent::h1[@id='title' and contains(.,'Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon')]");
	By loc_btnNextPage = By.xpath("//a[contains(.,'Next')]"); 
	By loc_imgProduct= By.xpath("//img[@alt='Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon']");
	/*
	 * method to verify amazon basics header
	 */
	public void verifyHeaderAmazonBasics(){
		System.out.println("Verify Header on Amazon Basics under menu");
		Boolean verifyHdrAmazonBasics=objWrapper_Function.checkElementDisplayed(loc_hdr_amazonBasics);
		Assert.assertTrue(verifyHdrAmazonBasics);
		objWrapper_Function.setImplicitwait(2);
	}
	
	/*
	 * method to click on our brands chechbox
	 */
	public void clickOnOurBrandsCheckBox(){
		System.out.println("Verify From Our Brand");
		objWrapper_Function.scrollToViewElement(loc_hdr_fromOurBrand);
		Boolean verifyFromOurBrand=objWrapper_Function.checkElementDisplayed(loc_hdr_fromOurBrand);
		
		Assert.assertTrue(verifyFromOurBrand);
		objWrapper_Function.setImplicitwait(2);
		System.out.println("Click the checkbox of OurBrands");
		BaseTest.driver.findElement(loc_ckb_ourBrandsCheckBox).click();
	}
	
	/*
	 * method to check the product
	 */
	public void getAllProductList(){
        System.out.println("Enter into getproductlist");            
        do {
            List<WebElement> products = BaseTest.driver.findElements(loc_listProducts);
            int intProductSize = products.size();
            System.out.println("Product Size : "+intProductSize);
             for(WebElement product : products){
             System.out.println(product.getText());
             
             if(product.getText().equals("Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon")){
                 System.out.println("Enter in Got Product If Statement");
                 BaseTest.driver.findElement(loc_imgProduct).isDisplayed();
                 objWrapper_Function.scrollToViewElement(loc_imgProduct);
                 objWrapper_Function.setWaitForElementToBeClickable(60, loc_imgProduct);
                 break;
             }
            }
             
             if(this.isSelectedProductHeaderIsDisplayed())
                 break;
             else
                 this.clickOnNextPage();
                 
        } while (true);
        
     
}


		 public void clickOnNextPage(){
			 objWrapper_Function.setImplicitwait(10);
			 objWrapper_Function.scrollToViewElement(loc_btnNextPage);
		 BaseTest.driver.findElement(loc_btnNextPage).isDisplayed();
		 BaseTest.driver.findElement(loc_btnNextPage).click();
		 System.out.println("Click on next page: Next page gets loaded");
		 BaseTest.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		}
        
		 public boolean isSelectedProductHeaderIsDisplayed(){
			   boolean blnFlag=false;
			   try {
				   objWrapper_Function.setImplicitwait(3);
			       blnFlag = BaseTest.driver.findElement(loc_hdrProductName).isDisplayed();
			       return blnFlag;
			   } catch (Exception exception) {
			       return blnFlag;
			   }
			  
			}
	
	/*public void checkAmazonBasics8_SheetCapacityCross_CutPaperAndCreditCardShedder(){
		System.out.println("Check the product");
		String strProduct="Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon";		
				List<WebElement> allLinks=BaseTest.driver.findElements(By.tagName("a"));
    	int allLinksSize=allLinks.size();
    	System.out.println("All Link Size :" +allLinksSize);
    	for(WebElement link:allLinks){
    		System.out.println(link.getText());
    		
    		if(link.getText().equals(strProduct)) {
		        	link.click();
		            break;
		        }
    		
		        objWrapper_Function.scrollToViewElement(loc_btn_nextButton);
		        BaseTest.driver.findElement(loc_btn_nextButton).click();
		        continue;
    		 
		    }
		}*/
	
    /*
     * method to verify product header
     */
	public void verifyProductHeader(){
		System.out.println("Verify the product header");
		Boolean verifyHdrProduct=objWrapper_Function.checkElementDisplayed(loc_hdr_productHeader);
		Assert.assertTrue(verifyHdrProduct);
		objWrapper_Function.setImplicitwait(2);
	}
	
	
	/*
	 * method to verify 8 sheet under Size
	 */
	public void verify8SheetUnderSizeSection(){
		System.out.println("Verify 8 sheet in under size section");
		Boolean verify8SheetSize=objWrapper_Function.checkElementDisplayed(loc_txt_8SheetsUnderSize);
		Assert.assertTrue(verify8SheetSize);
		objWrapper_Function.setImplicitwait(2);
	}
	
	/*
	 * method to click on add to cart
	 */
	public void clickOnAddToCart(){
		System.out.println("CLick on add to cart button");
		BaseTest.driver.findElement(loc_btn_addToCart).click();
		objWrapper_Function.setImplicitwait(2);
	}
	
	
	/*
	 * method to verify Cart Iteam
	 */
	public void verifyCartIteam(){
		System.out.println("Verify header Added to cart");
		Boolean verifyHdrAddedToCart=objWrapper_Function.checkElementDisplayed(loc_hdr_addedToCart);
		Assert.assertTrue(verifyHdrAddedToCart);
		
		objWrapper_Function.setImplicitwait(2);
		
		System.out.println("Verify the cart button");
		Boolean verifyCartButton=objWrapper_Function.checkElementDisplayed(loc_btn_cartButton);
		Assert.assertTrue(verifyCartButton);
		
		objWrapper_Function.setImplicitwait(2);
	}
}
