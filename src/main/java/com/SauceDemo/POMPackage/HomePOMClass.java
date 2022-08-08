package com.SauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
    private WebDriver driver;

    public HomePOMClass(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver,this); 
    }
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement sideBar;
	
	public void sideBar()
	{
		sideBar.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void logoutButton()
	{
		logoutButton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement aboutUs;
	
	public void aboutButton()
	{
		aboutUs.click();
		String aboutUsTitle = driver.getTitle();
		System.out.println(aboutUsTitle);
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	public void filterList()
	{
		Select s = new Select(filter);
		s.selectByValue("az");
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement sauceProduct;
	
	public void AddSauceProduct()
	{
		sauceProduct.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allSauceProduct;
	
	public void AddAllSauceProduct()
	{
		for(WebElement product : allSauceProduct)
		{
			product.click();
		}
	}
	
  	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement cartButton;
	
	public String getTextFromCartButton()
	{
		String totalProducts = cartButton.getText();
		return totalProducts;
	}
	

	
	
	


}
