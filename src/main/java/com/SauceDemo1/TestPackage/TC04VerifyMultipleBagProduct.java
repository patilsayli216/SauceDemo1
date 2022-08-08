package com.SauceDemo1.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.UtilityPackage.ScreenshotClass;

public class TC04VerifyMultipleBagProduct extends TestBase_Class
{
	@Test
	public void verifyAllBagProduct() throws IOException
	{
		HomePOMClass cart = new HomePOMClass(driver);
		cart.AddAllSauceProduct();
		System.out.println("Clicked on all products add to cart button");
		
		String totalProducts = cart.getTextFromCartButton();
		String expectedProducts = "6";
		
		Assert.assertEquals(totalProducts,expectedProducts);
	}

}
