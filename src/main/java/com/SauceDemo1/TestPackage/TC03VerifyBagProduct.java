package com.SauceDemo1.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;

public class TC03VerifyBagProduct extends TestBase_Class
{
	  @Test
      public void verifyBagProduct()
      {
		  HomePOMClass cart = new HomePOMClass(driver);
		  cart.AddSauceProduct();
		  System.out.println("Clicked on add to cart");
			
			//String totalProducts = cart.getTextFromCartButton();
			//String expectedProducts = "1";

      }
	
}
