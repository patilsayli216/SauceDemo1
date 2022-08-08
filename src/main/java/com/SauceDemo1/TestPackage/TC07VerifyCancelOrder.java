package com.SauceDemo1.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.AddToCartPOMClass;
import com.SauceDemo.POMPackage.CheckoutPagePOMClass;
import com.SauceDemo.POMPackage.HomePOMClass;

public class TC07VerifyCancelOrder extends TestBase_Class
{
	@Test
	public void verifyCancelOrder()
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.AddSauceProduct();
		System.out.println("Product is added to cart");
		
		AddToCartPOMClass at = new AddToCartPOMClass(driver);
		at.cartButton();
		System.out.println("Clicked on cart button");
		
		CheckoutPagePOMClass ct = new CheckoutPagePOMClass(driver);
		ct.checkoutButton();
		System.out.println("Clicked on checkout button");
		
		at.cancelOrder();
		System.out.println("Clicked on cancel order");
	}

}
