package com.SauceDemo1.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyLogin extends TestBase_Class
{
	@Test
	public void verifyLogin()
	{
		String actualTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Login Successful");
	}
	

}
