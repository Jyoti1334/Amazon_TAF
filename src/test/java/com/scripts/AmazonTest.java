package com.scripts;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pageFactory.AmazonBasicsPage;
import com.pageFactory.HomePage;

public class AmazonTest extends BaseTest {

public HomePage objHomePage;
public AmazonBasicsPage objAmazonBasicsPage;
  
  @BeforeClass
  public void createObject() {
	  
	  objHomePage = new HomePage();
	  objAmazonBasicsPage=new AmazonBasicsPage();
  }

 

  
  @BeforeTest
  public void initialiseandSetupWebEnvironment() {    
             this.createObject();
            BaseTest.initialiseWebEnvironment();
            
          }

  @Test(priority=1)
  public void TCID_01_verifyHomePage() {
              
	  objHomePage.verifyAmazonLogoOnHomePage();
	  objHomePage.verifyAmazonBasicsOnHomePage();
	  objHomePage.clickAmazonBasicsSeeMoreLink();
	  
	  
  }
  
  @Test(priority=2)
  public void TCID_02_verifyAmazonBasics() {
  
	  objAmazonBasicsPage.verifyHeaderAmazonBasics();
	  objAmazonBasicsPage.clickOnOurBrandsCheckBox();
	  objAmazonBasicsPage.getAllProductList();
	  objAmazonBasicsPage.verifyProductHeader();
	  objAmazonBasicsPage.verify8SheetUnderSizeSection();
	  objAmazonBasicsPage.clickOnAddToCart();
	  objAmazonBasicsPage.verifyCartIteam();
  }
  
  
  
  
  
  
  
  @AfterTest
  public void closeDriver() {
     BaseTest.teardown();
  }
  
}
 




