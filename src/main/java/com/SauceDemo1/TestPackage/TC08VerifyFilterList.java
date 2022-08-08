package com.SauceDemo1.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;

public class TC08VerifyFilterList extends TestBase_Class
{
    @Test
	public void verifyFilter()
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.filterList();
		System.out.println("Filter is selected from list");
	}
}
