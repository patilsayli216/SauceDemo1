package com.SauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPOMClass 
{
	private WebDriver driver;
	
	public AddToCartPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	public void cartButton()
	{
		cart.click();
	}
	
	@FindBy(xpath="//button[text()='Remove']")
	private List<WebElement> removeAllproducts;
	
	public void remove()
	{
		for(WebElement product : removeAllproducts )
		{
			product.click();
		}
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelOrder;
	
	public void cancelOrder()
	{
		cancelOrder.click();
	}
	
	
	



}
