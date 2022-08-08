package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPagePOMClass 
{
	
	public CheckoutPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
    private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkout;

    public void checkoutButton()
	{
		checkout.click();
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;
	
	public void firstName()
	{
		firstName.sendKeys("Rahul");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	
	public void lastName()
	{
	  	lastName.sendKeys("Kumar");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pinCode;
	
	public void pinCode()
	{
		pinCode.sendKeys("453278");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	public void continueButton()
	{
		continueButton.click();
	}
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finishButton;
	
	public void finishButton()
	{
		finishButton.click();
	}
	


}
//firstname
//lastname
//postalcode
//cancel
//continue
//checkout message
//back to home page