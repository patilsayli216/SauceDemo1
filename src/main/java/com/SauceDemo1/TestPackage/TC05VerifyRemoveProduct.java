package com.SauceDemo1.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.AddToCartPOMClass;

public class TC05VerifyRemoveProduct extends TestBase_Class
{
	@Test
	public void removeProducts()
	{
		AddToCartPOMClass at = new AddToCartPOMClass(driver);
		at.cartButton();
		System.out.println("Clicked on cart");
		
		at.remove();
		System.out.println("All products are remove");
	}

}
