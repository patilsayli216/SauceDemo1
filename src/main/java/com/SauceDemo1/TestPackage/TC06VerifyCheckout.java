package com.SauceDemo1.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.AddToCartPOMClass;
import com.SauceDemo.POMPackage.CheckoutPagePOMClass;
import com.SauceDemo.POMPackage.HomePOMClass;

public class TC06VerifyCheckout extends TestBase_Class
{
	@Test
	public void verifyCheckout()
	{
        HomePOMClass hp = new HomePOMClass(driver);
		
		hp.AddSauceProduct();
		System.out.println("Clicked on Bag product");
		
		AddToCartPOMClass cart = new AddToCartPOMClass(driver);
		cart.cartButton();
		System.out.println("Clicked on cart button");
		
		CheckoutPagePOMClass checkout = new CheckoutPagePOMClass(driver);
		checkout.checkoutButton();
		System.out.println("Clicked on checkout button");
		
		checkout.firstName();
		System.out.println("First name is entered");
		
		checkout.lastName();
		System.out.println("Last name is entered");
		
		checkout.pinCode();
		System.out.println("Pin code is entered");
		
		checkout.continueButton();
		System.out.println("Clicked on continue button");
		
		checkout.finishButton();
		System.out.println("Clicked on finish button");
	}

}
