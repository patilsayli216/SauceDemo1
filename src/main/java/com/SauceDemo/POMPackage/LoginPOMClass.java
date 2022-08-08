package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.UtilityPackage.Excelsheet;

public class LoginPOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

}
