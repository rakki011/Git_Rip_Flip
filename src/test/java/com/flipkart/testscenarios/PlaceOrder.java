package com.flipkart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	
	
 
  @BeforeClass
  public void setupDriver() {
	  launchBrowser();
	  navigateToUrl();
	  
  }

  @AfterClass
  public void tearDown() {
  }

  @Test (priority = 0)
  public void validateLoginTest() {
  }
  
  @Test (priority = 1)
  public void validateSearchProductTest() {
  }
  
  @Test (priority = 2)
  public void validateSelectProductTest() {
  }
  
  
  @Test (priority = 3)
  public void validateAddToCartTest() {
  }
  
  @Test (priority = 4)
  public void validatePlaceOrderTest() {
  }
  
  @Test (priority = 5)
  public void validateMakePaymentTest() {
  }
  
  @Test (priority = 6)
  public void validateLogoutTest() {
  }
}
